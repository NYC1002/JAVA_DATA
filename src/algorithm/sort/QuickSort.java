package algorithm.sort;

/**
 * @Des: TODO(快速排序）
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，
 * 将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。)
 * @author yisper
 * @date 2019-2-1 下午15:35
 */
public class QuickSort {
	
	
	public void sort(int data[],int low,int high){
		if(low<high){
				int middle=getMiddle(data,low,high);    //将list数组进行一分为二  
				sort(data,low,middle-1);				//对低字表进行递归排序    
				sort(data,middle+1,high);				 //对高字表进行递归排序     
		}
		
	}
	
	/**
	 * 找到中轴的位置，并且使中轴的左边都比中轴小，中轴的右边都比中轴大
	 * @param data
	 * @param low
	 * @param high
	 * @return	中轴的位置
	 */
	public int getMiddle(int[] data ,int low,int high){
		int temp=data[low];		//默认最左为基准值
		while(low<high){
			while(low<high&&data[high]>=temp){
				high--;
			}
			data[low]=data[high];		//比基准小的移动到左边，保证基准左边的都比中轴小
			while(low<high&&data[low]<=temp){
				low++;
			}
			data[high]=data[low];		//比基准大的移动到右边，保证比基准右边的都比中轴大
		}
		data[high]=temp;		//最后low=high,此轮结束，基准值移动目的地
		return high;				//返回中轴的位置
	}
}
