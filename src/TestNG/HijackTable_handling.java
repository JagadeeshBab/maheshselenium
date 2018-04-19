package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HijackTable_handling {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  Thread.sleep(3000);
	  String str=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul")).getText();
	  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println(s.length);
	  for (int i = 0; i <= s.length; i++) {
		if(s[i].equalsIgnoreCase("selenium tutorial")) {
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
		driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input")).click();
		
		}
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

  }

}
