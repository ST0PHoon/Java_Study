package javajump6;

public class pt6_Tv {

	public static void main(String[] args) {
		// 9pg 클래스 객체 인스턴스, tv 리모컨 누르기
		pt6_TvRemocon k37_rmc = new pt6_TvRemocon();	// 티비리모콘 클래스 선언
		
		for(int i = 0; i < 5; i++) {	//볼륨 올리기 5번 실행
			k37_rmc.k37_VolUp();
		}
		
		for(int i = 0; i < 5; i++) {	//볼륨 낮추기 5번 실행
			k37_rmc.k37_VolDown();
		}
		
		for(int i = 0; i < 10; i++) {	//채널 올리기 10번 실행
			k37_rmc.k37_ChannelUp();
		}
		
		for(int i = 0; i < 10; i++) {	//채널 낮추기 10번 실행
			k37_rmc.k37_ChannelDown();
		}
		
		
	}

}
