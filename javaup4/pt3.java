package ifforwhile;

public class pt3 {

	public static void main(String[] args) {
		// 5pg switch / case 문
		String k37_jumin = "123456-1234567";	//주민등록번호 문자열로 받아오기
	      switch (k37_jumin.charAt(7)) {		//주민등록번호의 뒷자리 1번째 숫자를 가져옵니다. (charAt을 쓰면 char형으로 그위치의 문자를 가져옵니다.)
	      case '1':								// 1이면 2000년 전 출생한 남성. case받을때 char형이면 ''안에 넣는다
	         System.out.printf("20세기전 태어난 남자 사람\n");	//break;가 없으면 멈추지않고 아래case를 실행한다.
	      case '2':								// 2이면 2000년 전 출생한 여성
	         System.out.printf("20세기전 태어난 여자 사람\n");
	         break;		//break; 가 있으면 이 코드를 실행하고 switch문을 빠져 나갑니다.
	      case '3':		// 3이면 2000년 이후 출생 남성
	         System.out.printf("20세기후 태어난 남자 사람\n");
	         break;
	      case '4':		// 4이면 2000년 이후 출생 여성
	         System.out.printf("20세기후 태어난 여자 사람\n");
	         break;
	      default:		// 위 케이스 이외의 경우에는 사람으로 메세지를 출력합니다.
	         System.out.printf("사람");
	         break;
	      }
	}

}
