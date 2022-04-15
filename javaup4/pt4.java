package ifforwhile;

public class pt4 {

	public static void main(String[] args) {
		// 15pg 단순비교
		int k37_iA, k37_iB;		// 정수형 변수 k37_iA와 k37_iB를 생성합니다
		
		k37_iA = 0;	//k37_iA에 0을 입력합니다.
		
		while (true) {	//while문 작성 ()에 true를 넣으면 무한루프
			
			k37_iB = 0;	//k37_iB에 0을 입력합니다. 아래 while문을 실행하기 전에 초기화의 기능도 가지고 있습니다.
			while(true) {	//while문 작성 ()에 true를 넣으면 무한루프
				System.out.printf("*");		//*을 출력합니다.
				
				if(k37_iA == k37_iB) break;		//둘이 같으면 탈출, 그게 아니라면 k37_iB에 1을 추가합니다.
				k37_iB++;
			}
			System.out.println();	//줄바꿈 실행
			k37_iA++;	//k37_iA를 1증가
			if(k37_iA == 30) break;		//k37_iA가 30일때 종료
		}
		//최종적으로 k37_iA가 0일때는 * 한 개, 1일떄는 k_iB가 0 1을 지나므로 * 두 개를 찍고 줄바꿈 ... k37_iA 가 29일때까지 실행하고 30으로 바뀌면서
		//실행을 그만둡니다. 1부터 30까지 별을 1개씩 늘려가며 줄바꿈하며 별을 찍습니다.
	}

}
