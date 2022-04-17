package javajump7;

public class pg24 {

	public static void main(String[] args) {
		// pg24 배열의 최대,최소값 찾기
		// 정수형 변수가 담긴 배열 준비 후, 값 입력
		int [] k37_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		// 각 최대, 최소 변수에 배열의 처음 값을 넣어준다.
		int k37_iMax = k37_iArray[0], k37_iMin = k37_iArray[0];
		// 각 최대, 최소의 위치를 알기위해 정수형 변수 선언
		int k37_iMaxPt = 0, k37_iMinPt = 0;
		// 문자열의 길이만큼 돌며 0부터 1씩증가하며 배열길이 -1 까지 돈다. 배열의 모든 값을 방문
		for(int k37_i = 0; k37_i < k37_iArray.length; k37_i++) {
			//만약 현재 k37_iMax 보다 큰 값이 있으면, 값과 위치를 받아와라
			if(k37_iMax < k37_iArray[k37_i]) {
				k37_iMax = k37_iArray[k37_i];
				k37_iMaxPt = k37_iMax;
			}
			// 만약 현재 k37_iMin 보다 작은수가 있으면 값과 위치를 받아와라
			if(k37_iMin > k37_iArray[k37_i]) {
				k37_iMin = k37_iArray[k37_i];
				k37_iMinPt = k37_iMin;
			}
		}
		// 최대 최소 위치와 값을 각각 출력
		System.out.printf("MAX : k37_iArray[%d] = %d\n", k37_iMaxPt, k37_iMax);
		System.out.printf("MIN : k37_iArray[%d] = %d\n", k37_iMinPt, k37_iMin);
	}

}
