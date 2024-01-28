package proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/saranraj/eclipse/Testing/Automation/Drivers/chromedriver-mac-arm64/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://www.flipkart.com/");
			

			WebElement phone = driver.findElement(By.xpath("//input[@type='text']"));
			phone.sendKeys("iphone"+Keys.ENTER);
			
			WebElement prdName = driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 14')])[2]"));
			prdName.click();
			
			String iphone = prdName.getText();
			System.out.println(iphone);
	}

}
