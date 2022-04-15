package ifforwhile;

import java.text.DecimalFormat;

public class pt6 {

	public static void main(String[] args) {
		// 17pg 범위를 주어 비교
		int k37_iVal;	//5의 배수를 넣어줄 정수형 변수 선언
		for (int k37_i = 0; k37_i < 300; k37_i++) {	//0부터 299까지 도는 for문 작성
			k37_iVal = 5 * k37_i;	//k37_iVal 값에 for문을 도는 지역변수의 5배 값을 넣어준다.
			if(k37_iVal >= 0 && k37_iVal < 10) System.out.printf("일 %d\n", k37_iVal);			// 조건문을 이용해 k37_iVal이 0 ~ 9가 들어오면 일의 자리라고 메세지 출력
			else if(k37_iVal >= 10 && k37_iVal < 100) System.out.printf("십 %d\n", k37_iVal);	// 조건문을 이용해 k37_iVal이 10 ~ 99가 들어오면 십의 자리라고 메세지 출력
			else if(k37_iVal >= 100 && k37_iVal < 1000) System.out.printf("백 %d\n", k37_iVal);	// 조건문을 이용해 k37_iVal이 100 ~ 999가 들어오면 백의 자리라고 메세지 출력
			else System.out.printf("천 %d\n",k37_iVal);	//1000값 이상 혹은 음수값은 천이라고 메세지 출력(k37_i가 0부터 299까지 돌기 때문에 오류의 여지는 없다)
		}
		
		// 18pg 비정형비교1
		
		for (int k37_i = 1; k37_i < 13; k37_i++) {		// k37_i가 1부터 13전까지 1씩 증가하면서 도는 for문 작성
			System.out.printf(" %d월 =>", k37_i);		// k37_i를 형태에 맞게 출력, 1월부터 12월까지 출력
			for (int k37_j = 1; k37_j < 32; k37_j++) {	// 1부터 1씩 증가하며 31까지 도는 for문 작성
				
				System.out.printf("%d,",k37_j);		// 해당 변수를 출력하고 아래 if 문을 통과하면서 만족하면 안쪽의 for문 탈출 (다음 달로 넘어감)
				
				if(k37_i == 1 && k37_j == 31) break;
				if(k37_i == 2 && k37_j == 28) break;
				if(k37_i == 3 && k37_j == 31) break;
				if(k37_i == 4 && k37_j == 30) break;
				if(k37_i == 5 && k37_j == 31) break;
				if(k37_i == 6 && k37_j == 30) break;
				if(k37_i == 7 && k37_j == 31) break;
				if(k37_i == 8 && k37_j == 31) break;
				if(k37_i == 9 && k37_j == 30) break;
				if(k37_i == 10 && k37_j == 31) break;
				if(k37_i == 11 && k37_j == 30) break;
				if(k37_i == 12 && k37_j == 31) break;
				
			}
			System.out.println();	// 줄바꿈
		}
		
		
		// 19pg 정형비교2
		for (int k37_i =1; k37_i < 13; k37_i++) {	//1부터 1씩 증가하면서 12까지 도는 지역변수를 받는 for문 작성
			System.out.printf("%d월 =>",k37_i);	// 1월부터 12월까지를 for문 돌때마다 출력
			for (int k37_j = 1; k37_j < 32; k37_j++) {	//1부터 1씩 증가하면서 31까지 도는 지역변수를 받는 for문 작성
				
				System.out.printf("%d,",k37_j);	//일을 출력
				
				if(k37_i == 4 || k37_i == 6 || k37_i == 9 || k37_i == 11) {	//조건문을 통해 4 6 9 11월은 30일에서 탈출
					if (k37_j == 30) break;
				}
				
				if (k37_i == 2) {	//조건문을 통해서 2월달은 28일때 탈출
					if (k37_j == 28) break;
				}
			}
			System.out.println();	// 한달이 끝나면 줄바꿈
		}
		
		// 19pg 정형비교3
		for (int k37_i = 1; k37_i < 13; k37_i++) {	//1부터 1씩 증가하면서 12까지 도는 for문 작성
			System.out.printf(" %d월 =>", k37_i);	// 현재달이 몇월인지 보여주는 출력 포맷
			for (int k37_j = 1; k37_j < 32; k37_j++) {	//1부터 1씩증가하면서 31까지 도는 for문 작성
				
				System.out.printf("%d,", k37_j);	//일수를 출력
				
				if ((k37_i == 4 || k37_i == 6 || k37_i == 9 || k37_i ==11) && (k37_j == 30)) break;	//조건문을 통해 4 6 9 11월은 30일에서 탈출
				if (k37_i == 2 && k37_j == 28) break;	//2월달이면 28일에서 탈출하도록 if문 작성
			}
			
			System.out.println();	// 한달이 끝나면 줄바꿈
		}
		
		// 20pg case문 비교
		for (int k37_i = 1; k37_i < 13; k37_i ++) {	//1부터 1씩 증가하면서 12까지 도는 for문 작성
			System.out.printf(" %d월 =>", k37_i);	//해당 월 출력, 1월부터 12월까지
			LOOP: for(int k37_j = 1; k37_j < 32; k37_j++) {	//LOOP선언, 1부터 1씩증가하면서 31까지 도는 for문을 선언
				
				System.out.printf("%d,",k37_j);	//일수를 출력
				
				switch(k37_i) {	//받아온 월수를 스위치의 조건에 따라 분류
					case 4: case 6: case 9: case 11:	//4 6 9 11월은 30일에 탈출 
						if(k37_j == 30) break LOOP;	//if 를 실행하면 위에 선언한 LOOP로 돌아간다.
				
						break;	//switch에서 case를 탈출하면 break;
					case 2:
						if(k37_j == 28) break LOOP;	//2월이고 28일일때 LOOP로 돌아간다.
						break;	//스위치문을 탈출하는 break
				}
			}
			System.out.println();	//월이 끝날때마다 줄바꿈을 해준다.
		}
		
		
		// 21pg Array이용 비교
		int [] k37_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};	//일수를 담아두는 정수형 배열 k37_iLMD선언 후 달의 마지막날 입력
		
