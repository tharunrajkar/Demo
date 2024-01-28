package org.absoluteXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement uName = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		uName.sendKeys("addghngjhbkl");

		WebElement pass = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div[2]/div/input"));
		pass.sendKeys("dsxzxgnmbjmu");
		
		

	}
}
