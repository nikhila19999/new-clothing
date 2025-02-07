package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kidspage {
@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdrive.driver.chrome","C:\\eclipse\\chromedriver-win64\\chrome.driver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///E:/maven%20project/new-clothing/kids.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
}
}
