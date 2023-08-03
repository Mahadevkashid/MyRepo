package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.*;
public class LoginTest 
{
	@Test
	public void test01()
	{
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/SeleniumSoftware1/Offline%20Website/index.html");
		LoginPage t=new LoginPage (driver);
		t.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
		
		
		
		
	}

}
	