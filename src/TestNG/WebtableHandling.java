package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class WebtableHandling {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  String str=driver.findElement(By.cssSelector(".mapbg")).getText();
	  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println(s.length);
	  for (int i = 0; i < s.length; i++) {
		  if(s[i].equalsIgnoreCase("Hyderabad (HYD)")) {
			  System.out.println(s[i]);
		  }
		  else if (s[i].equalsIgnoreCase("Bengaluru (BLR)")) {
			  System.out.println(s[i]);
		}
		  else if (s[i].equalsIgnoreCase("Coimbatore (CJB)")) {
			  System.out.println(s[i]);
		}
	}
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.spicejet.com");
		
  }

}
