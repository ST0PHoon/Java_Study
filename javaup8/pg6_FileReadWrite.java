package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg6_FileReadWrite {

	public static void FileWrite() throws IOException {	//�ܼ�â�� ��������, ��Ȯ�� ó���� ��ƴ�.
		// �ش� ��ġ�� �ִ� txt������ �о�´�. ������ �ۼ� / f�� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedWriter�� bw�� ���� FileWriter(f) �� ����� ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		// BufferedWriter�� write ��� ��� "�ȳ� ����" �Է� + �ٹٲ�
		bw.write("�ȳ� ����");
		bw.newLine();
		// BufferedWriter�� write ��� ��� "hello ���" �Է� + �ٹٲ�
		bw.write("hello ���");
		bw.newLine();
		// BufferedWriter ����
		bw.close();
	}
	
	public static void FileRead() throws IOException {	//�ܼ�â�� ��������, ��Ȯ�� ó���� ��ƴ�.
		// �ش� ��ġ�� �ִ� txt������ �о�´�. ������ �ۼ� / f�� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedReader�� �����ϰ� �о�� ���� ����
		BufferedReader br = new BufferedReader (new FileReader(f));
		
		String readtxt;
		
		while((readtxt = br.readLine()) != null) {
			System.out.printf("%s\n",readtxt);
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		// pg6 Buffered �а� ����
		FileWrite();
		FileRead();
	}

}
