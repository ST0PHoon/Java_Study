package javajump6;

public class pt11_elev3 extends pt9_elev2{
	// 16pg ������� Ŭ���� �����
	void k37_Repair() {
		k37_help = String.format("�������Դϴ�");
	}
	
	// 18pg
	void k37_up() {
		if(k37_floor >= k37_limit_up_floor) {
			k37_help = "���������Դϴ�.";
		} else {
			k37_floor = k37_floor + 2;
			k37_help = String.format("%d���Դϴ�.", k37_floor);
		}
		
		this.k37_down();
	}
	
	void k37_down() {
		super.k37_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.k37_help);
		//this.k37_down(); ���ȣ��� ������
	}
}
