package algorithm.sort;


/**
 * @Des: TODO(冒泡排序
 * :发现最小就交换，每一轮循环结束后，最小值或者最大值放到最终位置)
 * @author hdp
 * @date 2017-1-10 上午10:09:28 
 */
public class BubbleSort {
	
	public void sort(int[] data){
			for(int i=0;i<data.length-1;i++){
				for (int j=i+1;j<data.length;j++){
					if(data[i]>=data[j]){
						data[i]=data[i]+data[j];
						data[j]=data[i]-data[j];
						data[i]=data[i]-data[j];
					}
				}
			}
	}
}
