package com.aspire.registrationWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rutuja");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kulkarni");
	    driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Rutu@abc");
		driver.findElement(By.xpath(("//input[@class='_8esa'])[1]"))).click();
	}

}
