package javajump8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class pg5 {

	public static void main(String[] args) {
		// pg13 �����ϰ� �а� ����
		try {
			// File�� �����ϸ鼭 ���� �����Ѵ�.
			File f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
			FileWriter fw = new FileWriter(f);	//������ ���Ͽ� ���� �������� FileWriter �����Ѵ�.
			
			fw.write("�ȳ� ����\n");	//�ȳ� ������ ���Ͽ� �ۼ��Ѵ�.
			fw.write("hello ���\n");	// hello ��θ� ���Ͽ� �ۼ��Ѵ�.
			
			fw.close();	//���� ����� �����Ѵ�.
			// ���� �б� ����� �������� FileReader
			FileReader fr = new FileReader(f);
			// while ���� ���� ���� ����
			int n = 0;
			// ���� �迭 ����
			char [] ch;
			// ���ѷ��� ����
			while(true) {
				ch = new char [100];	// ������ �迭 ũ�� 100 ����
				n = fr.read(ch);	// fileReader read�� �ϳ��� �о��, �� �߰��� ���� ������ -1 �� ��µȴ�.

				// ���� ������� while�� Ż�� (-1)
				if (n == -1)break;
				// ������ ���̸�ŭ ���� for�� �ۼ��ؼ� �޼��� ���
				for (int i = 0; i < n; i++) {
					System.out.printf("%c",ch[i]);
				}
			}
			// ����� fileReader����
			fr.close();
			// read �����ٰ� �޼��� ���
			System.out.printf("\n FILE READ END");
		} catch (Exception e) {
			// ������ ����� �޼��� ���
			System.out.printf("�� ����[%s]\n", e);
		}

	}

}
