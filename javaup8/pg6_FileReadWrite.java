package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg6_FileReadWrite {

	public static void k37_FileWrite() throws IOException {	//콘솔창에 에러만뜸, 정확한 처리가 어렵다.
		// 해당 위치에 있는 txt파일을 읽어온다. 없으면 작성 / f로 선언
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedWriter를 bw로 선언 FileWriter(f) 에 사용할 예정
		BufferedWriter k37_bw = new BufferedWriter(new FileWriter(k37_f));
		// BufferedWriter의 write 기능 사용 "안녕 파일" 입력 + 줄바꿈
		k37_bw.write("안녕 파일");
		k37_bw.newLine();
		// BufferedWriter의 write 기능 사용 "hello 헬로" 입력 + 줄바꿈
		k37_bw.write("hello 헬로");
		k37_bw.newLine();
		// BufferedWriter 종료
		k37_bw.close();
	}
	
	public static void k37_FileRead() throws IOException {	//콘솔창에 에러만뜸, 정확한 처리가 어렵다.
		// 해당 위치에 있는 txt파일을 읽어온다. 없으면 작성 / f로 선언
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedReader를 선언하고 읽어올 파일 지정
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// 사용할 문자열 변수 선언
		String k37_readtxt;
		//readLine 으로 받아온 값이 있다면 계속 도는 while문 작성 (문자 끝까지 돈다)
		while((k37_readtxt = k37_br.readLine()) != null) {
			System.out.printf("%s\n",k37_readtxt);	// 한줄씩 읽고 줄바꿈
		}
		k37_br.close();	//BufferedReader 선언 종료
	}
	
	public static void main(String[] args) throws IOException {
		// pg6 Buffered 읽고 쓰기
		k37_FileWrite();
		k37_FileRead();
	}

}
