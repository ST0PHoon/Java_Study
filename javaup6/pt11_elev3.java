package javajump6;

public class pt11_elev3 extends pt9_elev2{
	// 16pg ������� Ŭ���� �����
	//pt9_elev2 �� ��ӹ޾� ������ ������ �� �� �ִ�.(�̶� private���� ���� �Ǿ����� ��� ���� �Ұ�
	void k37_Repair() {
		k37_help = String.format("�������Դϴ�");
	}
	
	// 18pg
	void k37_up() {	// ����� Ŭ������ ��ӹ޾� ������
		if(k37_floor >= k37_limit_up_floor) {	//�ƹ��� Ŭ������ k37_up �籸��
			k37_help = "���������Դϴ�.";
		} else {
			k37_floor = k37_floor + 2;	//���⼱ 2�� �ö󰡰� ����
			k37_help = String.format("%d���Դϴ�.", k37_floor);
		}
		
		this.k37_down();	//�Ʒ� k37_down()�� �����ϹǷ� 1�� ������ printf�� �����ص� �޼����� ��µȴ�.
		//���������� 2�� �ø����� 1�� �������鼭 �޼��� ����ϴ� �޼ҵ�
	}
	
	void k37_down() {
		super.k37_down();	//�ƹ��� Ŭ������ down�� ������ ����, ���� k37_upó�� ���� ĥ �ʿ����
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.k37_help);	//Ŭ���� �ȿ��� �޼��� ����ϴ°� Ȯ���ϱ� ����
		//this.k37_down(); ���ȣ��� ������
	}
}
