package javajump7;

import java.util.ArrayList;

public class pg27 {

	public static void main(String[] args) {
		// pg27
		// ArrayList 선언
		ArrayList k37_iAl = new ArrayList();
		
		k37_iAl.add("abc");	// 생성한 리스트에 "abc" 추가
		k37_iAl.add("abcd");	// 생성한 리스트에 "abcd" 이어서 추가
		k37_iAl.add("egag");	// 생성한 리스트에 "egag" 이어서 추가
		k37_iAl.add("가나다0");	// 생성한 리스트에 "가나다0" 이어서 추가
		k37_iAl.add("1234");	// 생성한 리스트에 "1234" 이어서 추가
		k37_iAl.add("12rk34");	// 생성한 리스트에 "12rk34" 이어서 추가
		
		System.out.println("********************************");
		System.out.printf(" 시작 ArraySize %d \n", k37_iAl.size());	// 처음 리스트의 사이즈를 출력
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// 리스트의 배열만큼 도는 for문 생성
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//배열의 위치와 내용 출력
		}
		
		k37_iAl.set(3, "가라라라");	//4번째위치(3번째배열)에 가라라라를 추가한다. 사이즈 하나 증가
		System.out.println("********************************");
		System.out.printf(" 내용변경 ArraySize %d \n", k37_iAl.size());	// 변경한 리스트의 사이즈를 출력
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// 리스트의 배열만큼 도는 for문 생성
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//배열의 위치와 내용 출력
		}
		
		
		k37_iAl.remove(4);	// 5번째위치(4번째배열)의 값을 제거한다. 1234 제거하는 코드
		System.out.println("********************************");
		System.out.printf(" 내용변경2 ArraySize %d \n", k37_iAl.size());	// 변경한 리스트의 사이즈를 출력
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// 리스트의 배열만큼 도는 for문 생성
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//배열의 위치와 내용 출력
		}
		
		k37_iAl.sort(null);	// 내용물을 오름차순한다.
		System.out.println("********************************");
		System.out.printf(" 리스트Sort ArraySize %d \n", k37_iAl.size());	// 변경한 리스트의 사이즈를 출력
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// 리스트의 배열만큼 도는 for문 생성
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//배열의 위치와 내용 출력
		}
		
		k37_iAl.clear();	//리스트를 초기화한다. 길이 0
		System.out.println("********************************");
		System.out.printf(" 전부삭제 ArraySize %d \n", k37_iAl.size());	// 변경한 리스트의 사이즈를 출력
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {	// 리스트의 배열만큼 도는 for문 생성
			System.out.printf(" ArrayList %d = %s\n", k37_i, k37_iAl.get(k37_i));	//배열의 위치와 내용 출력
		}
		
	}

}
