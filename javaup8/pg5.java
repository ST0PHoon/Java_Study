package javajump8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class pg5 {

	public static void main(String[] args) {
		// pg13 �����ϰ� �а� ����
		try {
			// File�� �����ϸ鼭 ���� �����Ѵ�.
			File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
			FileWriter k37_fw = new FileWriter(k37_f);	//������ ���Ͽ� ���� �������� FileWriter �����Ѵ�.
			
			k37_fw.write("�ȳ� ����\n");	//�ȳ� ������ ���Ͽ� �ۼ��Ѵ�.
			k37_fw.write("hello ���\n");	// hello ��θ� ���Ͽ� �ۼ��Ѵ�.
			
			k37_fw.close();	//���� ����� �����Ѵ�.
			// ���� �б� ����� �������� FileReader
			FileReader k37_fr = new FileReader(k37_f);
			// while ���� ���� ���� ����
			int k37_n = 0;
			// ���� �迭 ����
			char [] k37_ch;
			// ���ѷ��� ����
			while(true) {
				k37_ch = new char [100];	// ������ �迭 ũ�� 100 ����
				k37_n = k37_fr.read(k37_ch);	// fileReader read�� �ϳ��� �о��, �� �߰��� ���� ������ -1 �� ��µȴ�.

				// ���� ������� while�� Ż�� (-1)
				if (k37_n == -1)break;
				// ������ ���̸�ŭ ���� for�� �ۼ��ؼ� �޼��� ���
				for (int k37_i = 0; k37_i < k37_n; k37_i++) {
					System.out.printf("%c",k37_ch[k37_i]);
				}
			}
			// ����� fileReader����
			k37_fr.close();
			// read �����ٰ� �޼��� ���
			System.out.printf("\n FILE READ END");
		} catch (Exception k37_e) {
			// ������ ����� �޼��� ���
			System.out.printf("�� ����[%s]\n", k37_e);
		}

	}

}
