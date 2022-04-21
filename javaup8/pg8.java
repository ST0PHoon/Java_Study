package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg8 {

	public static void main(String[] args) throws IOException {
		// pg8 �Ÿ����
		// ������ ��ġ�� �ִ� ������ �����Ͽ� File ����		
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������.csv");
		// ������ ������ File�� BufferedReader�� �������� ����
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// �ؽ�Ʈ�� �ٲ㰡�鼭 ���� ���ڿ� ���� ����
		String k37_readtxt;
		// ù ���� readtxt�� �Է��ϰ� ���� ���̿��� null�� ������ ������ �޼��� ���
		if((k37_readtxt = k37_br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		// field_name ���ڿ� �迭�� ù���� ,������ �߶� �Է��Ѵ�.
		String[] k37_field_name = k37_readtxt.split(",");
		
		// �����ش��� ���� �浵 �Է�
		double k37_lat = 37.3860521;
		double k37_lng = 127.1214038;
		
		int k37_k37_LineCnt = 1;	// ���� ���°�� ���� �ִ��� Ȯ���� ������ ���� ����
		int k37_maxnumber = 0;	// �ִ밪�� ��ġ�� ���� ���� ����
		int k37_minnumber = 0;	// �ּҰ��� ��ġ�� ���� ���� ����
		double k37_distMax = 0.0;	// �ִ�Ÿ��� ���� ���� ����
		double k37_distMin = 0.0;	// �ּҰŸ��� ���� ���� ����
		
		while((k37_readtxt = k37_br.readLine()) != null) { 	// ���� ���������� ���� while�� �ۼ�
			
			String [] k37_field = k37_readtxt.split(",");	// ���� ������ �޸� ������ �߶� field �迭�� �ִ´�.
			System.out.printf("**[%d��° �׸�]***********************\n",k37_k37_LineCnt);	// ���� ���° �׸����� ����Ѵ�.
			System.out.printf(" %s : %s\n", k37_field_name[10], k37_field[10]);	// �ش� ���� �����������ּ��� �׸�� ������ ����Ѵ�.
			System.out.printf(" %s : %s\n", k37_field_name[13], k37_field[13]);	// �ش� ���� ���� : ������ ���� ����Ѵ�.
			System.out.printf(" %s : %s\n", k37_field_name[14], k37_field[14]);	// �ش� ���� �浵 : �浵�� ���� ����Ѵ�.
			// �Ÿ� ��� (��Ÿ��� ����) sqrt(������), pew(����), field�� ���� ���������� �ٲ㼭 ������ ������ ��ǥ�� �Ÿ����
			double k37_dist = Math.sqrt(Math.pow(Double.parseDouble(k37_field[13]) - k37_lat,2)
					+ Math.pow(Double.parseDouble(k37_field[14]) -k37_lng, 2));
			// ������ ����� �Ÿ� ���
			System.out.printf(" ���������� �Ÿ� : %f\n", k37_dist);
			System.out.println("************************************");
			// �ִ� �ּ� ���ϴ� if�� ����
			if(k37_k37_LineCnt == 1) {	// ���� ���� ó���̶��
				k37_distMax = k37_dist;	// �ش簪�� �ִ밪 ������ �־��
				k37_distMin = k37_dist;	// �ش� ���� �ּҰ� ������ �־��
				k37_maxnumber = k37_k37_LineCnt;	// �ִ밪�� ��ȣ(���°��)�� �־��
				k37_minnumber = k37_k37_LineCnt;	// �ּҰ��� ��ȣ(���°��)�� �־��
				
				
			} else {
				if(k37_dist > k37_distMax) {
					k37_distMax = k37_dist;	// �ִ밪�� �����Ѵ�.
					k37_maxnumber = k37_k37_LineCnt;	//�ִ밪�� ��ġ�� �����Ѵ�.
				}
				if(k37_distMin > k37_dist) {
					k37_distMin = k37_dist;	//�ּҰ��� �����Ѵ�.
					k37_minnumber = k37_k37_LineCnt;	// �ּҰ��� ��ġ�� �����Ѵ�.
				}
			}
			
			k37_k37_LineCnt++;	// �����ٷ� �Ѿ�ٴ� �ǹ̷� +1
		}
		// �ִ�Ÿ� , �ּҰŸ� �� �� ���° ������ ����Ѵ�.
		System.out.printf("[%d��° �׸�] �ִ�Ÿ� : %f", k37_maxnumber, k37_distMax);
		System.out.printf("[%d��° �׸�] �ּҰŸ� : %f", k37_minnumber, k37_distMin);		
		// BufferedReader ����
		k37_br.close();
	}

}
