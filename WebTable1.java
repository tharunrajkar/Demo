package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj/eclipse/Testing/Automation/Drivers/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		
	//	List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td"));

//		for (WebElement x : elements) {
//			String text = x.getText();
//			if (text.equals("Tirane")) {
//				System.out.println(text);

			//}

		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for (WebElement x1 : rows) {
			String text = x1.getText();
			if(text.equals("Tirane"))
			System.out.println(text);

		}
//		if(rows.equals("Tirane")) {
//			System.out.println(rows);
//		}
			}

	}

