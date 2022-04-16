package javajump6;


public class pt14 {

	public static void main(String[] args) {
		// 39pg ReportSheet, 클래스 만들기
		int k37_iPerson = 30;	//정수형 변수에 30명 입력, 인원수 용도
		//다른 클래스 k37_inData로 선언
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		//현재시간 설정해둔 포멧에 맞게 출력해서 문자열에 입력
		String k37_time1 = k37_inData.k37_printDate();
		//총 인원수 만큼 도는 for문 작성. 0부터 1씩증가하며 29까지 돈다.
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("정지%02d", k37_i);	//문자열 이름생성 (정지 + 넘버링 형태)
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k37_kor = (int)(Math.random() * 100);	// 국어점수 만들기, double > int 형으로 형변환
			int k37_eng = (int)(Math.random() * 100);	// 영어점수 만들기, double > int 형으로 형변환
			int k37_mat = (int)(Math.random() * 100);	// 수학점수 만들기, double > int 형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);	
		}
		


		System.out.println("           출력일자 :"  + k37_time1);	// 출력일자를 상단에 출력
		System.out.println("=========================================");
		System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","번호","이름","국어","영어","수학","총점","평균");	//번호, 이름, 과목, 점수 메뉴바
		System.out.println("=========================================");
		//인원수 만큼 도는 for문 작성 0부터 1씩증가하며 29까지 돈다
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			// 선언한 클래스에서 배열에 담아진 성적을 for문을 통해 출력한다. (인원별 성적과 총합, 평균이 한줄로 출력
			System.out.printf("%03d %5.5s %3d   %3d   %3d   %3d   %.2f\n",
					k37_i + 1, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
		System.out.println("=========================================");
		//과목별 총합을 보여주기위해 다른클래스의 매소드에 과목별 점수 배열을 입력값으로 입력하고, 결과를 리턴받아 포멧에 맞게 출력한다.
		System.out.printf("%-2.2s        %3d  %3d  %3d  %4d  %.2f\n", "합계",k37_inData.k37_subjectSum(k37_inData.k37_kor),
				k37_inData.k37_subjectSum(k37_inData.k37_eng), k37_inData.k37_subjectSum(k37_inData.k37_mat),
				k37_inData.k37_subjectSum(k37_inData.k37_sum), k37_inData.k37_aveSum(k37_inData.k37_ave));
		//과목별 평균을 보여주기위해 다른클래스의 매소드에 과목별 점수 배열을 입력값으로 입력하고, 결과를 리턴받아 포멧에 맞게 출력한다.
		System.out.printf("%-2.2s       %3.2f %3.2f %3.2f %3.2f  %.2f\n", "평균",k37_inData.k37_subjectAve(k37_inData.k37_kor),
				k37_inData.k37_subjectAve(k37_inData.k37_eng), k37_inData.k37_subjectAve(k37_inData.k37_mat),
				k37_inData.k37_subjectAve(k37_inData.k37_sum), k37_inData.k37_aveAve(k37_inData.k37_ave));
	}

}
