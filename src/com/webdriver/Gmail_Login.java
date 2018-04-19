package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http://www.gmail.com");

		webdriver.findElement(By.id("identifierId")).sendKeys("jbabu294@gmail.com");
		Thread.sleep(5000);
		webdriver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);

		webdriver.findElement(By.name("password")).sendKeys("458963");
		Thread.sleep(5000);

		webdriver.findElement(By.id("passwordNext")).click();
	
		Thread.sleep(5000);
		
		webdriver.findElement(By.xpath("//div[@id='gbsfw']//following-sibling::div[4]//a/span")).click();
		Thread.sleep(5000);
		webdriver.findElement(By.xpath("//div[@id='gbsfw']//following-sibling::div[4]/div/following-sibling::div//div[4]/div[2]/a")).click();
				
		webdriver.close();

	}

}
