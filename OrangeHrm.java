package proj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OrangeHrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/saranraj/eclipse/Testing/Automation/Drivers/"
							+ "chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		String text1 = driver.findElement
				(By.xpath("(//p[text()='Username : Admin'])")).getText();
		System.out.println(text1);
		String substring = text1.substring(0, 8);
		
		String text2 = driver.findElement
				(By.xpath("(//p[text()='Password : admin123'])")).getText();
		System.out.println(text2);
		String substring2 = text2.substring(0, 8);
		
		String text3 = driver.findElement
				(By.xpath("(//label[text()='Username'])")).getText();
		System.out.println(text3);
		
		String text4 = driver.findElement
				(By.xpath("(//label[text()='Password'])")).getText();
		System.out.println(text4);
		
		String text5 = text1.substring(11);
		System.out.println(text5);
		
		String text6 = text2.substring(11);
		System.out.println(text6);
		
		String text7 = driver.findElement
				(By.xpath("(//h5[text()='Login'])")).getText();
		System.out.println(text7);
		
		String text8 = driver.findElement
				(By.xpath("(//button[@type='submit'])")).getText();
		System.out.println(text8);
		
		if (text3.equals(substring)) {
			
			WebElement user = driver.findElement
					(By.xpath("(//input[@name='username'])"));
			user.sendKeys(text5);
			
		}
		else {
			driver.quit();
		}
		if (text4.equals(substring2)) {
			WebElement pass = driver.findElement
					(By.xpath("(//input[@name='password'])"));
			pass.sendKeys(text6);
		}
		else {
			driver.quit();
		}
		if (text7.contains(text8)) {
			WebElement logIn = driver.findElement
					(By.xpath("//button[text()= ' Login ']"));
			logIn.click();
			
		}
		else {
			driver.quit();
		}
		
		WebElement info = driver.findElement
				(By.xpath("//span[text()='My Info']"));
		info.click();
		
		TakesScreenshot pic = (TakesScreenshot) driver;	
		File src = pic.getScreenshotAs(OutputType.FILE);
		
		File des = new File("/Users/saranraj/eclipse-workspace/"
							+ "AutomationTesting/screenShot/Hrm.png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebElement selection = driver.findElement
				(By.xpath("(//img[@alt='profile picture'])[1]"));
		selection.click();
		
		WebElement logout = driver.findElement
				(By.xpath("(//a[text()='Logout'])[1]"));
		logout.click();
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		String text9 = 
				driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.5']")).getText();
		System.out.println(text9);
		
		if (text9.contains(tittle)) {
			driver.quit();
			
		}
		
		
	}

}
