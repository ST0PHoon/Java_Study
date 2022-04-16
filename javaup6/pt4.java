package javajump6;

public class pt4 {
	// 7pg 클래스, 객체, 인스턴스
	int k37_limit_up_floor = 10;	//정수형 변수 선언, 최상층 설정
	int k37_limit_down_floor = 0;	//정수형 변수 선언, 최저층 설정
	int k37_floor = 1;		//정수형 변수 선언, 현재층 선언
	String k37_help;		//문자열 변수 선언 몇층인지 출력할 때 사용
	
	void k37_up() {	//엘리베이터가 올라감, void 메소드 선언
		if (k37_floor == k37_limit_up_floor) {	//만약 최상층이면 마지막층입니다. 출력
			k37_help = "마지막층입니다.";
		} else {
			k37_floor++;	//최상층이 아닐 때 한 층씩 올라감.
			k37_help = String.format("%d층입니다.", k37_floor);	//현재 몇층인지 문자열에 입력
		}
	}
	
	void k37_down() {	//엘리베이터가 내려감, void 메소드 선언
		if (k37_floor == k37_limit_down_floor) {	//최저층일 때, 처음층입니다. 출력
			k37_help = "처음층입니다.";
		} else {	//최저층이 아니라면
			k37_floor--;		//한 층 내려가고
			k37_help = String.format("%d층입니다.", k37_floor);	//현재 층을 문자열에 입력
		}
	}

}
