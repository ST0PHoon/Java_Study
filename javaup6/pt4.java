package javajump6;

public class pt4 {
	// 7pg Ŭ����, ��ü, �ν��Ͻ�
	int k37_limit_up_floor = 10;	//������ ���� ����, �ֻ��� ����
	int k37_limit_down_floor = 0;	//������ ���� ����, ������ ����
	int k37_floor = 1;		//������ ���� ����, ������ ����
	String k37_help;		//���ڿ� ���� ���� �������� ����� �� ���
	
	void k37_up() {	//���������Ͱ� �ö�, void �޼ҵ� ����
		if (k37_floor == k37_limit_up_floor) {	//���� �ֻ����̸� ���������Դϴ�. ���
			k37_help = "���������Դϴ�.";
		} else {
			k37_floor++;	//�ֻ����� �ƴ� �� �� ���� �ö�.
			k37_help = String.format("%d���Դϴ�.", k37_floor);	//���� �������� ���ڿ��� �Է�
		}
	}
	
	void k37_down() {	//���������Ͱ� ������, void �޼ҵ� ����
		if (k37_floor == k37_limit_down_floor) {	//�������� ��, ó�����Դϴ�. ���
			k37_help = "ó�����Դϴ�.";
		} else {	//�������� �ƴ϶��
			k37_floor--;		//�� �� ��������
			k37_help = String.format("%d���Դϴ�.", k37_floor);	//���� ���� ���ڿ��� �Է�
		}
	}

}
