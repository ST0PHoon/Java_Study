package javajump6;

public class pt9 {
	// 12, 13pg 생성자
	//pt9_elev2 클래스를 각각 k37_elev 1, 2, 3의 이름으로 여러번 호출(서로 독립적)
	static pt9_elev2 k37_elev1;
	static pt9_elev2 k37_elev2;
	static pt9_elev2 k37_elev3;

	public static void main(String[] args) {
		k37_elev1 = new pt9_elev2();	//elev1은 매개변수가 없는 자신을 호출
		k37_elev2 = new pt9_elev2(20, 1, 8);	//elev2는 최고 20층, 최저 1층, 현재 8층으로 세팅
		k37_elev3 = new pt9_elev2(50, -3, 5);	//elev3는 최고 50층, 최저 지하3층, 현재 5층으로 세팅

		//층수를 1층씩 올리는 명령과 이후 메세지 출력을 20번 반복
		for (int k37_i = 0; k37_i < 20; k37_i++) {
			k37_elev1.k37_up(); k37_elev1.k37_msg("1번 엘레베이터 한층 오르기");
//			k37_elev2.k37_up(); k37_elev2.k37_msg("2번 엘레베이터 한층 오르기");
//			k37_elev3.k37_up(); k37_elev3.k37_msg("3번 엘레베이터 한층 오르기");
		}

		//층수를 n층만큼 올라가는 메소드를 호출해서 2를 입력하고, 실행후 층 정보를 보여주는 메소드 실행, 20번
		for (int k37_i = 0; k37_i < 20; k37_i++) {
//			k37_elev1.k37_up(2); k37_elev1.k37_msg("1번 엘레베이터 2층 오르기");
//			k37_elev2.k37_up(2); k37_elev2.k37_msg("2번 엘레베이터 2층 오르기");
			k37_elev3.k37_up(2); k37_elev3.k37_msg("3번 엘레베이터 2층 오르기");
		}

		//층수를 n층만큼 내려가는 메소드를 호출해서 3를 입력하고, 실행후 층 정보를 보여주는 메소드 실행, 20번
		for (int k37_i = 0; k37_i < 20; k37_i++) {
//			k37_elev1.k37_down(3); k37_elev1.k37_msg("1번 엘레베이터 3층 내리기");
			k37_elev2.k37_down(3); k37_elev2.k37_msg("2번 엘레베이터 3층 내리기");
//			k37_elev3.k37_down(3); k37_elev3.k37_msg("3번 엘레베이터 3층 내리기");
		}

	}

}
