package usedCarSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.api.internal.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class usedCarNewTrax {

	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromdriver\\chromedriver.exe";
	public static ArrayList<ArrayList<String>> encarList = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) throws IOException {
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		ArrayList<String> menu = new ArrayList<>();
		String companyType, carType, yearType, distance, option, fuel, price;
		menu.add("companyType");
		menu.add("carType");
		menu.add("option");
		menu.add("yearType");
		menu.add("distance");
		menu.add("fuel");
		menu.add("price");
		encarList.add(menu);

		driver.get(
				"http://wndrhckwhgkq.kr/buy/sub_list.php?cd_gubun=1&cd_brand=2&cd_model=26&cd_submodel=81&cd_level=&pop_page=1&recom_page=1&s_st_price=&s_ed_price=&s_st_year=&s_ed_year=&s_cd_mileage=&e_cd_mileage=&s_mission=&s_fuel=&s_color=");

		String carName = driver
				.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/form/div[1]/ul/li[3]/div[2]/div[1]"))
				.getText();

		for (int j = 0; j < 1; j++) {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			for (int i = 1; i <= 30; i++) {
				threadZeroPointFiveSeconds();

				companyType = driver
						.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/dl[1]/dt"))
						.getText();
				companyType = companyType.replace("(´ë¿ì)", "");

				threadZeroPointFiveSeconds();

				carType = driver
						.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/dl[1]/dd"))
						.getText();
				carType = carType.replace("µðÁ© - ", "");
				option = carType.substring(carName.length() + 1);
				carType = carType.substring(0, carName.length());

				threadZeroPointFiveSeconds();

				yearType = driver
						.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/dl[2]/dd"))
						.getText();

				threadZeroPointFiveSeconds();

				distance = driver
						.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/dl[3]/dd"))
						.getText();
				distance = distance.replace(",", "");
				distance = distance.replace(" Km", "");

				threadZeroPointFiveSeconds();

				fuel = driver
						.findElement(By
								.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/dl[4]/dd"))
						.getText();

				threadZeroPointFiveSeconds();

				price = driver
						.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div/div[2]/div[1]/div[" + i + "]/a/div[2]/span/strong"))
						.getText();
				price = price.replace(",", "");

				ArrayList<String> data1 = new ArrayList<>();
				data1.add(companyType);
				data1.add(carType);
				data1.add(option);
				data1.add(yearType);
				data1.add(distance);
				data1.add(fuel);
				data1.add(price);
				encarList.add(data1);
			}

		}

		printData();

		FileWriter fw = new FileWriter("C:\\Users\\Á¤ÁöÈÆ\\Desktop\\out.csv", true);
		for (int i = 0; i < encarList.size(); i++) {
			String str = String.join(",", encarList.get(i)) + "\n";
			fw.write(str);
		}
		fw.close();

	}

	public static void threadZeroPointFiveSeconds() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void printData() {
		for (int j = 0; j < encarList.size(); j++) {
			for (int k = 0; k < encarList.get(j).size(); k++) {
				if (k == (encarList.get(j).size()) - 1) {
					System.out.print(encarList.get(j).get(k));
					System.out.println();
				} else {
					System.out.print(encarList.get(j).get(k));
					System.out.print(",");
				}
			}
		}
	}

}
