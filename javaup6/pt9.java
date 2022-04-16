package javajump6;

public class pt9 {
	// 12, 13pg 생성자
	static pt9_elev2 k37_elev1;
	static pt9_elev2 k37_elev2;
	static pt9_elev2 k37_elev3;

	public static void main(String[] args) {
		k37_elev1 = new pt9_elev2();
		k37_elev2 = new pt9_elev2(20, 1, 8);
		k37_elev3 = new pt9_elev2(50, -3, 5);

		for (int k37_i = 0; k37_i < 20; k37_i++) {
			k37_elev1.k37_up(); k37_elev1.k37_msg("1번 엘레베이터 한층 오르기");
//			k37_elev2.k37_up(); k37_elev2.k37_msg("2번 엘레베이터 한층 오르기");
//			k37_elev3.k37_up(); k37_elev3.k37_msg("3번 엘레베이터 한층 오르기");
		}

		for (int k37_i = 0; k37_i < 20; k37_i++) {
//			k37_elev1.k37_up(2); k37_elev1.k37_msg("1번 엘레베이터 2층 오르기");
//			k37_elev2.k37_up(2); k37_elev2.k37_msg("2번 엘레베이터 2층 오르기");
			k37_elev3.k37_up(2); k37_elev3.k37_msg("3번 엘레베이터 2층 오르기");
		}

		for (int k37_i = 0; k37_i < 20; k37_i++) {
//			k37_elev1.k37_up(3); k37_elev1.k37_msg("1번 엘레베이터 3층 내리기");
			k37_elev2.k37_up(3); k37_elev2.k37_msg("2번 엘레베이터 3층 내리기");
//			k37_elev3.k37_up(3); k37_elev3.k37_msg("3번 엘레베이터 3층 내리기");
		}

	}

}
