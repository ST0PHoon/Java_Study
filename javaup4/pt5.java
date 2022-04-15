package ifforwhile;

public class pt5 {

	public static void main(String[] args) {
		// 16pg 숫자형, 문자형 비교
		int k37_ii;		//정수형 변수 k37_ii 선언
		double k37_iD;	//실수형 변수 k37_iD 선언
		
		k37_ii = 10/3;	//해당 변수에 10/3을 실행한 값을 입력합니다. (정수형이므로 3)
		k37_iD = 10/3.0;	//해당 변수에 10/3.0을 실행한 값을 입력합니다. (실수형이므로 3.333333.. double형 마지막 자리수까지)
		
		// if를 통해 정수형과 실수형이 같냐고 물어보며 같으면 equal을 다르면 두 값중 정수형을 실수형으로 바꿔서 보여주며 다르다고 메세지 출력
		if (k37_ii == k37_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n",(double)k37_ii,k37_iD);	//두 값은 다를것으로 예상
		
		// if를 통해 실수형 변수에 들어간 값이 3.333333과 같냐고 물어보며, 같으면 equal 다르면 3.333333과 k37_iD의 값이 다르다고 보여줍니다.
		if (k37_iD == 3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", k37_iD);	//비록 형태는 같아보이지만 다른 값으로 인식
		
		
		k37_iD = (int) k37_iD;	// k37_iD를 정수형으로 변환하여 다시 입력
		if (k37_ii == k37_iD) System.out.printf("equal\n");	//두 값이 같으면 equal 다르면 k37_ii를 더블형으로 바꿔서 두 값과 3.333333 출력
		else System.out.printf("Not equal[3.333333][%f][%f]", (double)k37_ii, k37_iD);	//정수형 비교이므로 equal로 출력 예상

		
		System.out.printf("int로 인쇄 [%d][%f]\n",k37_ii, k37_iD);	//int 형으로 두 값 출력, 
		System.out.printf("double로 인쇄 [%f][%f]\n",(double)k37_ii, k37_iD);	//double형으로 두 값 출력
		
		
		char a = 'c';	//문자형 변수 a 선언 후, c값 입력
		
		//문자는 1글자만 선언 가능하며, 비교할때도 숫자형 자료와 동일하게 할수 있습니다.
		//if 를 통해 a의 값이 b c d와 일치하면 메세지 출력
		if (a == 'b') System.out.printf("a는 b이다\n");
		if (a == 'c') System.out.printf("a는 c이다\n");
		if (a == 'd') System.out.printf("a는 d이다\n");
		
		String k37_aa = "abcd";	//문자열형 변수 k37_aa 에 abcd를 입력합니다.
		
		// 문자열이 abcd인지 물어보는 if문 작성
		if (k37_aa.equals("abcd")) System.out.printf("k37_aa는 abcd이다\n");	//문자열은 equals 를 통해 정확하게 똑같은지 알 수 있습니다.
		else System.out.printf("aa는 abcd이 아니다\n"); 	//참값이 출력될 것으로 예상
		
		boolean k37_bb = true;	//참거짓형태의 boolean형 변수 선언 후, true값 입력
		
		if(!!k37_bb) System.out.printf("bb가 아니고 아니면 참이다.\n"); //!한개면 부정으로 바꾸고 !!두개면 부정을 부정으로 바꿔서 다시 긍정
		else System.out.printf("bb가 아니고 아니면 거짓이다.\n");	//참값이 출력될 것으로 예상
		
		
	}

}
