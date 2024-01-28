/*
 		Dynamic Xpath:
 		
 		ELEMENTS:
 		---------
 		(i)		Ancestor 	=========> Parent,Grand parent,etc
 		(ii)	Child	 	=========> Children
 		(iii)	Desendent	=========> Children,Grand Children,etc
 		(v)		Following
 				- Children ==========> All the siblings after the Context.
 		(vi)	Parent		=========> The parent of the Context.
 		(vii)	Preseeding 
 				   - Sibling ========> All the Sibling needs that appear before the context.

 */

package org.dynamicXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/saranraj/eclipse/Testing/Automation/Drivers/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		//Launch Url
		
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.xpath("(//img[@class='fb_logo _8ilh img']//parent::div//parent::div//following-sibling::div//descendant::form//child::div//child::div)[1]"));
		userName.sendKeys("asdfghj");
		
		WebElement passWord = driver.findElement(By.xpath("(//img[@class='fb_logo _8ilh img']//parent::div//parent::div//following-sibling::div//descendant::form//child::div//child::div)[1]"));
		passWord.sendKeys("asdfghjk");
	}

}
