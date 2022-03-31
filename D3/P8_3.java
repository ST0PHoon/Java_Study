package hello;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		
		String inputNum1 = sc.next();
		int inputNum2 = sc.nextInt();
		
		try {
			date = df.parse(inputNum1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		cal.setTime(date);
		cal.add(Calendar.DATE, inputNum2);
		
		System.out.println(df.format(cal.getTime()));
	}

}