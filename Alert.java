package org.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
	// Simple Alert
		WebElement simple = driver.findElement
				(By.xpath("(//button[@class='btn btn-danger'])"));
		simple.click();
		driver.switchTo().alert().accept();
		
	// Confirm Alert
		WebElement cnfrm = driver.findElement
				(By.xpath("(//a[@class='analystic'])[2]"));
		cnfrm.click();
		
		WebElement confirm = driver.findElement
				(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
		
		driver.switchTo().alert().dismiss();
		
	// Prompt Alert
		
		WebElement prompt = driver.findElement
				(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		
		WebElement promptAlert = driver.findElement
				(By.xpath("(//button[@class='btn btn-info'])"));
		promptAlert.click();
		
		driver.switchTo().alert().sendKeys("SaranrajVijay");
		driver.switchTo().alert().accept();
		
	}

}
