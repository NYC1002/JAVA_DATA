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
		System.out.println("输出最大窗口：");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
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
			while(!qmax.isEmpty()&&qmax.peekLast()<arr[i]) {
				//弹出队尾
				qmax.pollLast();
			}
			//加入队尾
			qmax.addLast(i);
			if(qmax.peekFirst()==i-window) {
				qmax.pollFirst();
			}
			if(i>=window-1) {
				result[index++]=qmax.peekFirst();
			}
		}
		return result;
	}
}
