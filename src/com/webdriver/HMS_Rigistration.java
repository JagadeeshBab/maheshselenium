package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class HMS_Rigistration {
	WebDriver webdriver;
	public void openURL() throws InterruptedException
	{	
	webdriver=new FirefoxDriver();
	webdriver.manage().window().maximize();
	webdriver.get("http://www.seleniumbymahesh.com/");
	webdriver.findElement(By.linkText("HMS")).click();
	webdriver.findElement(By.name("username")).sendKeys("user1");
	webdriver.findElement(By.name("password")).sendKeys("user1");
	webdriver.findElement(By.name("submit")).click();
	Thread.sleep(5000);
	}
	public void registration()
	{
	webdriver.findElement(By.xpath("//ul[@id='navigation']/li/a")).click();	
	new Select(webdriver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
	new Select(webdriver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	webdriver.findElement(By.name("PNT_NAME")).sendKeys("JAGADEESH");
	webdriver.findElement(By.name("LAST_NAME")).sendKeys("BABU");
	webdriver.findElement(By.name("DOB")).sendKeys("10-08-1992");
	webdriver.findElement(By.name("AGE")).sendKeys("26");
	new Select(webdriver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	new Select(webdriver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	new Select(webdriver.findElement(By.name("RELIGION"))).selectByValue("Hindu");
	new Select(webdriver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	
	new Select(webdriver.findElement(By.name("RELATION"))).selectByValue("Father");
	webdriver.findElement(By.name("MOTHER_NAME")).sendKeys("sree");
	new Select(webdriver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
	webdriver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("456345985256");
	
	new Select(webdriver.findElement(By.name("NATIONALITY"))).selectByValue("Indian");
	new Select(webdriver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
	new Select(webdriver.findElement(By.name("EDUCATION"))).selectByValue("B.Tech");
	new Select(webdriver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
	new Select(webdriver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("AB+");
	new Select(webdriver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
	new Select(webdriver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
	}
	public void popUP() {
		
	String str=webdriver.getWindowHandle();
		webdriver.findElement(By.linkText("Feedback")).click();
		//Thread.sleep(3000);
		webdriver.switchTo().window("mywindow");
		webdriver.findElement(By.id("name")).sendKeys("jagadeesh");
		webdriver.findElement(By.id("email")).sendKeys("jbabu294@gmail.com");
		webdriver.findElement(By.id("message")).sendKeys("welcome to HMS");
		//Thread.sleep(5000);
		webdriver.close();
		webdriver.switchTo().window(str);
		
	}
	public void address() {
	webdriver.findElement(By.name("ADDRESS1")).sendKeys("D.NO:13-15-319");
	webdriver.findElement(By.name("MOBILE_NO")).sendKeys("9885901191");
	webdriver.findElement(By.name("EMAIL_ID")).sendKeys("jbabu294@gmail.com");
	new Select(webdriver.findElement(By.name("COUNTRY_CODE"))).selectByValue("India");
	webdriver.findElement(By.name("ADDRESS2")).sendKeys("HINDUPUR");
	webdriver.findElement(By.name("ZIP")).sendKeys("515201");
	}
	public static void main(String[] args) throws Exception  {
		
	HMS_Rigistration hms=new HMS_Rigistration();
	hms.openURL();
	hms.registration();
	hms.address();
	
	
	}

}
