package org.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static WebDriver driver;
//	public static void main(String[] args) {
	private static void driver_launch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/saranraj" + "/eclipse/Testing/Automation/Drivers" + "/chromedriver-mac-arm64/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	private static void launch_url() {
		// TODO Auto-generated method stub
		driver.get("https://letcode.in/frame");

	}
	private static void swith_frame() {
		// TODO Auto-generated method stub
		driver.switchTo().frame("firstFr");

	}
	private static void uname() {
		// TODO Auto-generated method stub
		WebElement uName = driver.findElement(By.xpath("//input[@name='fname']"));
		uName.sendKeys("dsdfgjhkl");
	}
	private static void lname() {
		// TODO Auto-generated method stub
		WebElement lName = driver.findElement(By.xpath("//input[@name='lname']"));
		lName.sendKeys("ndhxcbjhyfgejrstnerstgfusert");
	}
	private static void email() {
		// TODO Auto-generated method stub
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));
		WebElement eMail = driver.findElement(By.xpath("//input[@name='email']"));
		eMail.sendKeys("csxcnhjkl");

	}
	private static void close() {
		// TODO Auto-generated method stub
		driver.quit();
	}
		
public static void main(String[] args) {
	driver_launch();
	launch_url();
	swith_frame();
	uname();
	lname();
	email();
	close();
}

		

		

		
		

	}


