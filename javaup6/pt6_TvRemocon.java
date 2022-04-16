package javajump6;

public class pt6_TvRemocon {
	// 9pg 클래스 객체 인스턴스, tv 리모컨
	int k37_Vol = 1;	//현재볼륨
	int k37_Channel = 1;	//현재채널
	
	void k37_VolUp() {	// 볼륨 올리는 함수 선언, 리턴값 없음
		k37_Vol++;	// 볼륨 1개 증가
		System.out.printf("볼륨증가 현재볼륨 : %d\n",k37_Vol);	//현재 볼륨 출력 메세지 포맷
	}

	void k37_VolDown() {
		k37_Vol--;	//볼륨 하나 낮추기
		System.out.printf("볼륨감소 현재볼륨 : %d\n",k37_Vol);	//현재 볼륨 출력 메세지 포맷
	}

	void k37_ChannelUp() {
		k37_Channel++;	//채널 하나 올리기
		System.out.printf("채널증가 현재채널 : %d\n",k37_Channel);	//현재 채널 출력 메시지 포맷
	}

	void k37_ChannelDown() {
		k37_Channel--;	//채널 하나 낮추기
		System.out.printf("채널감소 현재채널 : %d\n",k37_Channel);	//현재 채널 출력 메시지 포맷
	}
}