		for(int k37_i = 1; k37_i < 13; k37_i++) {	//1부터 1씩 증가하며 12까지 도는 지역변수를가지는 for문 선언 (월수)
			System.out.printf(" %d월 =>", k37_i);	//현재 몇월인지 출력하는 포멧
			for (int k37_j = 1; k37_j <32; k37_j++) {	//1부터 1씩 증가하며 31까지 도는 for문 작성(일수)
				
				System.out.printf("%d", k37_j);	// 일을 출력하는 포멧
				
				if(k37_iLMD[k37_i-1] == k37_j) break;	//배열의 위치에 맞게 비교하기위헤 -1을 하고 배열에 넣어둔 달의 마지막 일수와 k37_j가 같으면 break;
				
				System.out.printf(",");	//아니라면 ,를 찍고 다음 일로 넘어간다.
			}
			System.out.println();	// 달이 끝나면 줄바꿈
		}
		
		
		
		//22pg 숫자읽기
		String[] k37_units = {"영","일","이","삼","사","오","육","칠","팔","구"};	//문자열 배열 선언 후, 숫자를 한글로 읽은 문자열 입력
		for(int k37_i = 0; k37_i < 101; k37_i++) {	//0부터 1씩 늘면서 100까지 도는 for문 작성
			
			if(k37_i >= 0 && k37_i<10) {	// 해당 변수가 1의 자리수 (0 ~ 9)이면 일의자리 + 자신을 한글로 출력하게 if문과 출력포맷 작성
				System.out.printf("일의자리 : %s\n",k37_units[k37_i]);
			} else if (k37_i >= 10 && k37_i < 100) {	//해당 변수가 10의 자리수면 (10~99) 십의자리 + 자신을 한글로 출력하게 else if문의 조건, 출력포맷 작성
				int k37_i10, k37_i0;	//10의 자리와 1의 자리를 담을 정수형 변수 선언 
				k37_i10 = k37_i/10;		//10의 자리수 입력
				k37_i0 = k37_i%10;		//1의 자리수 입력
				if (k37_i0 == 0) {	// 1의자리가 0이면
					System.out.printf("십의자리 : %s십\n",k37_units[k37_i10]); //10의 자리수의 한글 + 십을 출력 ex 이십 삼십 사십
				} else {	//1의 자리가 0이 아니라면
					System.out.printf("십의자리 : %s십%s\n",k37_units[k37_i10],k37_units[k37_i0]);	//10의 자리수 한글 + 십 + 1의 자리수 한글로 출력, ex 이십일
				}
			} else {	//10의자리 이상일땐 그 수를 그냥 출력 (100까지 돌기때문에 출력할 경우는 없다.)
				System.out.printf("==> %d\n",k37_i);
			}
			
		}
		
		
		//23pg 숫자읽기 고급
		int k37_iNumVal = 1100001111;	//정수형 변수 선언후 해당값 입력
		
