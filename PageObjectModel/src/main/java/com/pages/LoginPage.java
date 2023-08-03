package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage 
{
	
	WebDriver driver=null;
public 	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public  WebElement getUsername()
	{
		
		return driver.findElement(By.id("email"));
	}
	public  WebElement getPassword()
	{
		
		return driver.findElement(By.id("password"));
		
	}
	public WebElement getLoginbtn()
	{
		
		return driver.findElement(By.xpath(" //form[@id='form']/div[3]/div/button"));
	}
	public void loginToApplication(String uname,String pass)
	{
		getUsername().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginbtn().click();
	}
	
	
}
