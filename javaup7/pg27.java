package javajump7;

import java.util.ArrayList;

public class pg27 {

	public static void main(String[] args) {
		// pg27
		// ArrayList ����
		ArrayList k37_iAl = new ArrayList();
		
		k37_iAl.add("abc");	// ������ ����Ʈ�� "abc" �߰�
		k37_iAl.add("abcd");	// ������ ����Ʈ�� "abcd" �̾ �߰�
		k37_iAl.add("egag");	// ������ ����Ʈ�� "egag" �̾ �߰�
		k37_iAl.add("������0");	// ������ ����Ʈ�� "������0" �̾ �߰�
		k37_iAl.add("1234");	// ������ ����Ʈ�� "1234" �̾ �߰�
		k37_iAl.add("12rk34");	// ������ ����Ʈ�� "12rk34" �̾ �߰�
		
		System.out.println("********************************");
		System.out.printf(" ���� ArraySize %d \n", k37_iAl.size());	// ó�� ����Ʈ�� ����� ���
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// ����Ʈ�� �迭��ŭ ���� for�� ����
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//�迭�� ��ġ�� ���� ���
		}
		
		k37_iAl.set(3, "������");	//4��°��ġ(3��°�迭)�� ������ �߰��Ѵ�. ������ �ϳ� ����
		System.out.println("********************************");
		System.out.printf(" ���뺯�� ArraySize %d \n", k37_iAl.size());	// ������ ����Ʈ�� ����� ���
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// ����Ʈ�� �迭��ŭ ���� for�� ����
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//�迭�� ��ġ�� ���� ���
		}
		
		
		k37_iAl.remove(4);	// 5��°��ġ(4��°�迭)�� ���� �����Ѵ�. 1234 �����ϴ� �ڵ�
		System.out.println("********************************");
		System.out.printf(" ���뺯��2 ArraySize %d \n", k37_iAl.size());	// ������ ����Ʈ�� ����� ���
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// ����Ʈ�� �迭��ŭ ���� for�� ����
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//�迭�� ��ġ�� ���� ���
		}
		
		k37_iAl.sort(null);	// ���빰�� ���������Ѵ�.
		System.out.println("********************************");
		System.out.printf(" ����ƮSort ArraySize %d \n", k37_iAl.size());	// ������ ����Ʈ�� ����� ���
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// ����Ʈ�� �迭��ŭ ���� for�� ����
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//�迭�� ��ġ�� ���� ���
		}
		
		k37_iAl.clear();	//����Ʈ�� �ʱ�ȭ�Ѵ�. ���� 0
		System.out.println("********************************");
		System.out.printf(" ���λ��� ArraySize %d \n", k37_iAl.size());	// ������ ����Ʈ�� ����� ���
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// ����Ʈ�� �迭��ŭ ���� for�� ����
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//�迭�� ��ġ�� ���� ���
		}
		
	}

}
