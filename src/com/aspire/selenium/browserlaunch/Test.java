package com.aspire.selenium.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		// Writing this code to check whether chromedriver is installed successfully
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe"); //E:--- is a path 
          WebDriver driver =new ChromeDriver();
          //instead of webdriver we can write chromedrivertoo but it will run on chrome only.
          driver.manage().window().maximize(); //to maximize window
          driver.get("https://nationalskillsregistry.com/");
          Thread.sleep(2000);  //to take a pause of 2 sec
          driver.navigate().to("https://www.amazon.in/");
          Thread.sleep(2000);
          driver.navigate().back();
          Thread.sleep(2000);
          driver.navigate().forward();
          Thread.sleep(2000);
          driver.navigate().to("https://www.facebook.com/");
          Thread.sleep(2000);
          String websiteTitle = driver.getTitle();  //to get title of a website
          System.out.println(websiteTitle);	
          String websiteURL = driver.getCurrentUrl();  //we can get url of current website
          System.out.println(websiteURL);
          driver.close();
          //driver.get("https://nationalskillsregistry.com/");  //this will give NoSuchSessionException
          
	}

}
