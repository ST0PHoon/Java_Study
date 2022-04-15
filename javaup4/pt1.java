package ifforwhile;

public class pt1 {

	public static void main(String[] args) {
		// 7pg for문
		int k37_sum = 0;	// 정수형 변수 k37_sum 생성 후 초기값 0 입력
		
		// 0부터 9까지 도는 for문 생성 (
		for(int k37_i = 0; k37_i < 10; k37_i++) {
			
			k37_sum = k37_sum + k37_i; // k37_i를 0 부터 1씩 늘려가며 9까지 k37_sum에 더한다
		}
		//k37_sum을 출력한다.
		System.out.printf("sum %d\n", k37_sum);
		
		// 1부터 9까지 도는 for문 생성
		for (int k37_i = 1; k37_i < 10; k37_i++) {
			System.out.printf("************************************\n");
			System.out.printf("             구구단 %d 단\n",k37_i);	// 현재 몇단인지 출력하기 위해 포맷 만들기
			System.out.printf("************************************\n");
			// 1부터 9까지 도는 for문 생성, 구구단 생성 
			for (int k37_j = 1; k37_j < 10; k37_j++) {
				//i단의 숫자, 1~9까지 도는 숫자, 둘의 곱으로 구구단을 완성한다.
				System.out.printf(" %d * %d = %d \n", k37_i, k37_j, k37_i * k37_j);	
			}
		}
	}

}
