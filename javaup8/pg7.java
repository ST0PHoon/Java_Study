package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg7 {

	public static void main(String[] args) throws IOException {
		// pg7 ���� ���Ͽ� ����
		// �ش� ��ġ�� �ִ� 12_04_07_E_��������������� ������ �����Ѵ�.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������.csv");
		// BufferedReader�� FileReader(f)�� ���Ͽ� �����Ѵ�. (�б�)
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// ���ڿ� ������ �����Ѵ�.
		String k37_readtxt;
		// ó�� �޾ƿ� ���� ��������� "�� ���� �Դϴ�"�� ����Ѵ�.
		if((k37_readtxt = k37_br.readLine()) ==null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		// �޾ƿ� ������ ù���� �޸� ������ ������ ���ڿ� �迭�� �ִ´�.
		String[] k37_field_name = k37_readtxt.split(",");
		// �׸��� �����ϱ� ���� ī���Ϳ� ������ ���� ����
		int k37_LineCnt = 0;
		// �о�� ���� ���� �������� ���� while�� ����
		while((k37_readtxt = k37_br.readLine()) != null) {
			// �޾ƿ� �׸��� , ������ �߶� field�迭�� �ִ´�.
			String[] k37_field = k37_readtxt.split(",");
			// ���� ���° �׸����� �����ش�.
			System.out.printf("**[%d��° �׸�]********************\n", k37_LineCnt);
			// ���� �ʵ��� ���̸�ŭ ���� for�� �ۼ�
			for (int k37_j = 0; k37_j < k37_field_name.length; k37_j++) {
				//�ʵ� �̸��� �ʵ� ������ ����Ѵ�.
				System.out.printf("%s : %s\n",k37_field_name[k37_j], k37_field[k37_j]);
			}
			System.out.printf("***********************************\n");
			// 100���� �� �����Ѵ�.
			if(k37_LineCnt == 100)break;
			// �׸�� counter +1;
			k37_LineCnt++;
		}
		// BufferedReader ����
		k37_br.close();

	}

}
