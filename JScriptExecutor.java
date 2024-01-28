/*
 JAVA SCRIPT EXECUTOR:
 ----------------------
 
 (i)	Javascript Executor is an interface.
 (ii)	It will allow us to execute Javascript method through 
 		Selinium WebDriver.
 (iii)	In some places selinium cannot be work at that time we use 
 		javaScript to intract that webelement.
 SYNTAX:
 --------
 JavaScriptExecutor js =(JavaScriptExecutor)driver;
 						//TypeCasting//Narrowing//exclipttypeCasting
 js.executeScript(script,Arguments)		
 */

package org.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//TypeCasting//Narrowing//exclipttypeCasting
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Mexico']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		js.executeScript("window.scrollBy(0,1000)");// horizantal Scroll down
		js.executeScript("window.scrollBy(0,-400)");// horizantal scrooll up

}
}
