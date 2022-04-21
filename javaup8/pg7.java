package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg7 {

	public static void main(String[] args) throws IOException {
		// pg7 실제 파일에 응용
		// 해당 위치에 있는 12_04_07_E_무료와이파이정보 파일을 선택한다.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.csv");
		// BufferedReader를 FileReader(f)에 대하여 선언한다. (읽기)
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// 문자열 변수를 선언한다.
		String k37_readtxt;
		// 처음 받아온 값이 비어있으면 "빈 파일 입니다"를 출력한다.
		if((k37_readtxt = k37_br.readLine()) ==null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		// 받아온 파일의 첫줄을 콤마 단위로 나눠서 문자열 배열에 넣는다.
		String[] k37_field_name = k37_readtxt.split(",");
		// 항목을 측정하기 위한 카운터용 정수형 변수 선언
		int k37_LineCnt = 0;
		// 읽어온 값을 전부 볼때까지 도는 while문 선언
		while((k37_readtxt = k37_br.readLine()) != null) {
			// 받아온 항목을 , 단위로 잘라서 field배열에 넣는다.
			String[] k37_field = k37_readtxt.split(",");
			// 현재 몇번째 항목인지 보여준다.
			System.out.printf("**[%d번째 항목]********************\n", k37_LineCnt);
			// 현재 필드의 길이만큼 도는 for문 작성
			for (int k37_j = 0; k37_j < k37_field_name.length; k37_j++) {
				//필드 이름과 필드 내용을 출력한다.
				System.out.printf("%s : %s\n",k37_field_name[k37_j], k37_field[k37_j]);
			}
			System.out.printf("***********************************\n");
			// 100개일 때 종료한다.
			if(k37_LineCnt == 100)break;
			// 항목수 counter +1;
			k37_LineCnt++;
		}
		// BufferedReader 종료
		k37_br.close();

	}

}
