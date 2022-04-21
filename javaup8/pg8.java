package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg8 {

	public static void main(String[] args) throws IOException {
		// pg8 거리계산
		// 지정한 위치에 있는 파일을 선택하여 File 선언		
		File k37_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보.csv");
		// 위에서 선언한 File을 BufferedReader로 읽으려고 선언
		BufferedReader k37_br = new BufferedReader (new FileReader(k37_f));
		// 텍스트를 바꿔가면서 담을 문자열 변수 선언
		String k37_readtxt;
		// 첫 출을 readtxt에 입력하고 만약 빈값이여서 null이 나오면 빈파일 메세지 출력
		if((k37_readtxt = k37_br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		// field_name 문자열 배열에 첫줄을 ,단위로 잘라서 입력한다.
		String[] k37_field_name = k37_readtxt.split(",");
		
		// 폴리텍대학 위도 경도 입력
		double k37_lat = 37.3860521;
		double k37_lng = 127.1214038;
		
		int k37_k37_LineCnt = 1;	// 현재 몇번째를 돌고 있는지 확인할 정수형 변수 선언
		int k37_maxnumber = 0;	// 최대값의 위치를 담을 변수 선언
		int k37_minnumber = 0;	// 최소값의 위치를 담을 변수 선언
		double k37_distMax = 0.0;	// 최대거리를 구할 변수 선언
		double k37_distMin = 0.0;	// 최소거리를 구할 변수 선언
		
		while((k37_readtxt = k37_br.readLine()) != null) { 	// 값이 없을때까지 도는 while문 작성
			
			String [] k37_field = k37_readtxt.split(",");	// 다음 내용을 콤마 단위로 잘라서 field 배열에 넣는다.
			System.out.printf("**[%d번째 항목]***********************\n",k37_k37_LineCnt);	// 지금 몇번째 항목인지 출력한다.
			System.out.printf(" %s : %s\n", k37_field_name[10], k37_field[10]);	// 해당 줄의 소재지지번주소의 항목과 내용을 출력한다.
			System.out.printf(" %s : %s\n", k37_field_name[13], k37_field[13]);	// 해당 줄의 위도 : 위도값 으로 출력한다.
			System.out.printf(" %s : %s\n", k37_field_name[14], k37_field[14]);	// 해당 줄의 경도 : 경도값 으로 출력한다.
			// 거리 계산 (피타고라스 정리) sqrt(제곱근), pew(제곱), field의 값을 더블형으로 바꿔서 폴리텍 대학의 좌표와 거리계산
			double k37_dist = Math.sqrt(Math.pow(Double.parseDouble(k37_field[13]) - k37_lat,2)
					+ Math.pow(Double.parseDouble(k37_field[14]) -k37_lng, 2));
			// 위에서 계산한 거리 출력
			System.out.printf(" 현재지점과 거리 : %f\n", k37_dist);
			System.out.println("************************************");
			// 최대 최소 구하는 if문 선언
			if(k37_k37_LineCnt == 1) {	// 지금 값이 처음이라면
				k37_distMax = k37_dist;	// 해당값을 최대값 변수에 넣어라
				k37_distMin = k37_dist;	// 해당 값을 최소값 변수에 넣어라
				k37_maxnumber = k37_k37_LineCnt;	// 최대값의 번호(몇번째줄)을 넣어라
				k37_minnumber = k37_k37_LineCnt;	// 최소값의 번호(몇번째줄)을 넣어라
				
				
			} else {
				if(k37_dist > k37_distMax) {
					k37_distMax = k37_dist;	// 최대값을 갱신한다.
					k37_maxnumber = k37_k37_LineCnt;	//최대값의 위치를 갱신한다.
				}
				if(k37_distMin > k37_dist) {
					k37_distMin = k37_dist;	//최소값을 갱신한다.
					k37_minnumber = k37_k37_LineCnt;	// 최소값의 위치를 갱신한다.
				}
			}
			
			k37_k37_LineCnt++;	// 다음줄로 넘어갔다는 의미로 +1
		}
		// 최대거리 , 최소거리 와 각 몇번째 줄인지 출력한다.
		System.out.printf("[%d번째 항목] 최대거리 : %f", k37_maxnumber, k37_distMax);
		System.out.printf("[%d번째 항목] 최소거리 : %f", k37_minnumber, k37_distMin);		
		// BufferedReader 종료
		k37_br.close();
	}

}
