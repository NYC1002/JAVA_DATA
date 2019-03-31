package algorithm.sort;

/**
 * @Des: TODO(选择排序： 选择排序和冒泡排序差不多，只是冒泡排序在发现比它小的时候就交换，而选择排序是只有在确定了最小的数据之后，才会发生交换。
 *       选择排序的基本思想：第i趟简单选择排序是指通过n-i次关键字的比较，从n-i+1个记录中选出关键字最小的记录，
 *       并和第i个记录进行交换。先临时记录其位置，只有在一趟 循环完以后确定了最小的数据，才会发生交换。)
 * @author hdp
 * @date 2017-1-16 下午1:56:09
 */
public class SelectSort {
	public void sort(int[] data) {
		if (data == null || data.length <= 0) {
			return;
		}
		for (int i = 0; i < data.length; i++) {
			int min = i; /* 将当前下标定义为最小值小标 */

			for (int j = i + 1; j < data.length; j++) {
				if (data[min] > data[j]) { /* 如果有小于当前最小值的关键字 */
						min=j;
				}
			}
			if(i!=min){	/*如果min!=i,则说明找到最小值，交换*/
				int temp=data[min];
				data[min]=data[i];
				data[i]=temp;
			}
		}
	}
}
