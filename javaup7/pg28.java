package javajump7;

import java.util.ArrayList;

public class pg28 {

	public static void main(String[] args) {
		// pg28 ArrayList 2
		int k37_iTestMAX = 10;	// �Է��� ���� ���� ���Ѵ�. ������ ���� ����
		ArrayList k37_iAL = new ArrayList();	// ��� ����Ʈ�� �����Ѵ�.
		//�Է� ���� ���ڸ�ŭ ���� for�� �ۼ� (0 ���� 999999���� ����)
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			//0���� 999999������ ������ ���� �߰��Ѵ�. ��� ����Ʈ�� �߰�
			k37_iAL.add((int)(Math.random()*1000000));
		}
		//�Է� ���� ���ڸ�ŭ ���� for�� �ۼ� (0 ���� 999999���� ����)
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			//��� ����Ʈ �迭�� ��ġ�� �ش� ���� ����Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
		//�Է� ���� ���ڸ�ŭ ���� for�� �ۼ� (0 ���� 999999���� ����)
		System.out.println("*********************************");
		k37_iAL.sort(null);	//������������ ����

		for(int k37_i = 0; k37_i < k37_iAL.size(); k37_i++) {
			//��� ����Ʈ �迭�� ��ġ�� �ش� ���� ����Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
	}

}
