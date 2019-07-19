package algorithm.stackandqueue;

import java.util.LinkedList;

public class GetMaxWindow {

	public static void main(String[] args) {
		int[]array=new int[] {
				2,3,6,7,2,12,2,34,2,2,36,7,9,90,32
		};
		print(getMaxWindow(array, 3));
	}
	
	private static void print(int[]array) {
		System.out.println("�����󴰿ڣ�");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] getMaxWindow(int[] arr,int window) {
		if(arr==null||arr.length<window||window<1) {
			return null;
		}
		LinkedList<Integer>qmax=new LinkedList<Integer>();
		int[] result=new int[arr.length-window+1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			while(!qmax.isEmpty()&&arr[qmax.peekLast()]<arr[i]) {
				//������β
				qmax.pollLast();
			}
			//�����β
			qmax.addLast(i);
			if(qmax.peekFirst()==i-window) {
				qmax.pollFirst();
			}
			if(i>=window-1) {
				result[index++]=arr[qmax.peekFirst()];
			}
		}
		return result;
	}
}
