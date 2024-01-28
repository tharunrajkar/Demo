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
import org.openqa.selenium.support.ui.Select;

public class Addactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/saranraj/eclipse/Testing/Automation/Drivers/"
							+ "chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		System.out.println("----------------------------------------------");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement
				(By.xpath("//input[@name='username']"));
		username.sendKeys("saranraj567");
		
		WebElement password = driver.findElement
				(By.xpath("//input[@name='password']"));
		password.sendKeys("JJDDYH");
		
		WebElement login = driver.findElement
				(By.xpath("//input[@name='login']"));
		login.click();
		
		System.out.println("-----------------------------------------------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement location = driver.findElement
				(By.xpath("//select[@name='location']"));
		Select london = new Select(location);
		london.selectByIndex(5);
		
		WebElement Hotel= driver.findElement
				(By.xpath("//select[@name='hotels']"));
		Select HName = new Select (Hotel);
		HName.selectByValue("Hotel Sunshine");
		
		WebElement RType = driver.findElement
				(By.xpath("//select[@name='room_type']"));
		Select rooM = new Select(RType);
		rooM.selectByValue("Super Deluxe");
		
		WebElement noOfRooms = driver.findElement
				(By.xpath("//select[@name='room_nos']"));
		Select roomNos = new Select(noOfRooms);
		roomNos.selectByValue("10");
		
		WebElement adultsPerRoom = driver.findElement
				(By.xpath("//select[@name='adult_room']"));
		Select adults = new Select(adultsPerRoom);
		adults.selectByValue("4");
		
		WebElement childRoom = driver.findElement
				(By.xpath("//select[@name='child_room']"));
		Select ChildRooom = new Select(childRoom);
		ChildRooom.selectByValue("4");
		
		WebElement search = driver.findElement
				(By.xpath("//input[@name='Submit']"));
		search.click();
		
		System.out.println("---------------------------------------------------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement selctHotel = driver.findElement
				(By.xpath("//input[@id='radiobutton_0']"));
		selctHotel.click();
		
		WebElement cont = driver.findElement
				(By.xpath("//input[@name='continue']"));
		cont.click();
		
		WebElement fName = driver.findElement
				(By.xpath("//input[@name='first_name']"));
		fName.sendKeys("Jhony Sins");
		
		WebElement lName = driver.findElement
				(By.xpath("//input[@name='last_name']"));
		lName.sendKeys("Mia Khalifia");
		
		WebElement billingAddress = driver.findElement
				(By.xpath("//textarea[@name='address']"));
		billingAddress.sendKeys("Australia");
		
		WebElement cardDetails = driver.findElement
				(By.xpath("//input[@name='cc_num']"));
		cardDetails.sendKeys("5678348790675423");
		
		WebElement cardType = driver.findElement
				(By.xpath("//select[@name='cc_type']"));
		Select cType = new Select (cardType);
		cType.selectByValue("VISA");
		
		WebElement expiryMonth = driver.findElement
				(By.xpath("//select[@name='cc_exp_month']"));
		Select expMonth = new Select(expiryMonth);
		expMonth.selectByValue("11");
		
		WebElement expiryYear = driver.findElement
				(By.xpath("//select[@name='cc_exp_year']"));
		Select expYear = new Select(expiryYear);
		expYear.selectByValue("2030");
		
		WebElement cvvNumber = driver.findElement
				(By.xpath("//input[@name='cc_cvv']"));
		cvvNumber.sendKeys("076");
		
		WebElement bookNow = driver.findElement
				(By.id("book_now"));
		bookNow.click();
		
		System.out.println("----------------------------------------------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement myLitenery = driver.findElement
				(By.xpath("//input[@id='my_itinerary']"));
		myLitenery.click();
		
		WebElement selectAll = driver.findElement
				(By.xpath("//input[@name='check_all']"));
		selectAll.click();
		
		TakesScreenshot pic = (TakesScreenshot) driver;	
		File src = pic.getScreenshotAs(OutputType.FILE);
		
		File des = new File("/Users/saranraj/eclipse-workspace/"
							+ "AutomationTesting/screenShot/sc.png");
		FileHandler.copy(src, des);
		
		WebElement cancelAll = driver.findElement
				(By.xpath("//input[@name='cancelall']"));
		cancelAll.click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("----------------------------------------------");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement logout = driver.findElement
				(By.xpath("//input[@name='logout']"));
		logout.click();
		
		TakesScreenshot pic1 = (TakesScreenshot) driver;	
		File src1 = pic1.getScreenshotAs(OutputType.FILE);
		
		File des1 = new File("/Users/saranraj/eclipse-workspace/"
						+ "AutomationTesting/screenShot/sc1.png");
		FileHandler.copy(src1, des1);
		
		WebElement homePage = driver.findElement
				(By.xpath("//a[text()='Click here to login again']"));
		homePage.click();
		
		TakesScreenshot pic2 = (TakesScreenshot) driver;	
		File src2 = pic2.getScreenshotAs(OutputType.FILE);
		
		File des2 = new File("/Users/saranraj/eclipse-workspace/AutomationTesting/"
				+ "screenShot/sc2.png");
		FileHandler.copy(src2, des2);
		
		System.out.println("----------------------------------------------");
		System.out.println(driver.getTitle());
		String title2 = driver.getTitle();
		
		System.out.println(driver.getCurrentUrl());
		String url1 = driver.getCurrentUrl();
		
		System.out.println("----------------------------------------------\nTest case results are");
		if (title2.equals(title)) {
			System.out.println("Home page Title matched.Hence the testcase partially passed");
		}
		else {
			System.out.println("Home page Title not matched\nHence wait for CurrentUrl testcase result");
		}
		
		if (url.equals(url1)) {
			System.out.println("First test case  Passed.");
			
		}
		else {
			System.out.println("First test Case Does Not Passed.");
		}
		
		System.out.println("----------------------------------------------\nSecond Test case results are");
		
		if (url.equals(url1)) {
			System.out.println("Second test case Passed.");
			
		}
		else {
			System.out.println("Second test Case doesnot passed.");
		}
		System.out.println("----------------------------------------------\nStatement Succesfully");
		
		driver.quit();
		
	}

}
