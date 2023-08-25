package com.aspire.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Lenovo\\Java-Nov-21\\SeleniumOct21\\Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rutuja");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kulkarni");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rutu@123");
        driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();   //to select gender
 //"Select" class method---where there are multiple selection ex. date, month
           WebElement daylist = driver.findElement(By.xpath("//select[@id='day]"));
        Select s=new Select( daylist);
        s.selectByIndex(14);  //index 0 for the first element
//       s.deselectByIndex(index);
     s.selectByValue("25");
//        s.deselectByValue(value);
      s.selectByVisibleText("7");
//        s.deselectByVisibleText(text);
      
        WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
        Select s2=new Select(monthlist);
        //oct--> july-->dec
        s2.selectByIndex(9);
        s2.selectByValue("7");
        s2.selectByVisibleText("Dec");
        
        List<WebElement> allmonths = s2.getOptions();
        for (WebElement monthname:allmonths)
        {
        	System.out.println(monthname.getText());
        }
	}

}
