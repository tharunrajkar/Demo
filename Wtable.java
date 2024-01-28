/* WEBTABLE:
   ----------						{ html=====> Head & body;
 	Tagname = //table
 	Head = thead
 	Row = trow
 	Column or data = td
 	Body = tbody
 			
 SYNTAX:
 --------
 //table/tbody/tr/td               ==============> All data;
 //table/tbody/tr[index]/td        ==============> Particular row;
 //table/tbody/tr/td[index]        ==============> Parlicular Cell or Column;
 //table/tbody/tr[index]/td[index] ==============> Particular data;
 
 */

package org.webtable;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj/eclipse/Testing/Automation/Drivers/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// URL launch:
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");

		// All data:
		
	//	List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));

//		for (WebElement webElement : allData) {
//			System.out.println("|" + webElement.getText() + "|");
//
//		}
//
//		System.out.println("-------------------");
//
//		// Particular row:
//
//		List<WebElement> particularRow = driver.findElements(By.xpath("//table/tbody/tr[67]/td"));
//		for (WebElement webElement : particularRow) {
//
//			System.out.println("|" + webElement.getText() + "|");
//
//		}

//		System.out.println("--------------------");
//
//		// Particular column(OR)data:
//
//		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
//		for (WebElement webElement : elements) {
//			System.out.println("|" + webElement.getText() + "|");
//
//		}

		// Particular data (OR) cell:

		List<WebElement> elements2 = driver.findElements(By.xpath("//table/tbody"));

		for (WebElement x : elements2) {
			String text = x.getText();
			if(text.equals("Tirane")) {
			}
			System.out.println(text);

			//System.out.println("|" + webElement.getText() + "|");
		}

		// Particular data (OR) Cell By using FindElement:

		
//		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
//		System.out.println("****************************");
//		System.out.println(element.getText());

	}

}

