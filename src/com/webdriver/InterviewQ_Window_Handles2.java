package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterviewQ_Window_Handles2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		
		List<WebElement> list=driver.findElements(By.tagName("input"));
	System.out.println(list.size());
	Thread.sleep(5000);
	System.out.println(list.get(4).getAttribute("type"));
	
	int m=0,n=0;
	
	for(int i=0;i<list.size();i++) {
		
		
		if(list.get(i).getAttribute("type").equalsIgnoreCase("checkbox"))
		{
			System.out.println("total number of checkboxes are:" +list.get(i).getAttribute("type"));
			m++;
			
		}
		else if (list.get(i).getAttribute("type").equalsIgnoreCase("radio")) {
			System.out.println("total number of radiobuttons are:" +list.get(i).getAttribute("value"));
			n++;
			
		}
	}
	System.out.println("the num of check boxes are:"+m);
	System.out.println("the num of radio buttons are:"+n);
	}

}
