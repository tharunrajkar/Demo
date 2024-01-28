/*
 CSS SELECTOR:
 -------------
 
 (i) 	Its easier to learn or UnderStand.
 (ii)	Typically ,faster than Xpath.
 (iii)	Its used a lot on the development side to style web pages.
 (iv)	We can find/select HTML elements on the basics of their 
 		Id/class/attributes.
 ------------------------------------------------------------------
 		
i)Locate by Id:
-----------------
SYNTAX:
-------
tag#id (or) #id

ii)Locate by Class:
-------------------
SYNTAX:
--------
tag.classname

iii)Locate by Name (or) any attribute:
---------------------------------------
SYNTAX:
tagname[att.name='att value]

iv)Match with prefix:
----------------------
SYNTAX:
-------
[Att.name^='prefix_of_att.value']

v) Match with Suffix:
----------------------
SYNTAX:
-------
[Att.name $= 'suffix_of_att.value']

vi)Match with substring or contains:
-------------------------------------
SYNTAX:
[Att.name*='substring_value']
 		
 */
package org.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj"
				+ "/eclipse/Testing/Automation/Drivers"
				+ "/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//id
		WebElement eMail = driver.findElement(By.cssSelector("input#email"));
		eMail.sendKeys("gfdthgfu@gmail.com");
	     
		WebElement pWord = driver.findElement(By.cssSelector("inputtext _55r1 _6luy _9npi"));
		pWord.sendKeys("gfdgh,fgkr");
	}

}
