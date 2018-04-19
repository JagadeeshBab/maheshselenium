package com.webdriver;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Launch_AllBrowsers {
	WebDriver driver;
	
	public void ff() {
		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();	
	}
	

	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\seleniumAutomation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();	
	}
	
	public void ie() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D:\\Automation\\seleniumAutomation\\drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		Thread.sleep(5000);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();	
	}
	
public static void main(String[] args) throws InterruptedException {
	
	Launch_AllBrowsers la=new Launch_AllBrowsers();
	//la.chrome();
	//la.ff();
	la.ie();

}
}
