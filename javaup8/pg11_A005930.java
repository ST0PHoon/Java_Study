package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg11_A005930 {

	public static void main(String[] args) throws IOException {
		// pg11 �������� A005930
		// ������ ��ġ�� ������ File f�� �����ϴ�.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		// BufferedReader �� br�� �����Ѵ�. FileReader- �б�(������ ����) �� ���Ͽ�
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		// �ش� ��ġ�� ������ ���ϸ����� �����Ѵ�.
		// BufferedReader �� br�� �����Ѵ�. FileReader- �ۼ�(������ ����) �� ���Ͽ�
		File k37_f1 = new File("C:\\Users\\kopo\\Desktop\\A005930.csv");
		// BufferedWriter�� bw1�� ���� FileWriter - �ۼ� (������ ����) �� ���Ͽ�
		BufferedWriter k37_bw1 = new BufferedWriter (new FileWriter(k37_f1));
			
		String k37_readtxt;	//���ڿ� ���� ����
		// cnt �� wcnt ����
		int k37_cnt = 0; int k37_wcnt = 0;
		// ���۽ð��� �����ϱ� ���� currentTimeMillis ����
		long k37_startTime = System.currentTimeMillis();
		// ���� ������� while�� Ż�⼱��		
		while((k37_readtxt =k37_br.readLine()) != null) {
			// StringBuffer�� s �� �����Ѵ�.
			StringBuffer s = new StringBuffer();
			// readtxt�� %_%�� �������� �߶� ���ڿ� �迭�� �ִ´�.
			String[] k37_field = k37_readtxt.split("%_%");
			// �� �ʵ忡�� ^�� ������ ����, trim(�յ� ��������), substring���� 1��° ���ڸ� ����, A�� ������
			if(k37_field.length > 2 && k37_field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
				s.append(k37_field[0].replace("^","").trim());	//s�� field�� ù��° ���ڿ�, ^�� �����ϰ� �յ� ������ �߶� �߰��ض�
				for (int k37_j = 1; k37_j < k37_field.length; k37_j++) {	// 1���� field�� ���̸�ŭ ���� for�� �ۼ�
					s.append("," + k37_field[k37_j].replace("^", "").trim());	//s��  , + ^�� ���� ���ڿ��� �߰��ض� (�յ� ���鵵 ����)
				}
				k37_bw1.write(s.toString()); k37_bw1.newLine();	//bw1�� s�� ���ڿ��� �ۼ��ϰ� �ٹٲ��� �����ض�
				k37_wcnt++;	// ���� ���� +1
 			}
			k37_cnt++; // �� ���� ���� +1
		}
		
		long k37_finishTime = System.currentTimeMillis();	//������ �ð� ���
        long k37_elapsedTime = k37_finishTime - k37_startTime;	//������ �ð��� ó���ð��� ���̷� ������ �ð��� ����Ѵ�.
        // �ð��� ���� �׸�� ��� ����
        System.out.println("startTime(ms) : " + k37_startTime);
        System.out.println("finishTime(ms) : " + k37_finishTime);
        System.out.println("elapsedTime(ms) : " + k37_elapsedTime);
        System.out.println("�� �׸� ���� : " + k37_cnt);
        System.out.println("�����ڵ� A005930�� �����ϴ� �׸� ���� : " + k37_wcnt);
		// BufferedReader, BufferedWriter ���� ����
		k37_br.close();
		k37_bw1.close();
		
//		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

	}

}
