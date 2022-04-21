package javajump8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pg11_Date {

		public static void main(String[] args) throws IOException {
			// pg11 20120120일 자
			// 지정한 위치의 파일을 File f에 선언하다.
			File f = new File("C:\\Users\\kopo\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat");
			// BufferedReader 을 br로 선언한다. FileReader- 읽기(지정한 파일) 에 대하여
			BufferedReader br = new BufferedReader(new FileReader(f));
			// 해당 위치에 쓰여진 파일명으로 선언한다.
			// BufferedReader 을 br로 선언한다. FileReader- 작성(지정한 파일) 에 대하여
			File f1 = new File("C:\\Users\\kopo\\Desktop\\Date20120120.csv");
			// BufferedWriter를 bw1로 선언 FileWriter - 작성 (지정한 파일) 에 대하여
			BufferedWriter bw1 = new BufferedWriter (new FileWriter(f1));
				
			String readtxt;	//문자열 변수 선언
			// cnt 와 wcnt 선언
			int cnt = 0; int wcnt = 0;
			// 시작시간을 측정하기 위한 currentTimeMillis 선언
			long startTime = System.currentTimeMillis();
			// 값이 비었으면 while문 탈출선언		
			while((readtxt =br.readLine()) != null) {
				// StringBuffer를 s 로 선언한다.
				StringBuffer s = new StringBuffer();
				// readtxt를 %_%를 기준으로 잘라서 문자열 배열에 넣는다.
				String[] field = readtxt.split("%_%");
				// 각 필드에서 ^를 날리는 과정, trim(앞뒤 공백제거), substring으로 1번째 문자만 지정, A와 같으면
				if(field.length > 2 && field[1].replace("^", "").trim().substring(0, 8).equals("20120120")) {
					s.append(field[0].replace("^","").trim());	//s에 field의 첫번째 문자에, ^을 제거하고 앞뒤 공백을 잘라서 추가해라
					for (int j = 1; j < field.length; j++) {	// 1부터 field의 길이만큼 도는 for문 작성
						s.append("," + field[j].replace("^", "").trim());	//s애  , + ^를 없앤 문자열을 추가해라 (앞뒤 공백도 제거)
					}
					bw1.write(s.toString()); bw1.newLine();	//bw1에 s를 문자열로 작성하고 줄바꿈을 실행해라
					wcnt++;	// 개수 측정 +1
	 			}
				cnt++; // 총 개수 측정 +1
			}
			
			long finishTime = System.currentTimeMillis();	//끝나는 시간 등록
	        long elapsedTime = finishTime - startTime;	//끝나는 시간과 처음시간의 차이로 돌리는 시간을 계산한다.
	        // 시간과 파일 항목수 출력 구간
	        System.out.println("startTime(ms) : " + startTime);
	        System.out.println("finishTime(ms) : " + finishTime);
	        System.out.println("elapsedTime(ms) : " + elapsedTime);
	        System.out.println("총 항목 개수 : " + cnt);
	        System.out.println("단축코드 20120120인 날짜 항목 개수 : " + wcnt);
			// BufferedReader, BufferedWriter 선언 종료
			br.close();
			bw1.close();
			
//			System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

		}

	}
