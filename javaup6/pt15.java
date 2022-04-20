package javajump6;

public class pt15 {

	public static void main(String[] args) {
		// 40 pg 성적집계표 출력
		int k37_iPerson = 12;		// 총 인원수 입력, 정수형, 200명
		int k37_onepagePerson = 11;	// 한페이지당 보여줄 인원수 입력, 정수형, 30명
		//생성자, k37_iPerson, k37_onepagePerson를 변수로 받는 메소드 선언, k37_nData로 사용
		pt15_InputData k37_inData = new pt15_InputData(k37_iPerson, k37_onepagePerson);
		//현재시간 설정해둔 포멧에 맞게 출력해서 문자열에 입력
		String k37_time1 = k37_inData.k37_printDate();
		//정수형 배열, 총 몇페이지(200)가 나오며, 각 페이지마다 몇명이 표시될지 담는다. {30, 30, 30, 30, 30, 30, 20} 형태로 담길 예정
		int[] k37_personGroupArray = k37_inData.k37_perPagePerson();
		//총 페이지수 만큼 도는 for문 작성. 0부터 1씩증가하며 6까지 돈다.
		for (int k37_i = 0; k37_i < k37_personGroupArray.length; k37_i++) {
			// 각 페이지 별로 시작하는 숫자를 리턴, 현재 몇번째 for문인지(k37_i)를 변수로 받는다. 1페이지 0, 2페이지 30 .. 마지막 180
			int k37_startNumber = k37_inData.k37_currentStartNumber(k37_i);
			// 해당 페이지의 인원수 만큼 도는 for문 작성, 평소에 30번, 마지막은 20번 돈다.
			for (int k37_j = 0; k37_j < k37_personGroupArray[k37_i]; k37_j++) {
				String k37_name = String.format("정지%03d", (k37_startNumber + k37_j + 1));	//문자열 이름생성, 1번부터 시작이라 + 1
				//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
				int k37_kor = (int)(Math.random() * 100);	// 국어점수 만들기, double > int 형으로 형변환
				int k37_eng = (int)(Math.random() * 100);	// 영어점수 만들기, double > int 형으로 형변환
				int k37_mat = (int)(Math.random() * 100);	// 수학점수 만들기, double > int 형으로 형변환
				// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄, 숫자에 1더한 이유는 1번부터 시작이기 때문이다.
				k37_inData.k37_SetDate(k37_startNumber + k37_j + 1, k37_name,k37_kor,k37_eng,k37_mat);
			}
			
			System.out.printf("PAGE: %d            출력일자 : "  + k37_time1 + "\n", k37_i + 1);	//현재 페이지(0이라 + 1)와 날짜를 출력한다.
			System.out.println("==================================================");
			System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n","번호","이름","국어","영어","수학","총점","평균");	//구분 출력
			System.out.println("==================================================");
			
			// 해당 페이지의 인원수 만큼 도는 for문 작성, 평소에 30번, 마지막은 20번 돈다.
			for (int k37_k = 0; k37_k < k37_personGroupArray[k37_i]; k37_k++) {
				// k37_k + k37_startNumber는 페이지 시작번호 + 내가 페이지에서 몇번째, 그럼 누적 번호가 된다.1부터 30, 30 ~ 60 .. 180 ~ 200으로 늘어남
				// 성적배열에서 내 성적을 꺼내온다. 배열이여서 +1은 안했으며, 각 배열의 크기는 200이다.
				System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n",
						k37_inData.k37_i[k37_k + k37_startNumber], k37_inData.k37_name[k37_k + k37_startNumber],
						k37_inData.k37_kor[k37_k + k37_startNumber], k37_inData.k37_eng[k37_k + k37_startNumber],
						k37_inData.k37_mat[k37_k + k37_startNumber], k37_inData.k37_sum[k37_k + k37_startNumber],
						k37_inData.k37_ave[k37_k + k37_startNumber]);
			}
			System.out.println("==================================================");
			
			System.out.println("현재페이지");
			//현재 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_curSubjectSum 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			//평균은 실수형이기 때문에 k37_curAveSum의 메소드 따로 생성
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계",k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_curAveSum(k37_i, k37_inData.k37_ave));
			
			//현재 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_cursubjectAve 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
			//평균은 실수형이기 때문에 k37_curaveAve의 메소드 따로 생성
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "평균",k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_curaveAve(k37_i, k37_inData.k37_ave));
			
			System.out.println("==================================================");
			
			//지금까지 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_totalSubjectSum 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
			//평균은 실수형이기 때문에 k37_totalAveSum의 메소드 따로 생성
			System.out.println("누적페이지");
			System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계",k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_totalAveSum(k37_i, k37_inData.k37_ave));
			
			//지금까지 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_totalsubjectAve 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
			//평균은 실수형이기 때문에 k37_totalaveAve의 메소드 따로 생성
			System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "평균",k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_totalaveAve(k37_i, k37_inData.k37_ave));
			
		}


	}

}
