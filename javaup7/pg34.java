package javajump7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class pg34 {
	// 클래스(pg34_OneRec) 어레이 리스트 생성 
	static ArrayList<pg34_OneRec> k37_ArrayOncRec = new ArrayList <pg34_OneRec>();
	
	static int k37_sumKor = 0;	//정수형 변수, 국어성적
	static int k37_sumEng = 0;	//정수형 변수, 영어성적
	static int k37_sumMat = 0;	//정수형 변수, 수학성적
	static int k37_sumSum = 0;	//정수형 변수, 성적합
	static int k37_sumAve = 0;	//정수형 변수, 성적평균
	static final int k37_iPerson = 20;	//학생수 입력
	
	public static void main(String[] args) {
		// pg34 ArrayList 정령(Sort)
		k37_dataSet();	//데이터 설정 메소드
		k37_dataSort();	//데이터를 오름차순하는 메소드
		k37_HeaderPrint();	//머릿글 출력 메소드
		for (int k37_i = 0; k37_i < k37_ArrayOncRec.size(); k37_i++) {
			k37_ItemPrint(k37_i);	//한 학생의 성적을 출력하는 메소드 실행
		}	
		k37_TailPrint();	// 마지막 줄 출력 메소드
		
	}
	
	public static void k37_dataSet() {	//데이터를 설정하는 메소드
		for(int i = 1; i <= k37_iPerson; i++) {	// 1부터 총 학생수 만큼 반복하는 for문 작성
			String k37_name = String.format("홍길%02d", i);	// 학생의 이름 입력
			int k37_kor = (int)(Math.random()*100);	//학생의 성적 입력, 국어, 0부터 99까지 생성하는 랜덤함수
			int k37_eng = (int)(Math.random()*100);	//학생의 성적 입력, 영어, 0부터 99까지 생성하는 랜덤함수
			int k37_mat = (int)(Math.random()*100);	//학생의 성적 입력, 수학, 0부터 99까지 생성하는 랜덤함수
			k37_ArrayOncRec.add(new pg34_OneRec(i, k37_name, k37_kor, k37_eng, k37_mat));	//입력한 성적을 어레이 리스트에 새클래스 형태로 추가한다.
		}
	}
	
	public static void k37_dataSort() {	// 데이터를 오름차순하는 메소드
		// pg34_OneRec에 대한 Comparator 선언
		Comparator <pg34_OneRec> k37_sort = new Comparator <pg34_OneRec>() {
			public int compare (pg34_OneRec a1, pg34_OneRec a2) {	// 비교할 두 값을 선언
				return (a2.k37_getSum() - a1.k37_getSum());	//성적합에 대한 데이터를 비교한다.
			}
		};
		Collections.sort(k37_ArrayOncRec, k37_sort);	//그에 따라 클레스 리스트의 순서를 바꾼다.
	}
	
	public static void k37_HeaderPrint() {	// 머릿글 출력 메소드
		System.out.println("*************************************");
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.println("*************************************");
	}
	
	public static void k37_ItemPrint(int i) {	//한 학생의 성적을 출력하는 메소드
		pg34_OneRec k37_rec;	//클래스 선언
		
		k37_rec = k37_ArrayOncRec.get(i);	//클래스 리스트중 i번째 클래스를 가겨온다.
		// 각가, 학생 id, 이름, 국어성적, 영어성적, 수학성정, 합계, 성적평균을 출력한다.
		System.out.printf("%2d %4s %4d %4d %4d   %3d %6.2f\n", k37_rec.k37_getStudentId(), k37_rec.k37_getName(), k37_rec.k37_getKor(),
				k37_rec.k37_getEng(), k37_rec.k37_getMat(), k37_rec.k37_getSum(), k37_rec.k37_getAve());
		//성적별 총합을 구하기위해 변수에 성적을 누적한다
		k37_sumKor += k37_rec.k37_getKor();	
		k37_sumEng += k37_rec.k37_getEng();
		k37_sumMat += k37_rec.k37_getMat();
		k37_sumSum += k37_rec.k37_getSum();
		k37_sumAve += k37_rec.k37_getAve();
	}
	
	public static void k37_TailPrint() {	//마지막 성적결과 출력
		System.out.println("*************************************");
		// 국어 성적 합계, 평균을 출력한다.
		System.out.printf("국어합계  %4d    국어평균: %6.2f\n",k37_sumKor, k37_sumKor/(double)k37_ArrayOncRec.size());
		// 영어 성적 합계, 평균을 출력한다.
		System.out.printf("영어합계  %4d    영어평균: %6.2f\n",k37_sumEng, k37_sumEng/(double)k37_ArrayOncRec.size());
		// 수학 성적 합계, 평균을 출력한다.
		System.out.printf("수학합계  %4d    수학평균: %6.2f\n",k37_sumMat, k37_sumMat/(double)k37_ArrayOncRec.size());
		System.out.println("*************************************");
		// 반평균 성적 합계, 평균을 출력한다.
		System.out.printf("반평균합계 %4d   반평균: %6.2f\n",k37_sumAve, k37_sumAve/(double)k37_ArrayOncRec.size());
	}
	
}


