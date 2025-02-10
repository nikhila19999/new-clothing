package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class womenpage {
    
	@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdrive.driver.chrome","C:\\eclipse\\chromedriver-win64\\chrome.driver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///E:/maven%20project/new-clothing/Womens.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    System.out.println(driver.findElement(By.tagName("h1")).getText());
	    driver.findElement(By.id("Womens")).click();

	    
		
		
	}

}
