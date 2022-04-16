package javajump6;

public class pt13 {

	public static void main(String[] args) {
		// 38pg ReportSheet, 클래스 만들기
		int k37_iPerson = 10;	//인원수 정수형으로 입력 10명
		//다른 클래스 k37_inData로 선언
		pt13_InputData k37_inData = new pt13_InputData(k37_iPerson);
		
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			String k37_name = String.format("정지%02d", k37_i);	//문자열 이름생성 (정지 + 넘버링 형태)
			//랜덤 함수는 0이상 ~ 1미만의 double형 수를 무작위로 생성, 0부터 100사이를 만들기위해 곱하기 100실시
			int k37_kor = (int)(Math.random() * 100);	// 국어점수 만들기, double > int 형으로 형변환
			int k37_eng = (int)(Math.random() * 100);	// 영어점수 만들기, double > int 형으로 형변환
			int k37_mat = (int)(Math.random() * 100);	// 수학점수 만들기, double > int 형으로 형변환
			// 위에서 생성한 값들을 받는 다른 클래스의 메소드로 보냄
			k37_inData.k37_SetDate(k37_i,k37_name,k37_kor,k37_eng,k37_mat);	
		}
		// 받은 인원수 만큼 실행하는 for문 생성
		for (int k37_i = 0; k37_i < k37_iPerson; k37_i++) {
			// 번호, 다른 클래스에서 선언된 배열에서 필요한 값, 양식에 맞춰서 출력, 학생별 성적, 총점 평균
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					k37_i, k37_inData.k37_name[k37_i], k37_inData.k37_kor[k37_i], k37_inData.k37_eng[k37_i],
					k37_inData.k37_mat[k37_i], k37_inData.k37_sum[k37_i], k37_inData.k37_ave[k37_i]);
		}
	}

}
