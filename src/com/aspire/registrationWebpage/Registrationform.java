package com.aspire.registrationWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationform {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("file:///C:/Users/Lenovo/Desktop/Registration.html");
//1.id		 
		driver.findElement(By.id("123")).sendKeys("Rutuja");
		Thread.sleep(1000);
////2.name
		driver.findElement(By.name("Demo")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("Demo")).sendKeys("Ram");
////3.class name
		driver.findElement(By.className("Sample")).sendKeys("Kulkarni");
		Thread.sleep(2000);
////4.linktext--- we can give text of the link
		//	driver.findElement(By.linkText("Flipkart")).click();
	Thread.sleep(2000);
////5.tagname-- given to the link
		//driver.findElement(By.tagName("a")).click(); //can not click on two links thats why hide this line
//6.partiallinktext
		//driver.findElement(By.partialLinkText("oog")).click();
//7.css selector
		//driver.findElement(By.cssSelector(".number")).sendKeys("9876543210");//---copy> css selector
//8.xpath
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("abc@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//input[@type='radio'])[2]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//input[@type='checkbox'])[1]"))).click();

	}

}
