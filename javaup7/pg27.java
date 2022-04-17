package javajump7;

import java.util.ArrayList;

public class pg27 {

	public static void main(String[] args) {
		// pg27
		ArrayList k37_iAl = new ArrayList();
		
		k37_iAl.add("abc");
		k37_iAl.add("abcd");
		k37_iAl.add("egag");
		k37_iAl.add("가나다0");
		k37_iAl.add("1234");
		k37_iAl.add("12rk34");
		
		System.out.println("********************************");
		System.out.printf(" 시작 ArraySize %d \n", k37_iAl.size());
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {
			System.out.printf(" ArrayList %d \n", k37_i, k37_iAl.get(k37_i));
		}
		
		k37_iAl.set(3, "가라라라");
		System.out.println("********************************");
		System.out.printf(" 내용변경 ArraySize %d \n", k37_iAl.size());
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {
			System.out.printf(" ArrayList %d \n", k37_i, k37_iAl.get(k37_i));
		}
		
		
		k37_iAl.remove(4);
		System.out.println("********************************");
		System.out.printf(" 내용변경2 ArraySize %d \n", k37_iAl.size());
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {
			System.out.printf(" ArrayList %d \n", k37_i, k37_iAl.get(k37_i));
		}
		
		k37_iAl.sort(null);
		System.out.println("********************************");
		System.out.printf(" 리스트Sort ArraySize %d \n", k37_iAl.size());
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {
			System.out.printf(" ArrayList %d \n", k37_i, k37_iAl.get(k37_i));
		}
		
		k37_iAl.clear();
		System.out.println("********************************");
		System.out.printf(" 전부삭제 ArraySize %d \n", k37_iAl.size());
		for (int k37_i = 0; k37_i < k37_iAl.size(); k37_i++) {
			System.out.printf(" ArrayList %d \n", k37_i, k37_iAl.get(k37_i));
		}
		
	}

}
