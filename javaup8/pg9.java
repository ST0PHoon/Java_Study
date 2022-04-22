package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg9 {

	public static void main(String[] args) throws IOException{
		// pg9		
		// 해당 위치에 있는 파일을 선언한다.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat");
		//	BufferedReader 기능을  FileReader(선언한 파일) 대해서 실시한다.
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		String readtxt;
		int k37_LineCnt = 0;	// 항목수를 측정하기 위한 변수
		int k37_n =1;	// while문을 빠져나가기 위해 설정한 변수
		// StringBuffer 선언
		StringBuffer k37_s = new StringBuffer();
		// 파일을 1000개씩 읽기 위한 while문 작성, 모두 읽었을때 빠져나온다.
		while(true) {
			// 읽을 파일의 문자 배열 1000칸 짜리 생성
			char [] k37_ch = new char[1000];
			// BufferedReader로 해당 문자 배열의 읽어봐 n에 넣는다.
			k37_n = k37_br.read(k37_ch);
			// n은 문자배열이 없으면 -1 로 된다. 그리고 없으면 while문을 빠져나가게 if문 설정한다.
			if(k37_n == -1) break;
			// ch 성분을 하나하나 c에 넣어서 돌리는 for문 작성
			for(char k37_c :k37_ch) {
				if(k37_c=='\n') {	// 줄바꿈 표시가 나왔을때 메세지 출력
					System.out.printf("[%s]****\n",k37_s.toString());	// StringBuffer를 문자열로 바꿔서 출력
//					System.out.printf("*\n");
					k37_s.delete(0,k37_s.length());	//StringBuffer를 초기화한다.
				} else {
					k37_s.append(k37_c);	//StringBuffer에 c의 문자를 추가한다.
				}
			}
			k37_LineCnt++;	// 파일 수를 카운트하기 위해 +1
		}
		System.out.printf("[%s]****\n",k37_s.toString());	// 마지막 s 를 출력
		k37_br.close();
	}

}
