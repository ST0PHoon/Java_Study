package test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\NewChrome\\chromedriver.exe";
	
	public static void main(String[] args) throws IOException {
		
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		ArrayList<String> titles = new ArrayList<>();
		
		
		for (int i = 0; i < 10; i++) {
			cal.add(Calendar.DATE, -4);
	        
			String date1 = df.format(cal.getTime());
			
			driver.get("https://search.naver.com/search.naver?where=view&query=%EC%84%9C%EC%9A%B8%20%EB%B9%B5%EC%A7%91&sm=tab_opt&nso=so%3Ar%2Cp%3Afrom"+ date1 + "to" + date1 + "&mode=normal&main_q=&st_coll=&topic_r_cat=");
			
			threadZeroPointSevenSeconds();
			
    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	   
    	   threadZeroPointSevenSeconds();
			
    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	   
    	   threadZeroPointSevenSeconds();
			
    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	   
    	   threadZeroPointSevenSeconds();
			
    	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	   
    	   threadZeroPointSevenSeconds();
			
			for (int k = 1; k <= 80; k++) {
				String text;
				
				text = driver.findElement(By.xpath(
						"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li[" + k + "]/div/div/a")).getText();
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(text);
				titles.add(text);
				
			}
			
		}
        
		
  		FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\list.txt", true);
  		
  		for(int i =0 ; i < titles.size(); i++) {
  			String str = titles.get(i) + "\n";
  			fw.write(str);
  		}
  		
		fw.close();

	       
	}
	
	public static void threadZeroPointSevenSeconds() {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void printData(ArrayList<String> titles) {
		for (int j = 0; j < titles.size(); j++) {
					System.out.println(titles.get(j));
		}
	}

	
	

}