package Main;

import java.util.Scanner;

public class A3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է�
		String getStr = insertStr();

		// ���
		String reversedStr= reverseStrCal(getStr);

		// ���
		System.out.println(reversedStr);
	}

	public static String insertStr() {
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();

		return Str;
	}

	public static String reverseStrCal(String Strr) {
		String[] strList = Strr.split("");
		String[] reverseStrList = new String[Strr.length()];

		for (int i = Strr.length() - 1, j = 0; i > -1; i--, j++) {
			reverseStrList[j] = strList[i];
		}

		String reverseNumber = String.join("", reverseStrList);

		return reverseNumber;
	}
}
