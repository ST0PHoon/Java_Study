package javajump6;

public class pt9_elev2 {
	// 12, 13pg ������ 
	//elev3 �� extends ���ø� ������� private���� public���� ����
	public int k37_limit_up_floor;		//private(Ŭ������������ ��밡��) ������ ���� ����, �ֻ���
	public int k37_limit_down_floor;	//private(Ŭ������������ ��밡��) ������ ���� ����, ������
	public int k37_floor;				//private(Ŭ������������ ��밡��) ������ ���� ����, ������
	public String k37_help;	//private(Ŭ������������ ��밡��) ���ڿ��� ���� ����, ���� ���ڿ�
	
	pt9_elev2() {	//������ ����, �⺻���� ���ð��� ������ �Է�
		k37_limit_up_floor = 10;	// �ֻ��� 10 �Է�
		k37_limit_down_floor = 0;	// ������ 0 �Է�
		k37_floor = 1;		//������ 1 �Է�
		k37_help = "���������� �⺻ �ذ��Ϸ�";	//���򸻷� �⺻ �ر��Ϸ��� �޼��� �Է�
	}
	
	pt9_elev2(int k37_up_floor, int k37_d_floor, int k37_in_floor) {	//������ �����ε�, ���� ������ ���� 3�� ����
		k37_limit_up_floor = k37_up_floor;	//�޾ƿ� �ֻ��� ������ �Է�
		k37_limit_down_floor = k37_d_floor;	//�޾ƿ� ������ ������ �Է�
		k37_floor = k37_in_floor;			//�޾ƿ� ������ ������ �Է�
		k37_help = "���������� ���� �ذ��Ϸ�";		//���� �ذ��Ϸ�� �޼��� �Է�
	}
	
	void k37_up() {	//������ �ø��� �޼ҵ� ����. ���� ����
		if(k37_floor == k37_limit_up_floor) {	//�ֻ����̶�� �������̶�� �޼��� �Է�
			k37_help = "������ ���Դϴ�";
		} else {	//�ֻ����� �ƴ϶�� �������� 1�ø��� �޼����� �������� ����ϴ� �޼��� �Է�
			k37_floor++;	//�������� 1�� ���
			k37_help = String.format("[%d] ���Դϴ�.", k37_floor);	//���� ����, �ٲ� ������ �Է�
		}
	}
	
	void k37_down() {	//���� ������ �޼ҵ� ����. ���� ����
		if(k37_floor == k37_limit_down_floor) {	//�������̶�� ó�����̶�� �޼��� �Է�
			k37_help = "ó�� ���Դϴ�";
		} else {	//�װ� �ƴ϶�� ���������� 1�� ������ ������ �޼��� ���
			k37_floor--;
			k37_help = String.format("[%d] ���Դϴ�.", k37_floor);
		}
	}
	
	void k37_up(int k37_u) {	// ������ ������ �޾� �׼���ŭ ���� �ø��� �Լ� ����. ���� ����
		//this�� ���� �����ε� �� �޼ҵ带 this�� �Ἥ ȣ��, ������ŭ k37_up()����, ��������� k37_u��ŭ �� ���
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_up();
	}
	
	void k37_down(int k37_u) {	// ������ ������ �޾� �׼���ŭ ���� ������ �Լ� ����. ���� ����
		//this�� ���� �����ε� �� �޼ҵ带 this�� �Ἥ ȣ��, ������ŭ k37_down()����, ��������� k37_u��ŭ �� �ϰ�
		for(int k37_i = 0; k37_i < k37_u; k37_i++) this.k37_down();
	}
	
	void k37_msg(String k37_id) {	// �Է¹��� ���ڿ��� ����ϸ鼭, �߰��� ������ ���� ������ ����ϴ� �޼ҵ�
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",
				k37_id,k37_help,k37_limit_up_floor,k37_limit_down_floor,k37_floor);
	}
	
}
