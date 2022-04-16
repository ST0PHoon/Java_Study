package javajump6;

public class pt15 {

	public static void main(String[] args) {
		// 40 pg 성적집계표 출력
		int k37_iPerson = 200;
		int k37_onepagePerson = 30;
		pt15_InputData k37_inData = new pt15_InputData(k37_iPerson, k37_onepagePerson);
		
		String k37_time1 = k37_inData.k37_printDate();
		
		int[] k37_personGroupArray = k37_inData.k37_perPagePerson();
		
		for (int k37_i = 0; k37_i < k37_personGroupArray.length; k37_i++) {
			int k37_startNumber = k37_inData.k37_currentStartNumber(k37_i, k37_personGroupArray);
			
			for (int k37_j = 0; k37_j < k37_personGroupArray[k37_i]; k37_j++) {
				String k37_name = String.format("정지%03d", (k37_startNumber + k37_j + 1));
				int k37_kor = (int)(Math.random() * 100);	// 국어점수 만들기
				int k37_eng = (int)(Math.random() * 100);	// 영어점수 만들기
				int k37_mat = (int)(Math.random() * 100);	// 수학점수 만들기
				k37_inData.k37_SetDate(k37_startNumber + k37_j + 1, k37_name,k37_kor,k37_eng,k37_mat);
			}
			
			System.out.printf("PAGE: %d       출력일자 :"  + k37_time1 + "\n", k37_i + 1);
			System.out.println("=========================================");
			System.out.printf("%-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s %-4.4s\n","번호","이름","국어","영어","수학","총점","평균");
			System.out.println("=========================================");
			
			for (int k37_k = 0; k37_k < k37_personGroupArray[k37_i]; k37_k++) {
				System.out.printf("%03d %5.5s %3d   %3d   %3d   %3d   %.2f\n",
						k37_inData.k37_i[k37_k + k37_startNumber], k37_inData.k37_name[k37_k + k37_startNumber],
						k37_inData.k37_kor[k37_k + k37_startNumber], k37_inData.k37_eng[k37_k + k37_startNumber],
						k37_inData.k37_mat[k37_k + k37_startNumber], k37_inData.k37_sum[k37_k + k37_startNumber],
						k37_inData.k37_ave[k37_k + k37_startNumber]);
			}
			System.out.println("=========================================");
			
			System.out.println("현재페이지");
			System.out.printf("%-2.2s        %4d  %4d  %4d  %4d  %.2f\n", "합계",k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_curSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_curAveSum(k37_i, k37_inData.k37_ave));
			
			System.out.printf("%-2.2s       %4.2f %4.2f %4.2f %4.2f  %.2f\n", "평균",k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_cursubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_curaveAve(k37_i, k37_inData.k37_ave));
			
			System.out.println("누적페이지");
			System.out.printf("%-2.2s        %4d  %4d  %4d  %4d  %.2f\n", "합계",k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_eng), k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalSubjectSum(k37_i, k37_inData.k37_sum), k37_inData.k37_totalAveSum(k37_i, k37_inData.k37_ave));
			
			System.out.printf("%-2.2s       %4.2f %4.2f %4.2f %4.2f  %.2f\n", "평균",k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_kor),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_eng), k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_mat),
					k37_inData.k37_totalsubjectAve(k37_i, k37_inData.k37_sum), k37_inData.k37_totalaveAve(k37_i, k37_inData.k37_ave));
			
		}
		

		



	}

}
