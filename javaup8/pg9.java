package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg9 {

	public static void main(String[] args) throws IOException{
		// pg9		
		// �ش� ��ġ�� �ִ� ������ �����Ѵ�.
		File f = new File("C:\\Users\\kopo\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		//	BufferedReader �����  FileReader(������ ����) ���ؼ� �ǽ��Ѵ�.
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int LineCnt = 0;	// �׸���� �����ϱ� ���� ����
		int n =1;	// while���� ���������� ���� ������ ����
		
		// StringBuffer ����
		StringBuffer s = new StringBuffer();
		// ���۽ð��� �����ϱ� ���� currentTimeMillis ����
		long startTime = System.currentTimeMillis();
		// ������ 1000���� �б� ���� while�� �ۼ�, ��� �о����� �������´�.
		while(true) {
			// ���� ������ ���� �迭 1000ĭ ¥�� ����
			char [] ch = new char[1000];
			// BufferedReader�� �ش� ���� �迭�� �о�� n�� �ִ´�.
			n = br.read(ch);
			// n�� ���ڹ迭�� ������ -1 �� �ȴ�. �׸��� ������ while���� ���������� if�� �����Ѵ�.
			if(n == -1) break;
			// ch ������ �ϳ��ϳ� c�� �־ ������ for�� �ۼ�
			for(char c :ch) {
				if(c=='\n') {	// �ٹٲ� ǥ�ð� �������� �޼��� ���
					System.out.printf("[%s]****\n",s.toString());	// StringBuffer�� ���ڿ��� �ٲ㼭 ���
					s.delete(0,s.length());	//StringBuffer�� �ʱ�ȭ�Ѵ�.
				} else {
					s.append(c);	//StringBuffer�� c�� ���ڸ� �߰��Ѵ�.
				}
			}
			LineCnt++;	// ���� ���� ī��Ʈ�ϱ� ���� +1
		}
		System.out.printf("[%s]****\n",s.toString());	// ������ s �� ���
		
		long finishTime = System.currentTimeMillis();	//������ �ð� ���
        long elapsedTime = finishTime - startTime;	//������ �ð��� ó���ð��� ���̷� ������ �ð��� ����Ѵ�.
        // �ð��� ���� �׸�� ��� ����
        System.out.println("startTime(ms) : " + startTime);
        System.out.println("finishTime(ms) : " + finishTime);
        System.out.println("elapsedTime(ms) : " + elapsedTime);
        System.out.println("�� �׸� ���� : " + LineCnt);
		// BufferedReader�� �����Ѵ�.
		br.close();
	}

}
