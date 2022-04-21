package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg6_FileReadWrite {

	public static void FileWrite() throws IOException {	//콘솔창에 에러만뜸, 정확한 처리가 어렵다.
		// 해당 위치에 있는 txt파일을 읽어온다. 없으면 작성 / f로 선언
		File f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedWriter를 bw로 선언 FileWriter(f) 에 사용할 예정
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		// BufferedWriter의 write 기능 사용 "안녕 파일" 입력 + 줄바꿈
		bw.write("안녕 파일");
		bw.newLine();
		// BufferedWriter의 write 기능 사용 "hello 헬로" 입력 + 줄바꿈
		bw.write("hello 헬로");
		bw.newLine();
		// BufferedWriter 종료
		bw.close();
	}
	
	public static void FileRead() throws IOException {	//콘솔창에 에러만뜸, 정확한 처리가 어렵다.
		// 해당 위치에 있는 txt파일을 읽어온다. 없으면 작성 / f로 선언
		File f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
		// BufferedReader를 선언하고 읽어올 파일 지정
		BufferedReader br = new BufferedReader (new FileReader(f));
		
		String readtxt;
		
		while((readtxt = br.readLine()) != null) {
			System.out.printf("%s\n",readtxt);
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		// pg6 Buffered 읽고 쓰기
		FileWrite();
		FileRead();
	}

}
