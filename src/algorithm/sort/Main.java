package algorithm.sort;


/**
 * @Des: TODO(ÃèÊö)
 * @author hdp
 * @date 2017-1-10 ÉÏÎç10:09:35
 */
public class Main {
	public static void main(String args[]) {

		int[] data = new int[] { 123, 12, 23, 15, 6, 76, 585, 8, 8, 86, 87,
				3446 };
//		new BubbleSort().sort(data);
//		new SelectSort().sort(data);
		new QuickSort().sort(data,0,data.length-1);
//		new InsertSort().sort(data);
		print(data);
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
