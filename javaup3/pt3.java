package bills;

public class pt3 {

	public static void main(String[] args) {
		int k37_ii = 1000 / 3; // 정수형 변수 k37_ii에 1000 / 3 입력 (333)
		System.out.printf("#3 - 1 : %d\n", k37_ii); //k37_ii 출력

		k37_ii = 1000 % 3; // 정수형 변수 k37_ii에 1000 % 3 입력 (1)
		System.out.printf("#3 - 2 : %d\n", k37_ii); //k37_ii 출력

		// for 문 0 부터 19까지 돈다.
		for (int k37_i = 0; k37_i < 20; k37_i++) {
			System.out.printf("#3-3 : %d ", k37_i); //k37_i 출력

			if (((k37_i + 1) % 5) == 0) { // 5번째마다 줄바꿈
				System.out.printf("\n");
			}
		}
	}

}
