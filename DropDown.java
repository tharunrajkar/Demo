package org.dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	// Single DropDown	
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement product = driver.findElement
				(By.xpath("//select[@id='first']"));
		Select prd = new Select(product);
		prd.selectByIndex(2);
		
		WebElement animals = driver.findElement
				(By.xpath("//select[@id='animals']"));
		Select ani = new Select (animals);
		ani.selectByValue("avatar");
		
	// Multiple DropDown
		
		WebElement Multiple = driver.findElement
				(By.xpath("//select[@id='second']"));
		Select multi = new Select(Multiple);
		multi.selectByIndex(0);
		multi.selectByVisibleText("Bonda");
		multi.selectByValue("burger");
		
		driver.quit();
		
	}

}
