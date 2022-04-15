package ifforwhile;

public class pt2 {

	public static void main(String[] args) {
		// 4pg if문
		int k37_score = 80;	//정수형 변수 k37_score 선언 후 80 입력
		int k37_num = 1;	//정수형 변수 k37_num 선언후 1 입력

		if (k37_score > 60) {	//점수가 60초과면 합격인 if문 작성
			System.out.println("합격입니다.");
		}

		
		if (k37_score > 60)		//점수가 60초과면 합격인 if문 작성, if문은 {}가 없으면 실행할 때, 아래 한 줄만 실행한다.
			System.out.println("합격입니다.");

		
		if (k37_score > 60) {	//점수가 60점 초과면 합격, 그게 아니라면 불합격인 if문 작성
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		
		if (k37_num > 0) {		//k37_num이 양수, 음수 혹은 0인지를 판단하는 if문 작성
			System.out.println("양수 입니다.");
		} else if (k37_num < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.");
		}

		
		if (k37_score >= 90) {		// k37_score 값에 따라 등급을 나누는 if문 작성, 90이상 A, 80이상 90미만 B, 70이상 80미만 C, 그 아래 F
			System.out.println("A등급");
		} else if (k37_score >= 80) {
			System.out.println("B등급");
		} else if (k37_score >= 70) {
			System.out.println("C등급");
		} else {
			System.out.println("F등급");
		}

	}

}
