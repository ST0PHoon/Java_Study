package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P7_3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 날짜를 입력해주세요. ex)20221225");
		String date1 = sc.next();
		System.out.println("두 번째 날짜를 입력해주세요. ex)20221225");
		String date2 = sc.next();
		
		int one = Integer.parseInt(date1), two = Integer.parseInt(date2);
		String ones = date1, twos = date2;
		
		if (two > one) {
			date1 = twos;
			date2 = ones;
		}
		
        Date format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);
        Date format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);
        
        long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
        long diffDays = diffSec / (24*60*60); //일자수 차이
        
        System.out.println(diffDays + "일 차이");
	}
}
