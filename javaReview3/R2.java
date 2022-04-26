package javaReview3;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "88";
		String num2 = "93";
		int num1R = 100 -  Integer.parseInt(num1);
		int num2R = 100 -  Integer.parseInt(num2);
		
		System.out.println(num1 + "x" + num2 + "=" + ( Integer.parseInt(num1) *  Integer.parseInt(num2)));
		
		System.out.println("");
		
		System.out.println("100-" + num1 + "  " + "100-" + num2);
		System.out.println(" " + num1R  + "   +   " + num2R + "   = " + (num1R + num2R));
		System.out.println(" " + num1R  + "   x   " + num2R + "   = " + (num1R * num2R));
		
		System.out.println("");
		
		System.out.println("First two digits : 100 - " + (num1R + num2R) + " = " + (100 - (num1R + num2R)));
		System.out.println("Last two digits : " + (num1R * num2R));
		System.out.println("Result : " + ( Integer.parseInt(num1) *  Integer.parseInt(num2)));
	}

}
