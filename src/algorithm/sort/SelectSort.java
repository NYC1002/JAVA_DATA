package algorithm.sort;

/**
 * @Des: TODO(ѡ������ ѡ�������ð�������ֻ࣬��ð�������ڷ��ֱ���С��ʱ��ͽ�������ѡ��������ֻ����ȷ������С������֮�󣬲Żᷢ��������
 *       ѡ������Ļ���˼�룺��i�˼�ѡ��������ָͨ��n-i�ιؼ��ֵıȽϣ���n-i+1����¼��ѡ���ؼ�����С�ļ�¼��
 *       ���͵�i����¼���н���������ʱ��¼��λ�ã�ֻ����һ�� ѭ�����Ժ�ȷ������С�����ݣ��Żᷢ��������)
 * @author hdp
 * @date 2017-1-16 ����1:56:09
 */
public class SelectSort {
	public void sort(int[] data) {
		if (data == null || data.length <= 0) {
			return;
		}
		for (int i = 0; i < data.length; i++) {
			int min = i; /* ����ǰ�±궨��Ϊ��СֵС�� */

			for (int j = i + 1; j < data.length; j++) {
				if (data[min] > data[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */
						min=j;
				}
			}
			if(i!=min){	/*���min!=i,��˵���ҵ���Сֵ������*/
				int temp=data[min];
				data[min]=data[i];
				data[i]=temp;
			}
		}
	}
}
