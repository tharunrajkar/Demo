package org.Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Saranraj");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("kfhwfkhetkuthgjrtg");
		
		WebElement logIn = driver.findElement
				(By.xpath("(//button[text()='Log in'])"));
		logIn.click();
		
		driver.navigate().back();
		
		WebElement forgot = driver.findElement
				(By.partialLinkText("Forgot"));
		forgot.click();
		
		driver.navigate().back();
		
		WebElement forgotten = driver.findElement
				(By.linkText("Forgotten password?"));
		forgotten.click();
		
		driver.quit();
	}

}
