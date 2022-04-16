package javajump6;

public class pt10 {

	static pt10_TvRemocon2 k37_rmt1;	// 전역에서 클래스를 넣을 이름 선언
	static pt10_TvRemocon2 k37_rmt2;	// 전역으로 클래스를 넣을 이름 선언

	public static void main(String[] args) {
		// 14pg 생성자, 리모컨
		k37_rmt1 = new pt10_TvRemocon2();	//변수를 받지않는 생성자 메소드 선언
		k37_rmt2 = new pt10_TvRemocon2(10, 13);	//정수형 변수 2개를 지정해서 받는 생성자 메소드 선언
		
		//채널을 1개 올리는 메소드를 실행 후, 메세지를 출력하는 메소드 실행, 을 5번 반복
		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt1.k37_ChannelUp(); k37_rmt1.k37_msg();
//			pt10_rmt2.k37_ChannelUp(); pt10_rmt2.k37_msg();
		}
		
		//채널을 1개 내리는 메소드를 실행 후, 메세지를 출력하는 메소드 실행, 을 5번 반복
		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt1.k37_ChannelDown(); k37_rmt1.k37_msg();
//			pt10_rmt2.k37_ChannelDown(); pt10_rmt2.k37_msg();
		}

		//볼륨을 1개 올리는 메소드를 실행 후, 메세지를 출력하는 메소드 실행, 을 10번 반복
		for (int k37_i = 0; k37_i < 10; k37_i++) {
//			pt10_rmt1.k37_VolUp(); pt10_rmt1.k37_msg();
			k37_rmt2.k37_VolUp(); k37_rmt2.k37_msg();
		}

		//볼륨을 1개 내리는 메소드를 실행 후, 메세지를 출력하는 메소드 실행, 을 10번 반복
		for (int k37_i = 0; k37_i < 10; k37_i++) {
//			pt10_rmt1.k37_VolDown(); pt10_rmt1.k37_msg();
			k37_rmt2.k37_VolDown(); k37_rmt2.k37_msg();
		}

	}

}
