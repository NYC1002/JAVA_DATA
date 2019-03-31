package io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Test...");
		nio1();
	}

	private static void io1() {
		try (OutputStream outputStream = new FileOutputStream("../test1.txt")) {
			outputStream.write('f');
			outputStream.write('d');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void io2() {
		try (InputStream inputStream = new FileInputStream("../test1.txt")) {
			System.out.println((char) inputStream.read());
			System.out.println((char) inputStream.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void io3() {
		try (InputStream inputStream = new FileInputStream("../test1.txt")) {
			Reader reader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println(bufferedReader.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void io4() {
		try (OutputStream outputStream = new FileOutputStream("../test1.txt")) {
			Writer writer = new OutputStreamWriter(outputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write('5');
			bufferedWriter.write('3');
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private static void io5() {
		try (InputStream inputStream = new FileInputStream("../test1.txt");
				OutputStream outputStream = new FileOutputStream("../test1_new.txt")) {
			byte[] buffer = new byte[1024];
			int readCount;
			while ((readCount = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, readCount);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * 启动telnet客户端方法
	 * telnet localhost 8080
	 */
	private static void io6() {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			Socket socket = serverSocket.accept();
			System.out.println("客户端连接进来了....");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String data = null;
			while ((data = bufferedReader.readLine()) != null) {
				bufferedWriter.write("data:back"+data);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void nio1() {
		try {
			RandomAccessFile randomAccessFile=new RandomAccessFile("../test1.txt", "r");
			FileChannel channel=randomAccessFile.getChannel();
			ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
			channel.read(byteBuffer);
			byteBuffer.flip();
			System.out.println(Charset.defaultCharset().decode(byteBuffer));
			byteBuffer.clear();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
