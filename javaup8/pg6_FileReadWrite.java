package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg6_FileReadWrite {

	public static void k37_FileWrite() throws IOException {	//�ܼ�â�� ��������, ��Ȯ�� ó���� ��ƴ�.
		// �ش� ��ġ�� �ִ� txt������ �о�´�. ������ �ۼ� / f�� ����
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedWriter�� bw�� ���� FileWriter(f) �� ����� ����
		BufferedWriter k37_bw = new BufferedWriter(new FileWriter(k37_f));
		// BufferedWriter�� write ��� ��� "�ȳ� ����" �Է� + �ٹٲ�
		k37_bw.write("�ȳ� ����");
		k37_bw.newLine();
		// BufferedWriter�� write ��� ��� "hello ���" �Է� + �ٹٲ�
		k37_bw.write("hello ���");
		k37_bw.newLine();
		// BufferedWriter ����
		k37_bw.close();
	}
	
	public static void k37_FileRead() throws IOException {	//�ܼ�â�� ��������, ��Ȯ�� ó���� ��ƴ�.
		// �ش� ��ġ�� �ִ� txt������ �о�´�. ������ �ۼ� / f�� ����
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedReader�� �����ϰ� �о�� ���� ����
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// ����� ���ڿ� ���� ����
		String k37_readtxt;
		//readLine ���� �޾ƿ� ���� �ִٸ� ��� ���� while�� �ۼ� (���� ������ ����)
		while((k37_readtxt = k37_br.readLine()) != null) {
			System.out.printf("%s\n",k37_readtxt);	// ���پ� �а� �ٹٲ�
		}
		k37_br.close();	//BufferedReader ���� ����
	}
	
	public static void main(String[] args) throws IOException {
		// pg6 Buffered �а� ����
		k37_FileWrite();
		k37_FileRead();
	}

}
