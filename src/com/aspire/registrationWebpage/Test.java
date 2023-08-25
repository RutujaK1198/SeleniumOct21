package com.aspire.registrationWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("file:///C:/Users/Lenovo/Desktop/Registration.html");
		 
//1.id locator
	 driver.findElement(By.id("123")).sendKeys("Aspire Training Institute"); //code written is wrong. if we change code this will run by 'id'
//2.Tag name
		 driver.findElement(By.tagName("input")).sendKeys("Pune"); //it will feed value where he will find input name first
//3.Class name
		 driver.findElement(By.className("Sample")).sendKeys("Aspire Training");
//4.name
		 driver.findElement(By.name("Demo")).sendKeys("xyz");
		 
		 
		
		 
	}

}
