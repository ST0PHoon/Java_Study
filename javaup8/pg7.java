package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg7 {

	public static void main(String[] args) throws IOException {
		// pg7 ���� ���Ͽ� ����
		// �ش� ��ġ�� �ִ� 12_04_07_E_��������������� ������ �����Ѵ�.
		File f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������.csv");
		// BufferedReader�� FileReader(f)�� ���Ͽ� �����Ѵ�. (�б�)
		BufferedReader br = new BufferedReader (new FileReader(f));
		// ���ڿ� ������ �����Ѵ�.
		String readtxt;
		// ó�� �޾ƿ� ���� ��������� "�� ���� �Դϴ�"�� ����Ѵ�.
		if((readtxt = br.readLine()) ==null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		// �޾ƿ� ������ ù���� �޸� ������ ������ ���ڿ� �迭�� �ִ´�.
		String[] field_name = readtxt.split(",");
		// �׸��� �����ϱ� ���� ī���Ϳ� ������ ���� ����
		int LineCnt = 0;
		// �о�� ���� ���� �������� ���� while�� ����
		while((readtxt = br.readLine()) != null) {
			// �޾ƿ� �׸��� , ������ �߶� field�迭�� �ִ´�.
			String[] field = readtxt.split(",");
			// ���� ���° �׸����� �����ش�.
			System.out.printf("**[%d��° �׸�]********************\n", LineCnt);
			// ���� �ʵ��� ���̸�ŭ ���� for�� �ۼ�
			for (int j = 0; j < field_name.length; j++) {
				//�ʵ� �̸��� �ʵ� ������ ����Ѵ�.
				System.out.printf("%s : %s\n",field_name[j], field[j]);
			}
			System.out.printf("***********************************\n");
			// 100���� �� �����Ѵ�.
			if(LineCnt == 100)break;
			// �׸�� counter +1;
			LineCnt++;
		}
		// BufferedReader ����
		br.close();

	}

}
