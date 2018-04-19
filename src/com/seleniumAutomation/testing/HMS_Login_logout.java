package com.seleniumAutomation.testing;

import com.thoughtworks.selenium.DefaultSelenium;

public class HMS_Login_logout
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://www.seleniumbymahesh.com/HMS/");
		
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
		Thread.sleep(3000);
		selenium.click("link=HMS");
		
		Thread.sleep(3000);
		selenium.type("name=username", "user1");
		selenium.type("name=password", "user1");
		selenium.click("submit");
		
		Thread.sleep(3000);
		selenium.click("link=Logout");

}
}