package javajump7;

import java.util.ArrayList;

public class pg28 {

	public static void main(String[] args) {
		// pg28 ArrayList 2
		int k37_iTestMAX = 1000000;
		ArrayList k37_iAL = new ArrayList();
		
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			k37_iAL.add((int)(Math.random()*1000000));
		}
		
		for(int k37_i = 0; k37_i < k37_iTestMAX; k37_i++) {
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
		
		System.out.println("*********************************");
		k37_iAL.sort(null);

		for(int k37_i = 0; k37_i < k37_iAL.size(); k37_i++) {
			System.out.printf(" ArrayList %d = %d\n", k37_i, k37_iAL.get(k37_i));
		}
	}

}
