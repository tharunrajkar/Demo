package org.browserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowesr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement
				(By.xpath("//input[@name='username']"));
		username.sendKeys("SaranrajKar");
		
		WebElement password = driver.findElement
				(By.xpath("//input[@name='password']"));
		password.sendKeys("WPE322");
		
		WebElement login = driver.findElement
				(By.xpath("//input[@name='login']"));
		login.click();
		
		
		
		
		
		
		
		
		
		

	}

}
