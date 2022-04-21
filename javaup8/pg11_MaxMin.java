package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg11_MaxMin {


	public static void main(String[] args) throws IOException {
		// pg11 20120120일 자
		// 지정한 위치의 파일을 File f에 선언하다.
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat");
		// BufferedReader 을 br로 선언한다. FileReader- 읽기(지정한 파일) 에 대하여
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		// 해당 위치에 쓰여진 파일명으로 선언한다.
		// BufferedReader 을 br로 선언한다. FileReader- 작성(지정한 파일) 에 대하여
		File k37_f1 = new File("C:\\Users\\kopo\\Desktop\\Date2015Samsumg.csv");
		// BufferedWriter를 bw1로 선언 FileWriter - 작성 (지정한 파일) 에 대하여
		BufferedWriter k37_bw1 = new BufferedWriter (new FileWriter(k37_f1));
			
		String k37_readtxt;	//문자열 변수 선언
		int k37_max = 0;
		int k37_min = 0;
		String k37_maxdate = "";
		String k37_mindate = "";
		// cnt 와 wcnt 선언
		int k37_cnt = 0; int k37_wcnt = 0;
		// 시작시간을 측정하기 위한 currentTimeMillis 선언
		long k37_startTime = System.currentTimeMillis();
		// 값이 비었으면 while문 탈출선언		
		while((k37_readtxt =k37_br.readLine()) != null) {
			// StringBuffer를 s 로 선언한다.
			StringBuffer s = new StringBuffer();
			// readtxt를 %_%를 기준으로 잘라서 문자열 배열에 넣는다.
			String[] k37_field = k37_readtxt.split("%_%");
			// 각 필드에서 ^를 날리는 과정, trim(앞뒤 공백제거), substring으로 1번째 문자만 지정, A와 같으면
			if(k37_field.length > 2 && k37_field[1].replace("^", "").trim().substring(0, 4).equals("2015") &&
					k37_field[2].replace("^", "").trim().substring(0, 7).equals("A005930")) {
				s.append(k37_field[0].replace("^","").trim());	//s에 field의 첫번째 문자에, ^을 제거하고 앞뒤 공백을 잘라서 추가해라
				for (int j = 1; j < k37_field.length; j++) {	// 1부터 field의 길이만큼 도는 for문 작성
					s.append("," + k37_field[j].replace("^", "").trim());	//s애  , + ^를 없앤 문자열을 추가해라 (앞뒤 공백도 제거)
				}
				k37_bw1.write(s.toString()); k37_bw1.newLine();	//bw1에 s를 문자열로 작성하고 줄바꿈을 실행해라
				
				if (k37_wcnt == 0) {	// 조건에 맞는 첫번째 값의
					k37_max = Integer.parseInt(k37_field[3].replace("^","").trim()); // 문자열에서 ^123^을 삭제하고 양끝 공백을 지운 후, 정수로 변환	(최대)
					k37_min = Integer.parseInt(k37_field[3].replace("^","").trim()); // 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환	(최소)
					k37_maxdate = k37_field[1].replace("^", "").trim();	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환
					k37_mindate = k37_field[1].replace("^", "").trim();	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환
				} else {
					if(k37_max <  Integer.parseInt(k37_field[3].replace("^","").trim())) {	// 최대 갱신
						k37_max = Integer.parseInt(k37_field[3].replace("^","").trim());	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환 (최대)
						k37_maxdate = k37_field[1].replace("^", "").trim();	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환 (최대 위치)
					}
					if(k37_min > Integer.parseInt(k37_field[3].replace("^","").trim())) {	// 최소 갱신
						k37_min = Integer.parseInt(k37_field[3].replace("^","").trim());	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환 (최소)
						k37_mindate = k37_field[1].replace("^", "").trim();	// 문자열에서 ^ ^을 삭제하고 양끝 공백을 지운 후, 정수로 변환 (최소 위치)
					}
				}
				
				k37_wcnt++;	// 개수 측정 +1
 			}
			k37_cnt++; // 총 개수 측정 +1
		}
		
		long k37_finishTime = System.currentTimeMillis();	//끝나는 시간 등록
        long k37_elapsedTime = k37_finishTime - k37_startTime;	//끝나는 시간과 처음시간의 차이로 돌리는 시간을 계산한다.
        // 시간과 파일 항목수 출력 구간
        System.out.println("startTime(ms) : " + k37_startTime);
        System.out.println("finishTime(ms) : " + k37_finishTime);
        System.out.println("elapsedTime(ms) : " + k37_elapsedTime);
        System.out.println("총 항목 개수 : " + k37_cnt);
        System.out.println("단축코드 2015년 이면서 삼성주식인 항목 개수 : " + k37_wcnt);
        
        System.out.println("최대 주식총가 : " + k37_max + "\n" + k37_maxdate);
        System.out.println("최소 주식총가 : " + k37_min + "\n" + k37_mindate);
        
		// BufferedReader, BufferedWriter 선언 종료
		k37_br.close();
		k37_bw1.close();
		
//		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

	}

}