package org.browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/saranraj/eclipse/Testing/Automation/Drivers/Firefox/geckodriver");
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to a website
        driver.get("https://www.google.co.in");


	}

}
