package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Login_Logout {

	public WebDriver webdriver;
	
	public void OpenURL() {
		webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http://www.facebook.com");
	}
	
	public void Login() {
	webdriver.findElement(By.id("email")).sendKeys("jbabu5467@gmail.com");
	
	webdriver.findElement(By.id("pass")).sendKeys("456$546");
	webdriver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
	}
	
	public void Logout() throws Exception {
		webdriver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(5000);
		webdriver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']/a"));
	}
	
	
	
	public static void main(String[] args) throws Exception {
		FB_Login_Logout fb=new FB_Login_Logout();
		fb.OpenURL();
		fb.Login();
		fb.Logout();
	}

}
