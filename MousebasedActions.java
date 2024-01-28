/*
ACTIONS:
(i)  Its a class.
(ii) Its performs the mouse actions.

SYNTAX:
Actions refName = new Actions(driver);

MOUSE BASED ACTIONS:
(i)		click(Webelement)
(ii)	contextclick(webelement) =============>RightClick
(iii)	doubleClick
(iv)	Movetoelement(webelement) ============>from element to other element
(v)		dragAndDrop(webelement)

build()
 */
package org.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousebasedActions {
	private static void click() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement amazonMini = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		a.click(amazonMini).build().perform();

		driver.close();

	}

	private static void contextClick() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
		Actions b = new Actions(driver);
		WebElement cc = driver.findElement(By.xpath("//span[text()='Web Series']"));
		b.contextClick(cc).build().perform();

		driver.quit();

	}

	private static void doubleClick() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions rC = new Actions(driver);

		// ContextClick

		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		rC.contextClick(rightClickMe).build().perform();
		WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
		paste.click();

		// SimpleAlert
		driver.switchTo().alert().accept();

		// Doubleclick
		WebElement dC = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		rC.doubleClick(dC).build().perform();
		driver.switchTo().alert().accept();

	}

	private static void moveToElement() {
		// Set the path to the chromedriver executable

		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the Hovers page on the-internet
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 WebElement close = driver.findElement(By.xpath("//span[.='✕']"));
		 close.click();

		WebElement electronic = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		electronic.click();

	}

	private static void dragAndDrop() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Static.html");
		Actions dRdR = new Actions(driver);
		WebElement drag1 = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droparea']"));

		dRdR.dragAndDrop(drag1, drop).build().perform();

		WebElement drag2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[@id='droparea']"));

		dRdR.dragAndDrop(drag2, drop2).build().perform();

		WebElement drag3 = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement drop3 = driver.findElement(By.xpath("//div[@id='droparea']"));

		dRdR.dragAndDrop(drag3, drop3).build().perform();

	}

	public static void main(String[] args) {
		click();
		contextClick();
		doubleClick();
		moveToElement();
		dragAndDrop();
	}
}