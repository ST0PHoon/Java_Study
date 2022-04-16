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
		//add메소드에서는 리턴값이 없어서 이하 코드에선  전역변수의 숫자만 1 증가한다. 이하 메세지 출력
		System.out.printf("******************************************\n");
		System.out.printf("메소드호출후 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);	//(2)
		System.out.printf("메소드호출후 메인에서 -> k37_iMain=[%d]\n",k37_iMain);	//(1)
		System.out.printf("******************************************\n");
		//메소드 실행
		k37_iMain = k37_add2(k37_iMain);
		//리턴값을 통해 k37_iMain이 1늘어난 값을 받았다.
		System.out.printf("******************************************\n");
		System.out.printf("메소드 add2호출후 메인에서 -> k37_iStatic=[%d]\n",k37_iStatic);	//전역변수 출력(3)
		System.out.printf("메소드 add2호출후 메인에서 -> k37_iMain=[%d]\n",k37_iMain);	//k37_iMain 출력(2)
		System.out.printf("******************************************\n");
	}
	
	//k37_add메소드 실행, 전역변수와 정수형 변수의 값 1씩 증가하고 해당 메세지와 값 출력
	public static void k37_add (int k37_i) {
		k37_iStatic++;	//(1 > 2)
		k37_i++;	//(1 > 2) 리턴을 안함
		System.out.printf("add메소드에서->iStatic=[%d]\n",k37_iStatic);	//전역변수 값과 메세지 출력
		System.out.printf("add메소드에서->i=[%d]\n",k37_i);	//k37_i지역변수 값과 메세지 출력
	}
	// 정수형 변수를 받고 정수형 값을 리턴하는 메소드 선언
	public static int k37_add2 (int k37_i) {
		k37_iStatic++;	//전역변수 1증가 (3)
		k37_i++;		//k37_iMain을 받아와 1증가 (2)
		System.out.printf("add메소드에서->iStatic=[%d]\n",k37_iStatic);	//전역변수 값과 메세지 출력
		System.out.printf("add메소드에서->i=[%d]\n",k37_i);	//k37_i지역변수 값과 메세지 출력
		return k37_i;
	}

}
