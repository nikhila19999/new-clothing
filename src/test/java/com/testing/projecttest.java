package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class projecttest {
	@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C:\\eclipse\\chromedriver-win64\\chrome.driver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://newdressshop.s3.ap-south-1.amazonaws.com/maven+project/new-clothing/index.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    System.out.println(driver.findElement(By.tagName("h1")).getText());
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[href='Womens.html']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[normalize-space()='HOME'])[1]")).click();
	    
	}
}


