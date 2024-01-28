package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooGetText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/saranraj/eclipse/Testing/Automation/Drivers/"
							+ "chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		WebElement yahoo = driver.findElement(By.xpath("(//h3[text()='Trending now']/following::div/div/div/div/a)[1]"));
		System.out.println(yahoo.getText());

	}

}
