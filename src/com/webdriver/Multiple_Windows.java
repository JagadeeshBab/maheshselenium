package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Windows {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\seleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("J_BABU");
		driver.findElement(By.name("password")).sendKeys("FreeCRM");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement comp=driver.findElement(By.xpath("//*[@title='Companies']"));
		Thread.sleep(5000);
		act.moveToElement(comp).build().perform();
		act.contextClick(comp).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
