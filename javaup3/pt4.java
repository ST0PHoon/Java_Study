package bills;

public class pt4 {

	public static void main(String[] args) {
		int k37_ii = 12345; // k37_ii 정수형 변수에 12345입력
		int k37_j = (k37_ii/10) * 10; // k37_ii 값의 10이하 절삭
		System.out.printf("#4-1: %d\n", k37_j); //k37_j값 출력
		
		k37_ii = 12345; //k37_ii 정수형 변수에 12345입력
		k37_j = ((k37_ii+5)/10)*10; //k37_j에 k37_ii 반올림한 값 입력
		
		System.out.printf("#4-2: %d\n", k37_j); //k37_j값 출력
		
		k37_ii= 12344; //k37_ii 정수형 변수에 12344입력
		k37_j = ((k37_ii+5)/10)*10; //k37_j에 k37_ii 반올림한 값 입력
		
		System.out.printf("#4-2: %d\n", k37_j); //k37_j값 출력

	}

}
