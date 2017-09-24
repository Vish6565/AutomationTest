package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.get("http://mentorstudies.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
