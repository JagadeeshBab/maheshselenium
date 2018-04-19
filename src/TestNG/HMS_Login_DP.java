package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_DP {
	public WebDriver webdriver;
	
  @Test(dataProvider = "dp")
  public void verifyLogin(String un,String pwd) throws InterruptedException {
		
		webdriver.findElement(By.name("username")).sendKeys(un);
		webdriver.findElement(By.name("password")).sendKeys(pwd);
		webdriver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		webdriver.findElement(By.linkText("Logout")).click();
		}

  @DataProvider(name="dp")
  public Object[][] credentials() {
    return new Object[][] {{"user1","user1"},{"mahesh","mahesh"},{"admin","admin"}};
  }
  @BeforeTest
  public void beforeTest() {
	  webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("http://www.seleniumbymahesh.com/HMS");
	
  }

}
