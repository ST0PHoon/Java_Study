package javajump7;

import java.util.ArrayList;

public class pg28 {

	public static void main(String[] args) {
		// pg28 ArrayList 2
		int k37_iTestMAX = 10;	// 입력할 값의 수를 정한다. 정수형 변수 선언
		ArrayList k37_iAL = new ArrayList();	// 어레이 리스트를 선언한다.
		//입력 받은 숫자만큼 도는 for문 작성 (0 부터 999999까지 돈다)
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			//0부터 999999까지의 랜덤한 값을 추가한다. 어레이 리스트에 추가
			k37_iAL.add((int)(Math.random()*1000000));
		}
		//입력 받은 숫자만큼 도는 for문 작성 (0 부터 999999까지 돈다)
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			//어레이 리스트 배열의 위치와 해당 값을 출력한다.
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
		//입력 받은 숫자만큼 도는 for문 작성 (0 부터 999999까지 돈다)
		System.out.println("*********************************");
		k37_iAL.sort(null);	//오름차순으로 변겅

		for(int k37_i = 0; k37_i < k37_iAL.size(); k37_i++) {
			//어레이 리스트 배열의 위치와 해당 값을 출력한다.
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
	}

}
