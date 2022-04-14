package bills;

public class pt2 {

	public static void main(String[] args) {
		int k37_sum; // k37_sum 변수명의 정수형 변수 선언
		
		k37_sum = 0; // k37_sum에 0 입력
		
		//1부터 100까지 for문 돌리기
		for (int k37_i = 1; k37_i < 101; k37_i++) {
			k37_sum = k37_sum + k37_i; //k37_sum에 k37_i값 누적해서 더하기 
		}
		
		System.out.printf("#2 : %d\n", k37_sum); // k37_sum값 출력
		
		System.out.printf("#2-2 : %d\n", k37_sum/100); //k37_sum의 평균 구하기
		
		
		int[] k37_v = {1,2,3,4,5}; // k37_v 정수형 배열에 1 2 3 4 5 값 입력
		int k37_vSum; //k37_vSum 정수형 변수 선언
		
		k37_vSum = 0; // k37_vSum에 0 입력
		
		//0부터 4까지 도는 (배열의 길이만큼) for문 작성
		for (int k37_i = 0; k37_i < 5; k37_i++) {
			k37_vSum = k37_vSum + k37_v[k37_i]; //배열에 있는 값 더하기
		}
		
		System.out.printf("#2-3 : %d\n", k37_vSum); // k37_vSum 출력
	}
}
