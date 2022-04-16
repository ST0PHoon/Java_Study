package javajump6;

public class pt9_elev2 {
	// 12, 13pg 생성자 
	//elev3 의 extends 예시를 들기위해 private에서 public으로 변경
	public int k37_limit_up_floor;		//private(클래스내에서만 사용가능) 정수형 변수 선언, 최상층
	public int k37_limit_down_floor;	//private(클래스내에서만 사용가능) 정수형 변수 선언, 최하층
	public int k37_floor;				//private(클래스내에서만 사용가능) 정수형 변수 선언, 현재층
	public String k37_help;	//private(클래스내에서만 사용가능) 문자열형 변수 선언, 도움말 문자열
	
	pt9_elev2() {	//생성자 선언, 기본적인 세팅값을 변수에 입력
		k37_limit_up_floor = 10;	// 최상층 10 입력
		k37_limit_down_floor = 0;	// 최하층 0 입력
		k37_floor = 1;		//현재층 1 입력
		k37_help = "엘리베이터 기본 준공완료";	//도움말로 기본 준광완료의 메세지 입력
	}
	
	pt9_elev2(int k37_up_floor, int k37_d_floor, int k37_in_floor) {	//생성자 오버로딩, 생성 정수형 변수 3개 받음
		k37_limit_up_floor = k37_up_floor;	//받아온 최상층 정수를 입력
		k37_limit_down_floor = k37_d_floor;	//받아온 최하층 정수를 입력
		k37_floor = k37_in_floor;			//받아온 현재층 정수를 입력
		k37_help = "엘리베이터 맞춤 준공완료";		//맞춤 준공완료로 메세지 입력
	}
	
	void k37_up() {	//층수를 올리는 메소드 선언. 리턴 없음
		if(k37_floor == k37_limit_up_floor) {	//최상층이라면 마지막이라고 메세지 입력
			k37_help = "마지막 층입니다";
		} else {	//최상층이 아니라면 현재층을 1올리고 메세지에 현재층을 출력하는 메세지 입력
			k37_floor++;	//현재층의 1층 상승
			k37_help = String.format("[%d] 층입니다.", k37_floor);	//도움말 변경, 바뀐 현재층 입력
		}
	}
	
	void k37_down() {	//한층 내리는 메소드 선언. 리턴 없음
		if(k37_floor == k37_limit_down_floor) {	//최하층이라면 처음층이라고 메세지 입력
			k37_help = "처음 층입니다";
		} else {	//그게 아니라면 현재층에서 1층 내리고 현재층 메세지 출력
			k37_floor--;
			k37_help = String.format("[%d] 층입니다.", k37_floor);
		}
	}
	
	void k37_up(int k37_u) {	// 정수형 변수를 받아 그수만큼 층을 올리는 함수 선언. 리턴 없음
		//this를 통해 오버로딩 된 메소드를 this를 써서 호출, 층수만큼 k37_up()실행, 결과적으로 k37_u만큼 층 상승
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_up();
	}
	
	void k37_down(int k37_u) {	// 정수형 변수를 받아 그수만큼 층을 내리는 함수 선언. 리턴 없음
		//this를 통해 오버로딩 된 메소드를 this를 써서 호출, 층수만큼 k37_down()실행, 결과적으로 k37_u만큼 층 하강
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_down();
	}
	
	void k37_msg(String k37_id) {	// 입력받은 문자열을 출력하면서, 추가로 층수에 대한 정보를 출력하는 메소드
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				k37_id,k37_help,k37_limit_up_floor,k37_limit_down_floor,k37_floor);
	}
	
}
