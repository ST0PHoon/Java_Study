package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg11_MaxMin {


	public static void main(String[] args) throws IOException {
		// pg11 20120120�� ��
		// ������ ��ġ�� ������ File f�� �����ϴ�.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		// BufferedReader �� br�� �����Ѵ�. FileReader- �б�(������ ����) �� ���Ͽ�
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		// �ش� ��ġ�� ������ ���ϸ����� �����Ѵ�.
		// BufferedReader �� br�� �����Ѵ�. FileReader- �ۼ�(������ ����) �� ���Ͽ�
		File k37_f1 = new File("C:\\Users\\kopo\\Desktop\\Date2015Samsumg.csv");
		// BufferedWriter�� bw1�� ���� FileWriter - �ۼ� (������ ����) �� ���Ͽ�
		BufferedWriter k37_bw1 = new BufferedWriter (new FileWriter(k37_f1));
			
		String k37_readtxt;	//���ڿ� ���� ����
		int k37_max = 0;
		int k37_min = 0;
		String k37_maxdate = "";
		String k37_mindate = "";
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
			if(k37_field.length > 2 && k37_field[1].replace("^", "").trim().substring(0, 4).equals("2015") &&
					k37_field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
				s.append(k37_field[0].replace("^","").trim());	//s�� field�� ù��° ���ڿ�, ^�� �����ϰ� �յ� ������ �߶� �߰��ض�
				for (int j = 1; j < k37_field.length; j++) {	// 1���� field�� ���̸�ŭ ���� for�� �ۼ�
					s.append("," + k37_field[j].replace("^", "").trim());	//s��  , + ^�� ���� ���ڿ��� �߰��ض� (�յ� ���鵵 ����)
				}
				k37_bw1.write(s.toString()); k37_bw1.newLine();	//bw1�� s�� ���ڿ��� �ۼ��ϰ� �ٹٲ��� �����ض�
				
				if (k37_wcnt == 0) {	// ���ǿ� �´� ù��° ����
					k37_max = Integer.parseInt(k37_field[3].replace("^","").trim()); // ���ڿ����� ^123^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ	(�ִ�)
					k37_min = Integer.parseInt(k37_field[3].replace("^","").trim()); // ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ	(�ּ�)
					k37_maxdate = k37_field[1].replace("^", "").trim();	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ
					k37_mindate = k37_field[1].replace("^", "").trim();	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ
				} else {
					if(k37_max <  Integer.parseInt(k37_field[3].replace("^","").trim())) {	// �ִ� ����
						k37_max = Integer.parseInt(k37_field[3].replace("^","").trim());	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ (�ִ�)
						k37_maxdate = k37_field[1].replace("^", "").trim();	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ (�ִ� ��ġ)
					}
					if(k37_min > Integer.parseInt(k37_field[3].replace("^","").trim())) {	// �ּ� ����
						k37_min = Integer.parseInt(k37_field[3].replace("^","").trim());	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ (�ּ�)
						k37_mindate = k37_field[1].replace("^", "").trim();	// ���ڿ����� ^ ^�� �����ϰ� �糡 ������ ���� ��, ������ ��ȯ (�ּ� ��ġ)
					}
				}
				
				k37_wcnt++;	// ���� ���� +1
 			}
			k37_cnt++; // �� ���� ���� +1
		}
		
		long k37_finishTime = System.currentTimeMillis();	//������ �ð� ���
        long k37_elapsedTime = k37_finishTime - k37_startTime;	//������ �ð��� ó���ð��� ���̷� ������ �ð��� ����Ѵ�.
        // �ð��� ���� �׸�� ��� ����
        System.out.println("startTime(ms) : " + (k37_startTime));
        System.out.println("finishTime(ms) : " + (k37_finishTime));
        System.out.println("elapsedTime(�ɸ��½ð�) : " + (k37_elapsedTime) / 60000 + "��" + (int)(k37_elapsedTime / 1000) % 60 + "��");
        System.out.println("�� �׸� ���� : " + k37_cnt);
        System.out.println("�����ڵ� 2015�� �̸鼭 �Ｚ�ֽ��� �׸� ���� : " + k37_wcnt);
        
        System.out.println("�ִ� �ֽ��Ѱ� : " + k37_max + "\n" + k37_maxdate);
        System.out.println("�ּ� �ֽ��Ѱ� : " + k37_min + "\n" + k37_mindate);
        
		// BufferedReader, BufferedWriter ���� ����
		k37_br.close();
		k37_bw1.close();
		
//		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

	}


}










