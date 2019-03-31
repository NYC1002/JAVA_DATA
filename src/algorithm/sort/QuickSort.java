package algorithm.sort;

/**
 * @Des: TODO(��������
 * ����˼�룺ѡ��һ����׼Ԫ��,ͨ��ѡ���һ��Ԫ�ػ������һ��Ԫ��,ͨ��һ��ɨ�裬
 * ���������зֳ�������,һ���ֱȻ�׼Ԫ��С,һ���ִ��ڵ��ڻ�׼Ԫ��,
 * ��ʱ��׼Ԫ�������ź�������ȷλ��,Ȼ������ͬ���ķ����ݹ�����򻮷ֵ������֡�)
 * @author yisper
 * @date 2019-2-1 ����15:35
 */
public class QuickSort {
	
	
	public void sort(int data[],int low,int high){
		if(low<high){
				int middle=getMiddle(data,low,high);    //��list�������һ��Ϊ��  
				sort(data,low,middle-1);				//�Ե��ֱ���еݹ�����    
				sort(data,middle+1,high);				 //�Ը��ֱ���еݹ�����     
		}
		
	}
	
	/**
	 * �ҵ������λ�ã�����ʹ�������߶�������С��������ұ߶��������
	 * @param data
	 * @param low
	 * @param high
	 * @return	�����λ��
	 */
	public int getMiddle(int[] data ,int low,int high){
		int temp=data[low];		//Ĭ������Ϊ��׼ֵ
		while(low<high){
			while(low<high&&data[high]>=temp){
				high--;
			}
			data[low]=data[high];		//�Ȼ�׼С���ƶ�����ߣ���֤��׼��ߵĶ�������С
			while(low<high&&data[low]<=temp){
				low++;
			}
			data[high]=data[low];		//�Ȼ�׼����ƶ����ұߣ���֤�Ȼ�׼�ұߵĶ��������
		}
		data[high]=temp;		//���low=high,���ֽ�������׼ֵ�ƶ�Ŀ�ĵ�
		return high;				//���������λ��
	}
}
