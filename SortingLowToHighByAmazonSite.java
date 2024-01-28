/*
 To test Ecommerce sorted items(High to Low price) 
	are displaying properly or not by using selenium webdriver.
	
*/

package proj;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingLowToHighByAmazonSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/saranraj/eclipse/Testing/Automation/Drivers/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(""
				+ ""
				+ "https://www.amazon.in/");
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("iphone" + Keys.ENTER);

		// Finding Iphone Price into store as "size"

		List<WebElement> prize = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = prize.size();

		// Finding Product name for respective price its stored as a "prdName"

		List<WebElement> prdName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		Map<Integer, String> r = new TreeMap<Integer, String>();

		String productName;
		String productPrice;
		int prices;

		// String into Integer

		for (int n = 0; n < size; n++) {
			productName = prdName.get(n).getText();
			productPrice = prize.get(n).getText().replace(",", "");
			prices = Integer.parseInt(productPrice);

			r.put(prices, productName);
		}
		System.out.println(r);

	}

}
