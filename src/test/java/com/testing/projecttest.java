package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class projecttest {
	@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdrive.driver.chrome","C:\\eclipse\\chromedriver-win64\\chrome.driver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///E:/maven%20project/new-clothing/index.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    System.out.println(driver.findElement(By.tagName("h1")).getText());
	}
}


