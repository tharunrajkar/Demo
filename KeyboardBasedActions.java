/*
KEY BOARD BASED ACTION:
Key event is a class and it performs the keyboard functions

(i)		keypress
(ii)	keyrealease
(iii)	up
(iv)	down
(v)		enter

SYNTAX:

Robot refName = new Robot();
refName.(keyEvent.anyFunction);
 */

//PROGRAM

package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardBasedActions {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement amazonMini = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		a.click(amazonMini).build().perform();

		WebElement cc = driver.findElement(By.xpath("//span[text()='Web Series']"));
		a.contextClick(cc).build().perform();

		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_DOWN);
	    key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

	}

}
