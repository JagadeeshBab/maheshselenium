package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class HMS_Login_XML {
	public WebDriver webdriver;
  @Test
  @Parameters({"username","password"})
  public void verifyLogin(String un,String pwd) throws InterruptedException {
		
		webdriver.findElement(By.name("username")).sendKeys(un);
		webdriver.findElement(By.name("password")).sendKeys(pwd);
		webdriver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		webdriver.findElement(By.linkText("Logout")).click();
		}
 @BeforeTest
  public void beforeTest() {
	  webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http://www.seleniumbymahesh.com/HMS");
	
  }

}
