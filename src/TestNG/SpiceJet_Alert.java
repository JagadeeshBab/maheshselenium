package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SpiceJet_Alert {
	public WebDriver driver;
	@Test
	public void spiceJet() throws Exception {
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
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
	}
  @Test
  public void spiceJetAlerts() {
	  String str=driver.switchTo().alert().getText();
	  System.out.println(str);
	  driver.switchTo().alert().accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
  }

}
