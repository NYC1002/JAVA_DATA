package algorithm.sort;

/**
 * @Des: TODO(��������)
 * @author hdp ���������˼���е�����˿�ץ�Ƶ�ʱ�����ǲ����˿��Ƶ�����������һ�£�ץ��ʱ�����Ƕ��ǰ�ץ�����ư�˳��������С����ÿץһ�����ƣ�
 *         ���Ƕ�������뵽���е��ź�������Ƶ��У�ע�����ղŵ��Ǿ仰��Ҳ����˵�����������˼���ǣ���������Ԫ�ذ�˳�����һ�����е��������е��С�
 * 
 *         �ٸ����ӿ��ܸ���������һЩ������������һϵ�����֣�8 2 4 9 3 6
 *         �������ǿ�������2�������������ֲ����ڣ�����ֻ��һ��8����ץ����2������ô��Ȼ2Ӧ�÷���8��ǰ�档 ����2 8 4 9 3 6
 *         ��ץ����һ��4�����ڴ�Ҷ�֪��Ӧ����ô���˰ɣ� ����2 4 8 9 3 6 �����˸�9��û�������ò��û�˳�� ����2 4 8 9 3 6
 *         ͬ���ĵ���������3�÷ŵ�λ�ã���Ȼ����2��4���м� ����2 3 4 8 9 6 ���һ��Ҳ��һ�������õ���С��������� ����2 3 4
 *         6 8 9 �������
 * @date 2017-1-18 ����11:27:17
 */
public class InsertSort {

	public void sort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			int key = data[i];				//�����i��Ԫ��key
			int j = i - 1;						//���뵽ǰ��λ��
			while (j >= 0 && data[j] > key) {			//����jҪע��>=0,Ϊ0ʱ�Ե�һ��Ԫ�ؽ�������
				data[j + 1] = data[j];					//��key���Ԫ�غ���
				j--;
			}
			data[j + 1] = key;		//��j��Ԫ����<=key�ģ���key��λ�þͷ�����j+1
		}
	}
}