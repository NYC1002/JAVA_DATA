package algorithm.sort;


/**
 * @Des: TODO(ð������
 * :������С�ͽ�����ÿһ��ѭ����������Сֵ�������ֵ�ŵ�����λ��)
 * @author hdp
 * @date 2017-1-10 ����10:09:28 
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
