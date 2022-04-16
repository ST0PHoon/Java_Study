package javajump6;

public class pt12 {
	
	public static void main(String[] args) {
		// 17pg 건전지 확인 기능 추가, 리모콘
		// pt12_TcRemoconX 를 k37_rmt3로 선언
		pt12_TvRemoconX k37_rmt3 = new pt12_TvRemoconX();
		
		k37_rmt3.k37_batteryCheck();	//상속받아 추가한 함수 실행
		
		//채널 올리고 현재 채널 알려주는 메소드 실행, 5번
		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_rmt3.k37_ChannelUp(); k37_rmt3.k37_msg();
//			k37_rmt3.k37_ChannelUp(); k37_rmt3.k37_msg();
		}
		
		k37_rmt3.k37_batteryCheck();	//상속받아 추가한 함수 실행
	}

}
