package javajump6;

public class pt9_elev2 {
	// 12, 13pg 생성자 
	//elev3 의 extends 예시를 들기위해 private에서 public으로 변경
	public int k37_limit_up_floor;		//private(클래스내에서만 사용가능) 정수형 변수 선언, 최상층
	public int k37_limit_down_floor;	//private(클래스내에서만 사용가능) 정수형 변수 선언, 최하층
	public int k37_floor;				//private(클래스내에서만 사용가능) 정수형 변수 선언, 현재층
	public String k37_help;	//private(클래스내에서만 사용가능) 문자열형 변수 선언, 도움말 문자열
	
	pt9_elev2() {
		k37_limit_up_floor = 10;
		k37_limit_down_floor = 1;
		k37_floor = 1;
		k37_help = "엘리베이터 기본 준공관료";
	}
	
	pt9_elev2(int k37_up_floor, int k37_d_floor, int k37_in_floor) {
		k37_limit_up_floor = k37_up_floor;
		k37_limit_down_floor = k37_d_floor;
		k37_floor = k37_in_floor;
		k37_help = "엘리베이터 맞춤 준공관료";
	}
	
	void k37_up() {
		if(k37_floor == k37_limit_up_floor) {
			k37_help = "마지막 층입니다";
		} else {
			k37_floor++;
			k37_help = String.format("[%d] 층입니다.", k37_floor);
		}
	}
	
	void k37_down() {
		if(k37_floor == k37_limit_up_floor) {
			k37_help = "처음 층입니다";
		} else {
			k37_floor--;
			k37_help = String.format("[%d] 층입니다.", k37_floor);
		}
	}
	
	void k37_up(int k37_u) {
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_up();
	}
	
	void k37_down(int k37_u) {
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_down();
	}
	
	void k37_msg(String k37_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				k37_id,k37_help,k37_limit_up_floor,k37_limit_down_floor,k37_floor);
	}
	
}
