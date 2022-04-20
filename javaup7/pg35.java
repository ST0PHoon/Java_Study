package javajump7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class pg35 {
	static ArrayList<pg35_OneRec> k37_ArrayOncRec = new ArrayList <pg35_OneRec>();
	static int k37_sumKorCurrent = 0;	//현재페이지의 국어성적 합
	static int k37_sumEngCurrent = 0;	//현재페이지의 영어성적 합
	static int k37_sumMatCurrent = 0;	//현재페이지의 수학성적 합
	static int k37_sumSumCurrent = 0;	//현재페이지의 성적 합
	static double k37_sumAveCurrent = 0;	//현재페이지의 평균 합
	static int k37_sumKorTotal = 0;	//누적페이지의 국어성적 합
	static int k37_sumEngTotal = 0;	//누적페이지의 영어성적 합
	static int k37_sumMatTotal = 0;	//누적페이지의 수학성적 합
	static int k37_sumSumTotal = 0;	//누적페이지의 성적 합
	static double k37_sumAveTotal = 0;	//누적페이지의 평균의 합
	
	static int k37_counter = 0;	// 인원수 측정용 카운터
	
	static final int k37_iPerson = 200;	// 총인원수
	static final int k37_pgPerson = 30;	//페이지당 인원수
	static int k37_currentPagePerson = 0;	//현재페이지의 인원수
	static int k37_currentPageStackPerson = 0;	// 현재페이지의 누적 인원수
	
	static int k37_totalPages = 0;	//총 페이지 수
	
	public static void main(String[] args) {
		// pg30 클래스의 ArrayList
		k37_dataSet();	//데이터 세팅 메소드
		for ( int k37_i = 0; k37_i < k37_totalPages; k37_i++) {	//페이지수만큰 도는 for문 작성(현재7페이지)
			k37_HeaderPrint(k37_i);	// 페이지 정보, 출력일자가 담긴 머릿글 출력
			
			for(int k37_j = 0; k37_j < k37_currentPagePerson; k37_j++) {
				k37_ItemPrint();	// 학생의 성적을 출력한다.
			}
			k37_TailPrint();	//마지막 현재,누적 페이지의 성적합계와 평균을 출력한다.
		}
	}
	
	public static void k37_dataSet() {	// 데이터 세팅 메소드
		for(int k37_i = 1; k37_i <= k37_iPerson; k37_i++) {	//총 인원수 만큼 도는 for문 작성
			String k37_name = String.format("정지%02d", k37_i);	// 포멧에 맞게 이름입력
			int k37_kor = (int)(Math.random()*100);	//0부터 99까지 생성하는 랜덤함수로 성적입력
			int k37_eng = (int)(Math.random()*100);	//0부터 99까지 생성하는 랜덤함수로 성적입력
			int k37_mat = (int)(Math.random()*100);	//0부터 99까지 생성하는 랜덤함수로 성적입력
			// 클래스 어레이에 입력한 값들을 가진 클래스 추가
			k37_ArrayOncRec.add(new pg35_OneRec(k37_i, k37_name, k37_kor, k37_eng, k37_mat));
		}
		// 총페이지 계산하는 if
		if (k37_iPerson % k37_pgPerson == 0) {
			k37_totalPages = k37_iPerson / k37_pgPerson;
		} else {
			k37_totalPages = (k37_iPerson / k37_pgPerson) + 1;
		}
	}
	
	public static void k37_dataSort() {	// 데이터를 오름차순하는 메소드
		// pg34_OneRec에 대한 Comparator 선언
		Comparator <pg35_OneRec> k37_sort = new Comparator <pg35_OneRec>() {
			public int compare (pg35_OneRec a1, pg35_OneRec a2) {	// 비교할 두 값을 선언
				return (a2.k37_getSum() - a1.k37_getSum());	//성적합에 대한 데이터를 비교한다.
			}
		};
		Collections.sort(k37_ArrayOncRec, k37_sort);	//그에 따라 클레스 리스트의 순서를 바꾼다.
	}
	
	public static void k37_HeaderPrint(int k37_i) {
		//시간의 형태를 짜둔다.
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd HH:mm:ss");
		//현재시간을 가져온다.
		Date k37_time = new Date();
		//선언한 문자열에 포멧에 맞춰 시간을 입력한다.	
		String k37_time1 = format1.format(k37_time);
		
		System.out.printf("PAGE: %d            출력일자 : "  + k37_time1 + "\n", k37_i + 1);	//현재 페이지(0이라 + 1)와 날짜를 출력한다.
		System.out.println("==================================================");
		System.out.printf("%-2.2s %-4.4s %4.4s %5.5s %5.5s %5.5s %4.4s\n","번호","이름","국어","영어","수학","총점","평균");	//구분 출력
		System.out.println("==================================================");
		// 페이지별 인원수 설정
		if(k37_i + 1 == k37_totalPages) {	// 마지막페이지라면
			if (k37_iPerson == k37_pgPerson) {	// 총인원 = 페이지당 인원 동일할때 0명 뜨는 에레 수정
				k37_currentPagePerson = k37_pgPerson;	// 총인원수 입력
			}else {
				k37_currentPagePerson = k37_iPerson % k37_pgPerson;	// 200 30 이라면 20명이 들어간다.
			}
		} else {	
			k37_currentPagePerson = k37_pgPerson;	// 나머지의 경우 페이지에 페이지당 인원을 넣는다.
		}
		// 페이지당 누적인원 계산
		k37_currentPageStackPerson +=  k37_currentPagePerson;
			
	}
	
	public static void k37_ItemPrint() {	//학생 성적출력 메소드
		pg35_OneRec k37_rec;	// 클래스 선언
		// 클래스 리스트에서 k37_counter번째 클래스 선언
		k37_rec = k37_ArrayOncRec.get(k37_counter);
		// 학번, 이름, 국어, 영어, 수학, 합계, 평균을 출력하는 printf 선언
		System.out.printf("%03d %5.5s %5d %7d %7d %7d %7.2f\n", k37_rec.k37_getStudentId(), k37_rec.k37_getName(), k37_rec.k37_getKor(),
				k37_rec.k37_getEng(), k37_rec.k37_getMat(), k37_rec.k37_getSum(), k37_rec.k37_getAve());
		
		k37_counter++;	// 다음학생으로 넘기는 ++
		//학생의 성적을 페이지 점수와 누적 점수별 / 과목별로 나눠서 누적한다.
		k37_sumKorCurrent += k37_rec.k37_getKor(); k37_sumKorTotal += k37_rec.k37_getKor();
		k37_sumEngCurrent += k37_rec.k37_getEng(); k37_sumEngTotal += k37_rec.k37_getEng();
		k37_sumMatCurrent += k37_rec.k37_getMat(); k37_sumMatTotal += k37_rec.k37_getMat();
		k37_sumSumCurrent += k37_rec.k37_getSum(); k37_sumSumTotal += k37_rec.k37_getSum();
		k37_sumAveCurrent += k37_rec.k37_getAve(); k37_sumAveTotal += k37_rec.k37_getAve();
		
	}
	
	public static void k37_TailPrint() {
		System.out.println("==================================================");
		
		System.out.println("현재페이지");
		//현재 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_curSubjectSum 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
		//평균은 실수형이기 때문에 k37_curAveSum의 메소드 따로 생성
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계",k37_sumKorCurrent, k37_sumEngCurrent, k37_sumMatCurrent, k37_sumSumCurrent, k37_sumAveCurrent);
		
		//현재 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_cursubjectAve 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
		//평균은 실수형이기 때문에 k37_curaveAve의 메소드 따로 생성
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n", "평균", (double)k37_sumKorCurrent / k37_currentPagePerson, (double)k37_sumEngCurrent / k37_currentPagePerson,
				(double)k37_sumMatCurrent / k37_currentPagePerson, (double) k37_sumSumCurrent / k37_currentPagePerson, (double) k37_sumAveCurrent / k37_currentPagePerson);
		
		System.out.println("==================================================");
		
		//지금까지 페이지의 과목별 성적합을 보여준다. k37_inData 클래스에서 k37_totalSubjectSum 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 성적합을 리턴.
		//평균은 실수형이기 때문에 k37_totalAveSum의 메소드 따로 생성
		System.out.println("누적페이지");
		System.out.printf("%2.2s %12d %7d %7d %7d %8.2f\n", "합계", k37_sumKorTotal, k37_sumEngTotal, k37_sumMatTotal, k37_sumSumTotal,k37_sumAveTotal);
		
		//지금까지 페이지의 과목별 평균을 보여준다. k37_inData 클래스에서 k37_totalsubjectAve 메소드에 k37_i(몇 페이지)와 각 성적의 배열을 보내주고, 과목별 평균을 리턴.
		//평균은 실수형이기 때문에 k37_totalaveAve의 메소드 따로 생성
		System.out.printf("%2.2s %12.2f %7.2f %7.2f %7.2f %8.2f\n\n\n", "평균", (double)k37_sumKorTotal / k37_currentPageStackPerson, (double)k37_sumEngTotal / k37_currentPageStackPerson,
				(double)k37_sumMatTotal / k37_currentPageStackPerson, (double)k37_sumSumTotal / k37_currentPageStackPerson, (double)k37_sumAveTotal / k37_currentPageStackPerson);
		// 다음페이지로 넘어갈때 페이지별 성적 초기화
		k37_sumKorCurrent = 0;	
		k37_sumEngCurrent = 0;
		k37_sumMatCurrent = 0;
		k37_sumSumCurrent = 0;
		k37_sumAveCurrent = 0;
		
	}
	
}
