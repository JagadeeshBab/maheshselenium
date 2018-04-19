package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class HMS_Login_Logout {
	public WebDriver webdriver;
	
	public void verifyLogin(String un,String pwd) throws InterruptedException {
	webdriver.findElement(By.linkText("HMS")).click();
	webdriver.findElement(By.name("username")).sendKeys(un);
	webdriver.findElement(By.name("password")).sendKeys(pwd);
	webdriver.findElement(By.name("submit")).click();
	Thread.sleep(5000);
	webdriver.findElement(By.linkText("submit")).click();
	}
  @Test
  public void login() throws InterruptedException {
	  verifyLogin("user1","user1");
  }
  @BeforeTest
  public void beforeTest() {
	  webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http://www.seleniumbymahesh.com/");
		
  }

  @AfterTest
  public void afterTest() {
  }

}
