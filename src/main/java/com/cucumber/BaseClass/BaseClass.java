package com.cucumber.BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public static WebDriver driver;



public static WebDriver getBrowser(String name) throws IOException,Exception
{
	try{
	if(name.equalsIgnoreCase("chrome"))
	{
		
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resource\\com\\selenium\\drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	return driver;
	}catch(Exception e)
	{
	e.printStackTrace();
	throw new RuntimeException();
	}}}
		