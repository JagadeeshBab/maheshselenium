package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SpiceJet_PM {
	public WebDriver driver;
	public void spiceJet(String a, String b,String c) throws Exception {
		driver.get("http://wwww.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(a);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText(b);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText(c);
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}
	
  @Test(description="This test case is to verify oneway search with 1A 0C 0I")
  public void oneWaySearch() throws Exception {
	  spiceJet("1", "0", "0");
  }
  @Test(description="This test case is to verify oneway search with 2A 1C 0I")
  public void oneWaySearch1() throws Exception {
	  spiceJet("2", "1", "0");
  }
  @Test(description="This test case is to verify oneway search with 3A 2C 1I")
  public void oneWaySearch2() throws Exception {
	  spiceJet("3", "2", "1");
  }

  @BeforeTest
  public void beforeTest() 
  {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
  }

}
