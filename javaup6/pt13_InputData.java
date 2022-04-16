package javajump6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pt13_InputData {
	//필요한 변수와 배열 선언, (정수형 변수, 정수 실수 문자열형 배열)
	int k37_Person;
	int [] k37_i;
	String [] k37_name;
	int [] k37_kor;
	int [] k37_eng;
	int [] k37_mat;
	int [] k37_sum;
	double [] k37_ave;
	
	pt13_InputData(int k37_iPerson) {	//받아온 인원수 크기만큼의 배열 생성, 및 인원수 저장
		k37_i = new int[k37_iPerson];	
		k37_name = new String[k37_iPerson];
		k37_kor = new int[k37_iPerson];
		k37_eng = new int[k37_iPerson];
		k37_mat = new int[k37_iPerson];
		k37_sum = new int[k37_iPerson];
		k37_ave = new double[k37_iPerson];
		k37_Person = k37_iPerson;
	}
	
	//k37_을 붙이면 중복이라 여기선 생략
	// 받아온 i(번호)를 통해 해당 과목의 배열에 점수들을 i위치에 입력해준다.
	public void k37_SetDate(int i, String name, int kor, int eng, int mat) {
		k37_i[i] = i;
		k37_name[i] = name;
		k37_kor[i] = kor;
		k37_eng[i] = eng;
		k37_mat[i] = mat;
		k37_sum[i] = kor + eng + mat;	//총합 계산
		k37_ave[i] = k37_sum[i] / 3.0;	//평균 계산
	}
	
	//정수형 배열을 받아와서 과목별 합을 구해주는 메소드 생성, 리턴은 정수형 값
	public int k37_subjectSum(int[] k37_intArr) {
		int k37_sum = 0;	//합을 담을 정수형 변수 선언
		//과목의 성적 수만큼 반복하는 for문 생성, 10번
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];	//배열을 돌면서 모든 성적을 더해준다
		}
		return k37_sum;	//이후 합한 값을 리턴한다.
	}
	
	//더블형 배열을 받아와서 평균의 합을 구하는 메소드 생성, 리턴은 더블형 값
	public double k37_aveSum(double[] k37_doubleArr) {
		double k37_sum = 0;	//평균의 합을 받는 변수 선언 , 더블형
		//평균의 수만큼 반복하는 for문 생성, 10번
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];	//각 평균 다 더해주기
		}
		return k37_sum;	// 더블형으로 평균의 합 리턴하기
	}
	
	// 39pg ReportSheet, 클래스 만들기
	//정수형 배열을 받아와서 과목별 합의 평균을 구해주는 메소드 생성, 리턴은 실수형 값
	public double k37_subjectAve(int[] k37_intArr) {
		int k37_sum = 0;	//합을 받을 정수형 변수 선언
		// 인원수 만큼 반복하는 for문 생성
		for (int k37_i = 0; k37_i < k37_intArr.length; k37_i++) {
			k37_sum += k37_intArr[k37_i];	// 배열을 돌면서 더한다
		}
		return ((double) k37_sum) / k37_Person;	//더블형으로 리턴하기위해 앞에 형변환 실시
	}
	
	//실수형 배열을 받아와서 학생들의 평균의 평균을 구해주는 메소드 생성, 리턴은 실수형 값
	public double k37_aveAve(double[] k37_doubleArr) {
		double k37_sum = 0;	//실수형 변수 선언, 합할 용도로 사용
		// 인원수 만큼 반복하는 for문 생성
		for (int k37_i = 0; k37_i < k37_doubleArr.length; k37_i++) {
			k37_sum += k37_doubleArr[k37_i];	//배열을 돌면서 값을 모두 더한다.
		}
		return k37_sum / k37_Person;	//인원수로 나눠 평균의 평균을 구해 리턴한다
	}
	
	//날짜를 문자열로 반환하는 메소드 선언, import는 상단에 있다.
	public String k37_printDate() {
		//시간을 받아오면 출력할 포멧 작성, 4자리연도 월 일 24시 시간 분 초
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		
		Date k37_time = new Date();	//Date 함수를 time으로 쓰겠다고 선언
				
		String k37_time1 = format1.format(k37_time);	//받아온 시간을 포멧에 맞게 변경해서 선언한 time1에 입력
		
		return k37_time1;	//위 포멧에 맞춰진 문자열형 날짜 리턴
	}
}
