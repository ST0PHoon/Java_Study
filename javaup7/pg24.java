package javajump7;

public class pg24 {

	public static void main(String[] args) {
		// pg24 �迭�� �ִ�,�ּҰ� ã��
		// ������ ������ ��� �迭 �غ� ��, �� �Է�
		int [] k37_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		// �� �ִ�, �ּ� ������ �迭�� ó�� ���� �־��ش�.
		int k37_iMax = k37_iArray[0], k37_iMin = k37_iArray[0];
		// �� �ִ�, �ּ��� ��ġ�� �˱����� ������ ���� ����
		int k37_iMaxPt = 0, k37_iMinPt = 0;
		// ���ڿ��� ���̸�ŭ ���� 0���� 1�������ϸ� �迭���� -1 ���� ����. �迭�� ��� ���� �湮
		for(int k37_i = 0; k37_i < k37_iArray.length; k37_i++) {
			//���� ���� k37_iMax ���� ū ���� ������, ���� ��ġ�� �޾ƿͶ�
			if(k37_iMax < k37_iArray[k37_i]) {
				k37_iMax = k37_iArray[k37_i];
				k37_iMaxPt = k37_iMax;
			}
			// ���� ���� k37_iMin ���� �������� ������ ���� ��ġ�� �޾ƿͶ�
			if(k37_iMin > k37_iArray[k37_i]) {
				k37_iMin = k37_iArray[k37_i];
				k37_iMinPt = k37_iMin;
			}
		}
		// �ִ� �ּ� ��ġ�� ���� ���� ���
		System.out.printf("MAX : k37_iArray[%d] = %d\n", k37_iMaxPt, k37_iMax);
		System.out.printf("MIN : k37_iArray[%d] = %d\n", k37_iMinPt, k37_iMin);
	}

}
