package com.chiselon.classifieds.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commons 
{
	public WebDriver driver;
	
	public Commons(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
	
	}
	
	
	
	
    public WebDriver openbrow(String local)
    {
    	try
    	{
    	if (local.equalsIgnoreCase("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "E:\\ColourClassifiedsMain\\ColourClassifieds\\Drivers\\chromedriver.exe");
    		
    		driver=new ChromeDriver();
    	}else if(local.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}else
    	{
    		System.out.println("Enter valid browser");
    	}
    	return driver;
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    		return null;
    	}
    	
    }
	
}
