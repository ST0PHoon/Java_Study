package javajump6;

public class pt2 {

	static int k37_iStatic;	//클래스 안에서 쓸 수 있는 전역 변수 생성
	
	public static void main(String[] args) {
		// 5pg 변수와 메서드(2)
		int k37_iMain;
		
		k37_iMain = 1;
		k37_iStatic =1;
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출전 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);
		System.out.printf("메소드호출전 메인에서 -> k37_iMain=[%d]\n",k37_iMain);
		System.out.printf("******************************************\n");

		k37_add(k37_iMain);
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출후 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);
		System.out.printf("메소드호출후 메인에서 -> k37_iMain=[%d]\n",k37_iMain);
		System.out.printf("******************************************\n");
		
		k37_iMain = k37_add2(k37_iMain);
		
		System.out.printf("******************************************\n");
		System.out.printf("메소드 add2호출후 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);
		System.out.printf("메소드 add2호출후 메인에서 -> k37_iMain=[%d]\n",k37_iMain);
		System.out.printf("******************************************\n");
	}
	
	public static void k37_add (int k37_i) {
		k37_iStatic++;
		k37_i++;
		System.out.printf("add메소드에서->iStatic=[[%d]\n",k37_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",k37_i);
	}
	
	public static int k37_add2 (int k37_i) {
		k37_iStatic++;
		k37_i++;
		System.out.printf("add메소드에서->iStatic=[[%d]\n",k37_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",k37_i);
		return k37_i;
	}

}
