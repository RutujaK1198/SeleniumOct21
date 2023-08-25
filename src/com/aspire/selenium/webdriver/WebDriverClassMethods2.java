package com.aspire.selenium.webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClassMethods2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe"); //E:--- is a path 
        WebDriver driver =new ChromeDriver();
        Thread.sleep(2000);
        System.out.println(driver.manage().window().getSize()); //size of window before maximize
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.manage().window().getSize());  //size of window after maximize
        Dimension d= new Dimension(600,500); //we can specify what dimensions are required
        driver.manage().window().setSize(d);
        Dimension d1= new Dimension(800,500); 
        driver.manage().window().setSize(d1);
        Dimension d2= new Dimension(900,700); 
        driver.manage().window().setSize(d2);
        Dimension d3= new Dimension(900,700); 
        driver.manage().window().setSize(d3);
        Dimension d4= new Dimension(200,200); 
        driver.manage().window().setSize(d4);
        System.out.println(driver.manage().window().getSize()); //this same will not print size is too small,,as per your laptop
        System.out.println(driver.manage().window().getPosition());//show left corner dimension of website
        Point p= new Point(700,100);  //will open window on screen on this position
        driver.manage().window().setPosition(p);
        System.out.println(driver.manage().window().getPosition());
        
        
        
   
        
        

	}

}
