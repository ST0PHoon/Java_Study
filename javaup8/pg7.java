package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg7 {

	public static void main(String[] args) throws IOException {
		// pg7 실제 파일에 응용
		// 해당 위치에 있는 12_04_07_E_무료와이파이정보 파일을 선택한다.
		File f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.csv");
		// BufferedReader를 FileReader(f)에 대하여 선언한다. (읽기)
		BufferedReader br = new BufferedReader (new FileReader(f));
		// 문자열 변수를 선언한다.
		String readtxt;
		// 처음 받아온 값이 비어있으면 "빈 파일 입니다"를 출력한다.
		if((readtxt = br.readLine()) ==null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		// 받아온 파일의 첫줄을 콤마 단위로 나눠서 문자열 배열에 넣는다.
		String[] field_name = readtxt.split(",");
		// 항목을 측정하기 위한 카운터용 정수형 변수 선언
		int LineCnt = 0;
		// 읽어온 값을 전부 볼때까지 도는 while문 선언
		while((readtxt = br.readLine()) != null) {
			// 받아온 항목을 , 단위로 잘라서 field배열에 넣는다.
			String[] field = readtxt.split(",");
			// 현재 몇번째 항목인지 보여준다.
			System.out.printf("**[%d번째 항목]********************\n", LineCnt);
			// 현재 필드의 길이만큼 도는 for문 작성
			for (int j = 0; j < field_name.length; j++) {
				//필드 이름과 필드 내용을 출력한다.
				System.out.printf("%s : %s\n",field_name[j], field[j]);
			}
			System.out.printf("***********************************\n");
			// 100개일 때 종료한다.
			if(LineCnt == 100)break;
			// 항목수 counter +1;
			LineCnt++;
		}
		// BufferedReader 종료
		br.close();

	}

}
