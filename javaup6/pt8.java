package javajump6;

public class pt8 {

	public static void main(String[] args) {
		// 11pg 메소드 오버로딩
		// 합, 평균 계산하는 클래스 선언
		pt8_calAvg k37_avg = new pt8_calAvg();
		
		//기본 성적 정보 입력, 및 합, 평균을 입력할 정수형, 실수형 변수 각각 선언
		int k37_Korean = 80, k37_English = 90, k37_Math = 100,
			k37_Science = 100, k37_Society = 70,  k37_Sum = 0;
		double k37_Avg= 0.0;
		
		// 3개의 성적을 받아서 평균과 합을 구하는 다른 클래스의 메소드 실행, 각각 double형과 int형 / 이하 포멧에 맞춰서 메세지 출력
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean);
		
		System.out.println("3월 성적표");
		System.out.printf("=============================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","총점","평균");
		System.out.printf("=============================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4.1f\n\n","폴리융",k37_Korean,k37_English,k37_Math,k37_Sum,k37_Avg);
		
		// 4개의 성적을 받아서 평균과 합을 구하는 다른 클래스의 메소드 실행, 각각 double형과 int형 / 이하 포멧에 맞춰서 메세지 출력
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean, k37_Science);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean, k37_Science);
		
		System.out.println("4월 성적표");
		System.out.printf("=================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","과학","총점","평균");
		System.out.printf("=================================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4d%-4.1f\n\n","폴리융",k37_Korean,k37_English,k37_Math,k37_Science,k37_Sum,k37_Avg);
		
		// 5개의 성적을 받아서 평균과 합을 구하는 다른 클래스의 메소드 실행, 각각 double형과 int형 / 이하 포멧에 맞춰서 메세지 출력
		k37_Avg = k37_avg.k37_sumAvg(k37_Math, k37_English, k37_Korean, k37_Science, k37_Society);
		k37_Sum = k37_avg.k37_sum(k37_Math, k37_English, k37_Korean, k37_Science, k37_Society);
		
		System.out.println("5월 성적표");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s%-4.4s\n","이름","국어","영어","수학","과학","사회","총점","평균");
		System.out.printf("=====================================\n");
		System.out.printf("%-4.4s%-4d%-4d %-4d %-4d %-4d %-4d%-4.1f\n\n","폴리융",k37_Korean,k37_English,k37_Math,k37_Sum,k37_Science,k37_Society,k37_Avg);
	}

}
