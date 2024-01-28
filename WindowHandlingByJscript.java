package org.windowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingByJscript {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");
       // Set the path to your ChromeDriver executable

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the first tab
        driver.get("https://www.amazon.in");
        
        WebElement minitv = driver.findElement(By.xpath("//a[.='Amazon miniTV']"));
        
		Actions a = new Actions(driver);
		a.contextClick(minitv).perform();
		
        Robot r = new Robot();
        
		r.keyPress(KeyEvent.VK_DOWN);      
		r.keyRelease(KeyEvent.VK_DOWN);
		

		r.keyPress(KeyEvent.VK_DOWN);      
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

        
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//
//        // Open a new tab using JavaScript (Ctrl+T in most browsers)
//        js.executeScript("window.open()");
//
//        // Get the handles of all open tabs/windows
//        Set<String> windowHandles = driver.getWindowHandles();
//
//        // Switch to the new tab (assuming it's the last one opened)
//        for (String windowHandle : windowHandles) {
//            driver.switchTo().window(windowHandle);
        }
}

        // Now, you can interact with elements in the new tab
//        WebElement elementInNewTab = driver.findElement(By.xpath("(//a[.='Sign in'])"));
//        elementInNewTab.click();
//        
//        
        
        

        // Close the browser
       // driver.quit();
//	}
//
//}