		String k37_sNumVal = String.valueOf(k37_iNumVal);	//문자열형 변수 선언후 위에서 받은 정수를 문자열로 바꿔서 입력
		
		String k37_sNumVoice ="";	//빈 문자열 칸 선언, 메세지 숫자 한글로 읽을 때 사용
		
		System.out.printf("==> %s [%d자리]\n",k37_sNumVal, k37_sNumVal.length());	//입력한 숫자를 문자형으로 출력, 빈 문자열 길이 출력 (10)
		
		int k37_i, k37_j;	//정수형 변수 2개 선언 while문 안에서 문자열 구성 읽을 때 사용
		
		String [] k37_unitss={"영","일","이","삼", "사", "오", "육","칠","팔","구"};	//문자열 배열 선언, 숫자를 한글로 읽은 문자들 배열 
		String [] k37_unitx={"","십","백","천", "만", "십", "백","천","억","십"};		//십억 이하의 숫자 단위 입력한, 문자열 배열 선언
		
		k37_i = 0;	//위에서 선언한 정수형 변수중 하나에 0 입력
		k37_j = k37_sNumVal.length() - 1;		//입력 받은 숫자의 길이 - 1 입력, 배열의 값 불러올때 써야하기 때문에 -1
		
		while (true) {	//무한루프 선언
			if (k37_i >= k37_sNumVal.length()) break;		//k37_i가 받은 숫자를 문자열로 바꾼것의 길이보다 커지면 while문 탈출
			
			// 받은 숫자중 제일 앞에있는 수(2)를 출력,문자열인 2(제일 앞 수)를 정수로 바꿔서 k37_unitss 배열에서 2+1위치에 있는 문자열 출력 (이) , while문이 진행되면 숫자가 바뀐다.
			System.out.printf("%s[%s]", k37_sNumVal.substring(k37_i, k37_i + 1),k37_unitss[Integer.parseInt(k37_sNumVal.substring(k37_i,k37_i+1))]);
			
			if(k37_sNumVal.substring(k37_i, k37_i + 1).equals("0")) {	// 받아온 문자열의 값이 0과 일치하면 아래 실행, 아니면 else문 실행
				if(k37_unitx[k37_j].equals("만")  || k37_unitx[k37_j].equals("억")) {	//0과 일치하고 단위가 만 또는 억 이면
					k37_sNumVoice = k37_sNumVoice + "" + k37_unitx[k37_j];	//빈 문자열에 단위만 추가 입력
					// 천만에서 만 사이가 모두 0이면 만을 문자열에서 만 빼기, 이십억만 방지
					if(k37_sNumVal.substring(k37_sNumVal.length()-8,k37_sNumVal.length()-4).equals("0000")) {
						k37_sNumVoice = k37_sNumVoice.replace("만", "");
					}

				} else {
					//청정구역
				}
			} else {	//문자열에 숫자와 해당 단위를 추가 입력한다.
				k37_sNumVoice = k37_sNumVoice + k37_unitss[Integer.parseInt(k37_sNumVal.substring(k37_i,k37_i+1))] + k37_unitx[k37_j];
			}
			
			k37_i++; k37_j--;	//k37_i를 1 늘리고(다음 숫자로 이동) k37_j를 1 줄인다, 단위를 하나 낮은 단위로 이동한다
		}
		System.out.printf("\n %s[%s]\n",k37_sNumVal,k37_sNumVoice);	//입력받은 숫자와(문자열) 입력 위에서 완성한 숫자+단위를 출력한다.
		
		
		
		//24pg 띄어쓰기
		for (int k37_k = 0; k37_k < 10; k37_k++) {	//0부터 1씩 증가하면서 9까지 도는 지역변수를 가지는 for문 작성
			for(int k37_l = 0; k37_l < k37_k; k37_l++) System.out.printf(" ");	//0부터 k37_k의 전까지 돌면서 공백을 출력하는 for문 작성
			System.out.printf("%d\n",k37_k);	//현재 지역변수의 숫자를 출력
			// 해당 지역변수 k37_k의 수만큼의 빈칸을 생성하고 그 수가 찍히는 코드로 예상된다.
		}
		
		
		
