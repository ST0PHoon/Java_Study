package javaReview2;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("input current date (ex : 20200902");
	      int current = sc.nextInt();
	      System.out.println("input birthday (ex : 20200902");
	      int birthday = sc.nextInt();
	      
	      int interAge = (current - birthday) / 10000;
	      int KAge = (current/10000) - (birthday/10000)  + 1;
	      
	      
	      // 생일 안 지난 경우 - 1

	      System.out.println(KAge + " years old in Korean age");
	      System.out.println(interAge + " years old in International age");
	   }

}
