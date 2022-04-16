package javajump6;

public class pt10 {

	static pt10_TvRemocon2 k37_rmt1;
	static pt10_TvRemocon2 k37_rmt2;

	public static void main(String[] args) {
		// 14pg 생성자, 리모컨
		k37_rmt1 = new pt10_TvRemocon2();
		k37_rmt2 = new pt10_TvRemocon2(10, 13);

		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt1.k37_ChannelUp(); k37_rmt1.k37_msg();
//			pt10_rmt2.k37_ChannelUp(); pt10_rmt2.k37_msg();
		}

		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt1.k37_ChannelDown(); k37_rmt1.k37_msg();
//			pt10_rmt2.k37_ChannelDown(); pt10_rmt2.k37_msg();
		}

		for (int k37_i = 0; k37_i < 10; k37_i++) {
//			pt10_rmt1.k37_VolUp(); pt10_rmt1.k37_msg();
			k37_rmt2.k37_VolUp(); k37_rmt2.k37_msg();
		}

		for (int k37_i = 0; k37_i < 10; k37_i++) {
//			pt10_rmt1.k37_VolDown(); pt10_rmt1.k37_msg();
			k37_rmt2.k37_VolDown(); k37_rmt2.k37_msg();
		}

	}

}