		// 26pg sin함수 그래프
		double k37_fSin;	//실수형(double) 변수 선언
		
		for (int k37_k = 0; k37_k < 360; k37_k++) {	//0부터 1씩 증가하면서 360전까지 도는 지역변수 k37_k를 가지는 for문 작성
			
			k37_fSin = Math.sin(k37_k * 3.141592 / 180);	//Math.sin() 괄호 안에 해당 각도의 라디안 값을 넣어준다. 괄호 안에 식은 라디안으로 변환 식
			
			System.out.printf("%d sin ==> %f\n", k37_k, k37_fSin);	//각도(정수)와 Math.sin(정수의 라디안 값)을 넣은 결과 출력 
		}
		
		for (int k37_k = 0; k37_k < 360; k37_k++) {	//0부터 1씩 증가하며 360전까지 도는 for문 작성
			k37_fSin = Math.sin(k37_k * 3.141592 / 180);	//Math.sin() 괄호 안에 해당 각도의 라디안 값을 넣어준다. 괄호 안에 식은 라디안으로 변환 식
			
			int k37_iSpace = (int) ((1.0 - k37_fSin) * 50);	// (1.0 - k37_fSin)는 sin값에 따라 0부터 2까지를 왔다갔다한다. 50을 곱해서 0부터 100까지의 빈칸을 생성할 예정
			for (int k37_l = 0; k37_l < k37_iSpace; k37_l++) System.out.printf(" ");	//k37_iSpace 값에 따라 빈 칸 생성 0개에서 100개 생성
			System.out.printf("*[%f][%d]\n",k37_fSin, k37_iSpace);	// 빈칸 이후, k37_fSin의 sin 값과 k37_iSpace의 빈칸 수가 출력된다.
		}
		
		
		// 27pg 피라미드 찍기
		int k37_n, k37_m;	//정수형 변수 2개 선언
		k37_m = 20; k37_n = 1;	//선언한 정수형 변수에 20과 1을 각각 입력
		
		while(true) {	//while true를 통해 무한루프 선언
			for(int k37_k = 0; k37_k < k37_m; k37_k++) System.out.printf(" ");	//20개의 공백을 출력, while문을 돌때마다 1개씩 줄어들 예정	20 19 18 ...
			for(int k37_k = 0; k37_k < k37_n; k37_k++) System.out.printf("*");	//1개의 별 출력, while문 돌때마다 2개씩 늘어날 예정 1 3 5 ...
			System.out.println();	// 줄 바꿈
			
			k37_m = k37_m - 1;	//빈 칸을 1개씩 줄인다.
			k37_n = k37_n + 2;	//별을 2개씩 늘린다
			
			if (k37_m < 0) break;	//빈칸이 0보다 작아지면 while문 탈출
		}	//제일 윗줄엔 20칸 뛰고 1개별, 다음줄에 19칸 뛰고 3개의 별.. 빈칸이 0보다 작아지면 끝 (이등변 삼각형의 별 예상)
		
		
		// 28pg 칸 맞춰 인쇄
		String k37_item = "사과";	//문자열 변수 선언과 동시에 사과 입력
		int k37_unit_price = 5000;	//정수형 변수 선언과 동시에 5000입력, 가격으로 추정
		int k37_num = 500;		//정수형 변수 선언, 500입력, 개수로 추정
		int k37_total = 0;		//정수형 변수 선언, 총 가격으로 사용할 예정
		
		DecimalFormat k37_df = new DecimalFormat("###,###,###,###,###");	//DeciamlFormat 내장함수를 k37_df의 명으로 사용할 예정, package 아래 import함
		
		System.out.printf("=====================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");	//품목 단가 수량 합계 메세지 출력
		System.out.printf("=====================================================\n");
		
		//상품이름을 출력하고 DecimalFormat에 선언해둔 형태로 개당 가격, 구매 개수, 1개당 가격 * 개수로 총가격 출력 
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",k37_item,k37_df.format(k37_unit_price), k37_df.format(k37_num),k37_df.format(k37_unit_price * k37_num));
		System.out.printf("=====================================================\n");
		
		
	}

}
