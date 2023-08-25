package com.aspire.registrationWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_WebDriver {

	public static void main(String[] args) throws InterruptedException 
	{
//Browser Launching
        System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
 //Website launch
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
   //isDisplayed
         boolean imgdisplay = driver.findElement(By.xpath("//img[@class='fb_logo-8ilh img']")).isDisplayed();
         System.out.println(imgdisplay);
   //isEnabled
         boolean emailTabText = driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
         System.out.println(emailTabText);
   //isSelected
         driver.findElement(By.xpath("(//a[@role='button'])[2]"));
         Thread.sleep(1000);
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rutuja");
         driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kulkarni");
         driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rutu@123");
         driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();   //to select gender
         
	}

}
