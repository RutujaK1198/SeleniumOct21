package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAllMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        WebElement products = driver.findElement(By.xpath("//select[@id='first']"));
        Select s=new Select(products);
        s.selectByIndex(2);
        
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select s2=new Select(animals);
        s2.selectByValue("babycat");
        
        WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
        Select s3= new Select(food);
        s3.selectByVisibleText("Burger");
        Thread.sleep(2000);
        s3.deselectByVisibleText("Burger");
        s3.selectByVisibleText("Pizza");
        //is multiple
        System.out.println(s3.isMultiple());   //will check whether there is option of multiple selection
        s3.selectByIndex(0);
        s3.selectByIndex(2);
        System.out.println("All options from food list box");
        List<WebElement> allOptions = s3.getOptions();
        for (WebElement option:allOptions)
        {
        	System.out.println(option.getText());
        }
        List<WebElement> foodselected = s3.getAllSelectedOptions();
        for (WebElement items:foodselected)
        {
        	System.out.println(items.getText());
        }
       
        
         
	}

}
