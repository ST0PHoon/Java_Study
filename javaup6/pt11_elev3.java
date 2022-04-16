package javajump6;

public class pt11_elev3 extends pt9_elev2{
	// 16pg 상속으로 클래스 만들기
	void k37_Repair() {
		k37_help = String.format("수리중입니다");
	}
	
	// 18pg
	void k37_up() {
		if(k37_floor >= k37_limit_up_floor) {
			k37_help = "마지막층입니다.";
		} else {
			k37_floor = k37_floor + 2;
			k37_help = String.format("%d층입니다.", k37_floor);
		}
		
		this.k37_down();
	}
	
	void k37_down() {
		super.k37_down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n",this.k37_help);
		//this.k37_down(); 재귀호출시 뺑뺑이
	}
}
