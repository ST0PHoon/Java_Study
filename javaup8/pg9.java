package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg9 {

	public static void main(String[] args) throws IOException{
		// pg9		
		// �ش� ��ġ�� �ִ� ������ �����Ѵ�.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		//	BufferedReader �����  FileReader(������ ����) ���ؼ� �ǽ��Ѵ�.
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		String readtxt;
		int k37_LineCnt = 0;	// �׸���� �����ϱ� ���� ����
		int k37_n =1;	// while���� ���������� ���� ������ ����
		// StringBuffer ����
		StringBuffer k37_s = new StringBuffer();
		// ������ 1000���� �б� ���� while�� �ۼ�, ��� �о����� �������´�.
		while(true) {
			// ���� ������ ���� �迭 1000ĭ ¥�� ����
			char [] k37_ch = new char[1000];
			// BufferedReader�� �ش� ���� �迭�� �о�� n�� �ִ´�.
			k37_n = k37_br.read(k37_ch);
			// n�� ���ڹ迭�� ������ -1 �� �ȴ�. �׸��� ������ while���� ���������� if�� �����Ѵ�.
			if(k37_n == -1) break;
			// ch ������ �ϳ��ϳ� c�� �־ ������ for�� �ۼ�
			for(char k37_c :k37_ch) {
				if(k37_c=='\n') {	// �ٹٲ� ǥ�ð� �������� �޼��� ���
					System.out.printf("[%s]****\n",k37_s.toString());	// StringBuffer�� ���ڿ��� �ٲ㼭 ���
//					System.out.printf("*\n");
					k37_s.delete(0,k37_s.length());	//StringBuffer�� �ʱ�ȭ�Ѵ�.
				} else {
					k37_s.append(k37_c);	//StringBuffer�� c�� ���ڸ� �߰��Ѵ�.
				}
			}
			k37_LineCnt++;	// ���� ���� ī��Ʈ�ϱ� ���� +1
		}
		System.out.printf("[%s]****\n",k37_s.toString());	// ������ s �� ���
		k37_br.close();
	}

}
