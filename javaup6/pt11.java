package javajump6;

public class pt11 {

	public static void main(String[] args) {
		// 16pg 상속으로 클래스 만들기
		pt11_elev3 k37_elev3;
		
		k37_elev3 = new pt11_elev3();
		
		for(int k37_i = 0; k37_i < 10; k37_i++) {
			k37_elev3.k37_up();
			System.out.printf("MSG k37_elev3[%s]\n",k37_elev3.k37_help);
		}
		
		for(int k37_i = 0; k37_i < 10; k37_i++) {
			k37_elev3.k37_down();
			System.out.printf("MSG k37_elev3[%s]\n",k37_elev3.k37_help);
		}
		
		k37_elev3.k37_Repair();
		System.out.printf("MSG k37_elev3[%s]\n",k37_elev3.k37_help);
	}

}
