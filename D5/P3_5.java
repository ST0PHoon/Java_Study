package Main;

import java.util.Scanner;

public class P3_5 {

	public static final String FasName = "Dad";
	public static final String MosName = "Mon";
	public static final String SosName = "Na";
	public static final String DasName = "Nuna";
	public static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3_5 main = new P3_5();
		
		main.familyMember ();
		main.addition(n);
	}
	
	public void familyMember () {
		Scanner sc = new Scanner(System.in);
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("Select number");
		n = sc.nextInt();
	}

	public void addition(int familyMember) {
		int fatherNum = 1, motherNum = 2, sonNum = 3, daughterNum = 4;
		
		if (familyMember == fatherNum) {
			System.out.println(FasName);
		} else if (familyMember == motherNum) {
			System.out.println(MosName);
		} else if (familyMember == sonNum) {
			System.out.println(SosName);
		} else if (familyMember == daughterNum) {
			System.out.println(DasName);
		} else {
			System.out.println("error");
		}

	}

}
