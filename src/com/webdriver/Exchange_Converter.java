package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exchange_Converter {

	WebDriver webdriver;
	public void openURL() throws InterruptedException {
		
	webdriver=new FirefoxDriver();
	webdriver.manage().window().maximize();
	webdriver.get("http://www.xe.com/");
	Thread.sleep(3000);
	}
	
	public void converter() throws InterruptedException {
		
		webdriver.findElement(By.id("amount")).sendKeys("1000");
		webdriver.findElement(By.id("from_sc")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.id("from")).sendKeys("INR");
		webdriver.findElement(By.xpath("//ul[@id='from_scroller']/li[1]")).click();
		Thread.sleep(3000);
		
		webdriver.findElement(By.id("to_sc")).click();
		webdriver.findElement(By.id("to")).sendKeys("USD");
		Thread.sleep(3000);
		webdriver.findElement(By.xpath("//ul[@id='to_scroller']/li[1]")).click();
		webdriver.findElement(By.id("ucc_go_btn_svg")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Exchange_Converter ec=new Exchange_Converter();
		ec.openURL();
		ec.converter();
		}

	

}
