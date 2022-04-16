package javajump6;

public class pt2 {

	static int k37_iStatic;	//클래스 안에서 쓸 수 있는 전역 변수 생성
	
	public static void main(String[] args) {
		// 5pg 변수와 메서드(2)
		int k37_iMain;	//정수형 변수 선언
		
		k37_iMain = 1;	//선언한 정수형 변수에 1 입력
		k37_iStatic = 1;	//전역변수에 1 입력
		
		//메소드 호출 전, 전역변수와 정수형 변수 출력하여 값 비교( 각각 1 출력 예상)
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출전 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);
		System.out.printf("메소드호출전 메인에서 -> k37_iMain=[%d]\n",k37_iMain);
		System.out.printf("******************************************\n");

		k37_add(k37_iMain);	//k37_add메소드 실행, 전역변수와 정수형 변수의 값 1씩 증가하고 해당 메세지와 값 출력
		
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
	
	//k37_add메소드 실행, 전역변수와 정수형 변수의 값 1씩 증가하고 해당 메세지와 값 출력
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
