package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg9 {

	public static void main(String[] args) throws IOException{
		// pg9		
		// 해당 위치에 있는 파일을 선언한다.
		File f = new File("C:\\Users\\kopo\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat");
		//	BufferedReader 기능을  FileReader(선언한 파일) 대해서 실시한다.
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int LineCnt = 0;	// 항목수를 측정하기 위한 변수
		int n =1;	// while문을 빠져나가기 위해 설정한 변수
		
		// StringBuffer 선언
		StringBuffer s = new StringBuffer();
		// 시작시간을 측정하기 위한 currentTimeMillis 선언
		long startTime = System.currentTimeMillis();
		// 파일을 1000개씩 읽기 위한 while문 작성, 모두 읽었을때 빠져나온다.
		while(true) {
			// 읽을 파일의 문자 배열 1000칸 짜리 생성
			char [] ch = new char[1000];
			// BufferedReader로 해당 문자 배열의 읽어봐 n에 넣는다.
			n = br.read(ch);
			// n은 문자배열이 없으면 -1 로 된다. 그리고 없으면 while문을 빠져나가게 if문 설정한다.
			if(n == -1) break;
			// ch 성분을 하나하나 c에 넣어서 돌리는 for문 작성
			for(char c :ch) {
				if(c=='\n') {	// 줄바꿈 표시가 나왔을때 메세지 출력
					System.out.printf("[%s]****\n",s.toString());	// StringBuffer를 문자열로 바꿔서 출력
					s.delete(0,s.length());	//StringBuffer를 초기화한다.
				} else {
					s.append(c);	//StringBuffer에 c의 문자를 추가한다.
				}
			}
			LineCnt++;	// 파일 수를 카운트하기 위해 +1
		}
		System.out.printf("[%s]****\n",s.toString());	// 마지막 s 를 출력
		
		long finishTime = System.currentTimeMillis();	//끝나는 시간 등록
        long elapsedTime = finishTime - startTime;	//끝나는 시간과 처음시간의 차이로 돌리는 시간을 계산한다.
        // 시간과 파일 항목수 출력 구간
        System.out.println("startTime(ms) : " + startTime);
        System.out.println("finishTime(ms) : " + finishTime);
        System.out.println("elapsedTime(ms) : " + elapsedTime);
        System.out.println("총 항목 개수 : " + LineCnt);
		// BufferedReader를 종료한다.
		br.close();
	}

}
