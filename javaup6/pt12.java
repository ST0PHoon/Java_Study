package javajump6;

public class pt12 {
	
	public static void main(String[] args) {
		// 17pg 건전지 확인 기능 추가, 리모콘
		pt12_TvRemoconX k37_rmt3 = new pt12_TvRemoconX();
		
		
		k37_rmt3.k37_batteryCheck();

		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt3.k37_ChannelUp(); k37_rmt3.k37_msg();
//			k37_rmt3.k37_ChannelUp(); k37_rmt3.k37_msg();
		}
		
		k37_rmt3.k37_batteryCheck();
	}

}
