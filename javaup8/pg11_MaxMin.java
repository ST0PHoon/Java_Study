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
		File f = new File("C:\\Users\\kopo\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		// BufferedReader �� br�� �����Ѵ�. FileReader- �б�(������ ����) �� ���Ͽ�
		BufferedReader br = new BufferedReader(new FileReader(f));
		// �ش� ��ġ�� ������ ���ϸ����� �����Ѵ�.
		// BufferedReader �� br�� �����Ѵ�. FileReader- �ۼ�(������ ����) �� ���Ͽ�
		File f1 = new File("C:\\Users\\kopo\\Desktop\\Date2015Samsumg.csv");
		// BufferedWriter�� bw1�� ���� FileWriter - �ۼ� (������ ����) �� ���Ͽ�
		BufferedWriter bw1 = new BufferedWriter (new FileWriter(f1));
			
		String readtxt;	//���ڿ� ���� ����
		int max = 0;
		int min = 0;
		String maxdate = "";
		String mindate = "";
		// cnt �� wcnt ����
		int cnt = 0; int wcnt = 0;
		// ���۽ð��� �����ϱ� ���� currentTimeMillis ����
		long startTime = System.currentTimeMillis();
		// ���� ������� while�� Ż�⼱��		
		while((readtxt =br.readLine()) != null) {
			// StringBuffer�� s �� �����Ѵ�.
			StringBuffer s = new StringBuffer();
			// readtxt�� %_%�� �������� �߶� ���ڿ� �迭�� �ִ´�.
			String[] field = readtxt.split("%_%");
			// �� �ʵ忡�� ^�� ������ ����, trim(�յ� ��������), substring���� 1��° ���ڸ� ����, A�� ������
			if(field.length > 2 && field[1].replace("^", "").trim().substring(0, 4).equals("2015") &&
					field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
				s.append(field[0].replace("^","").trim());	//s�� field�� ù��° ���ڿ�, ^�� �����ϰ� �յ� ������ �߶� �߰��ض�
				for (int j = 1; j < field.length; j++) {	// 1���� field�� ���̸�ŭ ���� for�� �ۼ�
					s.append("," + field[j].replace("^", "").trim());	//s��  , + ^�� ���� ���ڿ��� �߰��ض� (�յ� ���鵵 ����)
				}
				bw1.write(s.toString()); bw1.newLine();	//bw1�� s�� ���ڿ��� �ۼ��ϰ� �ٹٲ��� �����ض�
				
				if (wcnt == 0) {
					max = Integer.parseInt(field[3].replace("^","").trim());
					min = Integer.parseInt(field[3].replace("^","").trim());
					maxdate = field[1].replace("^", "").trim();
					mindate = field[1].replace("^", "").trim();
				} else {
					if(max <  Integer.parseInt(field[3].replace("^","").trim())) {
						max = Integer.parseInt(field[3].replace("^","").trim());
						maxdate = field[1].replace("^", "").trim();
					}
					if(min > Integer.parseInt(field[3].replace("^","").trim())) {
						min = Integer.parseInt(field[3].replace("^","").trim());
						mindate = field[1].replace("^", "").trim();
					}
				}
				
				wcnt++;	// ���� ���� +1
 			}
			cnt++; // �� ���� ���� +1
		}
		
		long finishTime = System.currentTimeMillis();	//������ �ð� ���
        long elapsedTime = finishTime - startTime;	//������ �ð��� ó���ð��� ���̷� ������ �ð��� ����Ѵ�.
        // �ð��� ���� �׸�� ��� ����
        System.out.println("startTime(ms) : " + startTime);
        System.out.println("finishTime(ms) : " + finishTime);
        System.out.println("elapsedTime(ms) : " + elapsedTime);
        System.out.println("�� �׸� ���� : " + cnt);
        System.out.println("�����ڵ� 2015�� �̸鼭 �Ｚ�ֽ��� �׸� ���� : " + wcnt);
        
        System.out.println("�ִ� �ֽ��Ѱ� : " + max + "\n" + maxdate);
        System.out.println("�ּ� �ֽ��Ѱ� : " + min + "\n" + mindate);
        
		// BufferedReader, BufferedWriter ���� ����
		br.close();
		bw1.close();
		
//		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

	}

}