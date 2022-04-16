package javajump6;

public class pt10_TvRemocon2 {
	// 14pg 생성자, 리모콘
	private int k37_Vol;	//현재볼륨
	private int k37_Channel;	//현재채널
	
	pt10_TvRemocon2() {	// 생성자 선언
		k37_Vol = 5;	// 현재볼륨
		k37_Channel = 48;	// 현재채널
	}
	
	pt10_TvRemocon2(int k37_currentVol, int k37_currentCh) { //생성자 선언, 정수형 변수 2개 받음, 오버로딩
		k37_Vol = k37_currentVol;	//현재볼륨
		k37_Channel = k37_currentCh;	//현재채널
	}
	
	void k37_VolUp() {	// 볼륨 올리는 함수 선언, 리턴값 없음
		k37_Vol++;	// 볼륨 1개 증가
		System.out.printf("볼륨증가");	//현재 볼륨 출력 메세지 포맷
	}

	void k37_VolDown() {
		k37_Vol--;	//볼륨 하나 낮추기
		System.out.printf("볼륨감소");	//현재 볼륨 출력 메세지 포맷
	}

	void k37_ChannelUp() {
		k37_Channel++;	//채널 하나 올리기
		System.out.printf("채널증가");	//현재 채널 출력 메시지 포맷
	}

	void k37_ChannelDown() {
		k37_Channel--;	//채널 하나 낮추기
		System.out.printf("채널감소");	//현재 채널 출력 메시지 포맷
	}
	
	void k37_msg() {	//현재 채널과 볼륨 출력
		System.out.printf("현재 채널 [%d], 현재 볼륨 [%d]\n",
				k37_Channel, k37_Vol);
	}
}
