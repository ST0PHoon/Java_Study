package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt15_InputData {
	// 사용할 변수들 선언
	int k37_totalPerson;	// 총인원수
	int k37_pgPerson;	// 페이지 당 인원수
	int [] k37_i;	// 사람 번호
	String [] k37_name;	// 사람 이름
	int [] k37_kor;	// 국어성적
	int [] k37_eng;	// 영어성적
	int [] k37_mat;	// 수학성적
	int [] k37_sum;	// 학생의 국영수 합
	double [] k37_ave;	//학생의 평균
	int[] k37_personGroupArray;	//페이지당 인원수 담을 정수형 배열
	
	pt15_InputData(int k37_iPerson, int k37_onepagePerson) {	//생성자, 총인원과 페이지당 인원을 받아온다.
		//받아온 총인원으로 배열의 크기를 입력한다.
		k37_totalPerson = k37_iPerson;
		k37_pgPerson = k37_onepagePerson;
		k37_i = new int[k37_iPerson];
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
		// 페이지 수는 200/30 = 6(int) +1을 해서 총 7페이지로 맞춰준다. 인원수가 딱 나눠 떨어지면 페이지를 추가할 필요없다.
		if (k37_iPerson % k37_onepagePerson == 0) {
			k37_personGroupArray = new int[(k37_iPerson / k37_onepagePerson)];
		} else {
			k37_personGroupArray = new int[(k37_iPerson / k37_onepagePerson) + 1];
		}
	}
	
	public String k37_printDate() {	//현재 시간을 포멧에 맞게 리턴하는 메소드, 문자열
		//시간의 형태를 짜둔다.
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//현재시간을 가져온다.
		Date k37_time = new Date();
		//선언한 문자열에 포멧에 맞춰 시간을 입력한다.	
		String k37_time1 = format1.format(k37_time);
		
		return k37_time1;	//입력한 시간문자열을 리턴
	}
	
	public int[] k37_perPagePerson() {	// 각 페이지 별로 몇명이 있는지 입력하여 정수형 배열로 리턴한다.
		// 배열의 크기만큼 돈다, 0부터 1씩증가하면 6까지
		for (int k37_i = 0; k37_i < k37_personGroupArray.length ; k37_i++) {
			if (k37_i == k37_personGroupArray.length - 1 ) {	// 마지막장이라면, 페이지당 인원으로 나눈 나머지를 넣어라
				k37_personGroupArray[k37_i] = k37_totalPerson % k37_pgPerson;	//20 들어갈 예정
			} else {	//그게 아니라면 페이지당 인원수 를 넣어라
				k37_personGroupArray[k37_i] = k37_pgPerson;
			}
		}
		return k37_personGroupArray;	// 작성한 배열을 리턴한다.
	}
	
	//페이지 별로 시작인원의 숫자를 구하여 정수형으로 리턴하는 메소드
	public int k37_currentStartNumber(int k37_ii) {	//첫페이지면 0, 두번째면 1... 이런식으로 변수를 받아온다.
		int k37_startNum = 0;	// 출력할 페이지별 첫 번호를 담을 변수
		//페이지수보다 -1 만큼 도는 for문 작성, 1페이지면 0번, 2페이지면 1번, ... 7페이지면 6번
		for (int k37_i = 0; k37_i < k37_ii; k37_i++) {
			// 첫페이지 0, 2페이지 30, 3페이지 60, ... 마지막페이지 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		return k37_startNum;	//정수형 값을 리턴
	}
	
	//받아온 이름과 성적 정보를 각 배열에 담아주는 메소드, 매개변수에 k37_붙이면 배열명과 같아져서 생략
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i - 1] = i;	// 번호 입력, 배열이라 -1
		k37_name[i - 1] = name;	// 이름 입력
		k37_kor[i - 1] = kor;	// 국어 입력
		k37_eng[i - 1] = eng;	// 영어 입력
		k37_mat[i - 1] = mat;	// 수학 입력
		k37_sum[i - 1] = kor + eng + mat;	//성적 합 입력
		k37_ave[i - 1] = k37_sum[i - 1] / 3.0; //3과목이고 double형이기 때문에 3.0으로 표기
	}
	
	//현재 페이지의 과목별 성적 합을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다.
	public int k37_curSubjectSum(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;	//합과 시작번호를 담을 변수 선언
		//페이지의 번호 -1 만큼 도는 for문 작성
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//페이지의 시작과 끝 번호 사이를 도는 for문 작성, 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 해당 과목의 합을 구한다.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//정수형 값 리턴
	}
	
	// 위 메소드와 똑같은 원리, 평균의 합은 double 배열로 받고 double로 내보내 줘야해서 따로 생성
	public double k37_curAveSum(int k37_cycNumber, double[] k37_array) {
		//합과 시작번호를 담을 변수 선언
		double k37_sum = 0;	
		int k37_startNum = 0;
		//페이지의 번호 -1 만큼 도는 for문 작성
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//페이지의 시작과 끝 번호 사이를 도는 for문 작성, 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//실수형 값 리턴
	}
	
	//현재 페이지의 평균을 구하는 메소드, 현재페이지 -1 의 정수와, 과목별 성정 배열을 가져온다. 평균이라 double형으로 리턴
	public double k37_cursubjectAve(int k37_cycNumber, int[] k37_array) {
		int k37_sum = 0, k37_startNum = 0;	//합과 시작번호를 담을 변수 선언
		//페이지의 번호 -1 만큼 도는 for문 작성
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//페이지의 시작과 끝 번호 사이를 도는 for문 작성, 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_personGroupArray[k37_cycNumber];	//합 / 페이지 인원수 한 값을 리턴한다.
	}
	
	// 위 메소드와 똑같은 원리, 평균의 합은 double 배열로 받고 double로 내보내 줘야해서 따로 생성
	public double k37_curaveAve(int k37_cycNumber, double[] k37_array) {
		//합과 시작번호를 담을 변수 선언
		double k37_sum = 0;
		int k37_startNum = 0;
		//페이지의 번호 -1 만큼 도는 for문 작성
		for (int k37_i = 0; k37_i < k37_cycNumber; k37_i++) {
			//1페이지면 0, 2페이지면 30, .. 마지막페이지 180
			k37_startNum += k37_personGroupArray[k37_i];
		}
		//페이지의 시작과 끝 번호 사이를 도는 for문 작성, 1페이지(0 ~ 29), 2페이지(30 ~59) .. 마지막(180 ~ 199)
		for (int k37_i = k37_startNum; k37_i < k37_startNum + k37_personGroupArray[k37_cycNumber]; k37_i++) {
			// 200크기의 배열에서 원하는 페이지에 존재하는 인원들의 평균의 합을 구한다.
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_personGroupArray[k37_cycNumber];	//합 / 페이지 인원수 한 값을 리턴한다.
	}
	
	
	// 현재 페이지까지의 누적 성적합, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 정수형 변수 리턴
	public int k37_totalSubjectSum(int k37_cycNumber, int[] k37_array) {
		//합과 페이지의 끝번호를 담을 변수 선언
		int k37_sum = 0, k37_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1) 
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 돈다. 
		// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//더한값을 리턴
	}
	
	// 현재 페이지까지의 누적 평균합, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 실수형 변수 리턴
	public double k37_totalAveSum(int k37_cycNumber, double[] k37_array) {
		//합과 페이지의 끝번호를 담을 변수 선언
		double k37_sum = 0;
		int k37_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 돈다. 
		// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum;	//실수형 결과 리턴;
	}
	
	// 현재 페이지까지의 누적 합의 평균, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 실수형 변수 리턴	
	public double k37_totalsubjectAve(int k37_cycNumber, int[] k37_array) {
		//합과 페이지의 끝번호를 담을 변수 선언
		int k37_sum = 0, k37_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 돈다. 
		// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k37_sum += k37_array[k37_i];
		}
		return ((double) k37_sum) /  k37_endNum;	// 리턴할때 누적합 / 페이지까지 누적인원 한 값을 리턴
	}
	
	// 현재 페이지까지의 누적 평균의 평균, 페이지 -1 정수와, 과목 성적 배열을 가져온다. 실수형 변수 리턴
	public double k37_totalaveAve(int k37_cycNumber, double[] k37_array) {
		//합과 페이지의 끝번호를 담을 변수 선언
		double k37_sum = 0;
		int k37_endNum = 0;
		//0부터 현재페이지번호까지 도는 for문 작성(현재 페이지라 +1)
		for (int k37_i = 0; k37_i < k37_cycNumber + 1; k37_i++) {
			// 1페이지 30, 2페이지 60 .. 마지막페이지 200 이 입력된다.
			k37_endNum += k37_personGroupArray[k37_i];
		}
		// 0부터 1씩증가하며 해당 페이지의 마지막인원의 번호의 -1 까지 돈다. 
		// 1페이지 (0 ~ 29), 2페이지 (0 ~ 59) .. 마지막(0 ~ 199)
		for (int k37_i = 0; k37_i < k37_endNum; k37_i++) {
			// for문에 해당하는 숫자만큼의 성적을 더한다. 
			k37_sum += k37_array[k37_i];
		}
		return k37_sum /  k37_endNum;	// 리턴할때 누적합 / 페이지까지 누적인원 한 값을 리턴
	}
	

}