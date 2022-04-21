package javajump8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class pg5 {

	public static void main(String[] args) {
		// pg13 무식하게 읽고 쓰기
		try {
			// File을 선언하면서 파일 지정한다.
			File k37_f = new File("C:\\Users\\kopo\\Desktop\\test.txt");
			FileWriter k37_fw = new FileWriter(k37_f);	//지정한 파일에 글을 쓰기위해 FileWriter 선언한다.
			
			k37_fw.write("안녕 파일\n");	//안녕 파일을 파일에 작성한다.
			k37_fw.write("hello 헬로\n");	// hello 헬로를 파일에 작성한다.
			
			k37_fw.close();	//쓰기 기능을 종료한다.
			// 파일 읽기 기능을 쓰기위해 FileReader
			FileReader k37_fr = new FileReader(k37_f);
			// while 문을 나갈 변수 설정
			int k37_n = 0;
			// 문자 배열 생성
			char [] k37_ch;
			// 무한루프 선언
			while(true) {
				k37_ch = new char [100];	// 문자형 배열 크기 100 선언
				k37_n = k37_fr.read(k37_ch);	// fileReader read로 하나씩 읽어옴, 더 추가할 값이 없으면 -1 이 출력된다.

				// 값이 비었으면 while문 탈출 (-1)
				if (k37_n == -1)break;
				// 문자의 길이만큼 도는 for문 작성해서 메세지 출력
				for (int k37_i = 0; k37_i < k37_n; k37_i++) {
					System.out.printf("%c",k37_ch[k37_i]);
				}
			}
			// 사용한 fileReader종료
			k37_fr.close();
			// read 끝났다고 메세지 출력
			System.out.printf("\n FILE READ END");
		} catch (Exception k37_e) {
			// 에러가 생기면 메세지 출력
			System.out.printf("나 에러[%s]\n", k37_e);
		}

	}

}
