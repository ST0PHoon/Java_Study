package javajump6;

public class pt6_TvRemocon {
	// 9pg Ŭ���� ��ü �ν��Ͻ�, tv ������
	int k37_Vol = 1;	//���纼��
	int k37_Channel = 1;	//����ä��
	
	void k37_VolUp() {	// ���� �ø��� �Լ� ����, ���ϰ� ����
		k37_Vol++;	// ���� 1�� ����
		System.out.printf("�������� ���纼�� : %d\n",k37_Vol);	//���� ���� ��� �޼��� ����
	}

	void k37_VolDown() {
		k37_Vol--;	//���� �ϳ� ���߱�
		System.out.printf("�������� ���纼�� : %d\n",k37_Vol);	//���� ���� ��� �޼��� ����
	}

	void k37_ChannelUp() {
		k37_Channel++;	//ä�� �ϳ� �ø���
		System.out.printf("ä������ ����ä�� : %d\n",k37_Channel);	//���� ä�� ��� �޽��� ����
	}

	void k37_ChannelDown() {
		k37_Channel--;	//ä�� �ϳ� ���߱�
		System.out.printf("ä�ΰ��� ����ä�� : %d\n",k37_Channel);	//���� ä�� ��� �޽��� ����
	}
}
