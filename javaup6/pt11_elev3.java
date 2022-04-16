package javajump6;

public class pt11_elev3 extends pt9_elev2{
	// 16pg 상속으로 클래스 만들기
	//pt9_elev2 를 상속받아 내용을 재정의 할 수 있다.(이때 private으로 선언 되어있을 경우 수정 불가
	void k37_Repair() {
		k37_help = String.format("수리중입니다");
	}
	
	// 18pg
	void k37_up() {	// 어버이 클래스를 상속받아 재정의
		if(k37_floor >= k37_limit_up_floor) {	//아버지 클래스의 k37_up 재구현
			k37_help = "마지막층입니다.";
		} else {
			k37_floor = k37_floor + 2;	//여기선 2층 올라가게 설계
			k37_help = String.format("%d층입니다.", k37_floor);
		}
		
		this.k37_down();	//아래 k37_down()을 실행하므로 1층 내리고 printf에 설정해둔 메세지가 출력된다.
		//최종적으로 2층 올리가고 1층 내려가면서 메세지 출력하는 메소드
	}
	
	void k37_down() {
		super.k37_down();	//아버지 클래스의 down을 가져와 실행, 위에 k37_up처럼 직접 칠 필요없음
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n",this.k37_help);	//클래스 안에서 메세지 출력하는걸 확인하기 위함
		//this.k37_down(); 재귀호출시 뺑뺑이
	}
}
