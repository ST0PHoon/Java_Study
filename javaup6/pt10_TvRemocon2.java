package javajump6;

public class pt10_TvRemocon2 {
	// 14pg ������, ������
	private int k37_Vol;	//���纼��
	private int k37_Channel;	//����ä��
	
	pt10_TvRemocon2() {	// ������ ����
		k37_Vol = 5;	// ���纼��
		k37_Channel = 48;	// ����ä��
	}
	
	pt10_TvRemocon2(int k37_currentVol, int k37_currentCh) { //������ ����, ������ ���� 2�� ����, �����ε�
		k37_Vol = k37_currentVol;	//���纼��
		k37_Channel = k37_currentCh;	//����ä��
	}
	
	void k37_VolUp() {	// ���� �ø��� �Լ� ����, ���ϰ� ����
		k37_Vol++;	// ���� 1�� ����
		System.out.printf("��������");	//���� ���� ��� �޼��� ����
	}

	void k37_VolDown() {
		k37_Vol--;	//���� �ϳ� ���߱�
		System.out.printf("��������");	//���� ���� ��� �޼��� ����
	}

	void k37_ChannelUp() {
		k37_Channel++;	//ä�� �ϳ� �ø���
		System.out.printf("ä������");	//���� ä�� ��� �޽��� ����
	}

	void k37_ChannelDown() {
		k37_Channel--;	//ä�� �ϳ� ���߱�
		System.out.printf("ä�ΰ���");	//���� ä�� ��� �޽��� ����
	}
	
	void k37_msg() {	//���� ä�ΰ� ���� ���
		System.out.printf("���� ä�� [%d], ���� ���� [%d]\n",
				k37_Channel, k37_Vol);
	}
}
