package hello;

import java.util.Scanner;

public class P15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String equation = sc.next();
		String str1, str2, outputOper = "", oper = "+-*/%";
		String[] operArr = oper.split("");
		float num1 = 0f, num2 = 0f, result = 0f;
		int cut1;

		for (int i = 0; i < operArr.length; i++) {
			if (equation.contains(operArr[i])) {
				cut1 = equation.lastIndexOf(operArr[i]);
				str1 = equation.substring(0, cut1);
				str2 = equation.substring(cut1 + 1);
				num1 = Float.valueOf(str1);
				num2 = Float.valueOf(str2);
				outputOper = operArr[i];
			}
		}
		
		if (outputOper.equals("+")) {
			result = num1 + num2;
		} else if (outputOper.equals("-")) {
			result = num1 - num2;
		} else if (outputOper.equals("*")) {
			result = num1 * num2;
		} else if (outputOper.equals("/")) {
			result = num1 / num2;
		} else if (outputOper.equals("%")) {
			result = num1 % num2;
		}

		System.out.println(result);
	}

}
