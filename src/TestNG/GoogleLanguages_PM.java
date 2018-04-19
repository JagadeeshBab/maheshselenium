package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GoogleLanguages_PM {
	
	WebDriver driver;
	public void clickLinks(String str) throws InterruptedException {
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='CToSde']/a[1]")).click();
		Thread.sleep(3000);
	}
  @Test
  public void googleLinks() throws InterruptedException
  {
	  clickLinks("//div[@id='CToSde']/a[1]");
	  clickLinks("//div[@id='CToSde']/a[2]");
	  clickLinks("//div[@id='CToSde']/a[3]");
	  clickLinks("//div[@id='CToSde']/a[4]");
	  clickLinks("//div[@id='CToSde']/a[5]");
	  clickLinks("//div[@id='CToSde']/a[5]");
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\seleniumAutomation\\drivers\\chromedriver.exe");
	  	driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
	
	  
  }

  @AfterTest
  public void afterTest() 
  {
	//  driver.quit();
  }

}
