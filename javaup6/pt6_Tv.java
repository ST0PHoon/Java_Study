package javajump6;

public class pt6_Tv {

	public static void main(String[] args) {
		// 9pg Ŭ���� ��ü �ν��Ͻ�, tv ������ ������
		pt6_TvRemocon k37_rmc = new pt6_TvRemocon();	// Ƽ�񸮸��� Ŭ���� ����
		
		for(int i = 0; i < 5; i++) {	//���� �ø��� 5�� ����
			k37_rmc.k37_VolUp();
		}
		
		for(int i = 0; i < 5; i++) {	//���� ���߱� 5�� ����
			k37_rmc.k37_VolDown();
		}
		
		for(int i = 0; i < 10; i++) {	//ä�� �ø��� 10�� ����
			k37_rmc.k37_ChannelUp();
		}
		
		for(int i = 0; i < 10; i++) {	//ä�� ���߱� 10�� ����
			k37_rmc.k37_ChannelDown();
		}
		
		
	}

}
