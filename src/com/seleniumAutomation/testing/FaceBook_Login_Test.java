package com.seleniumAutomation.testing;

import com.thoughtworks.selenium.DefaultSelenium;

//@SuppressWarnings("deprecation")
public class FaceBook_Login_Test {

	public static void main(String[] args)
	{
		
		DefaultSelenium selenium =new DefaultSelenium("localhost", 4444, "*firefox", "http://facebook.com");
		selenium.start();
		selenium.open("http://facebook.com");
		selenium.windowMaximize();
		
		selenium.type("email", "jbabu5467@gmail.com");
		selenium.type("pass", "9885901191");
		selenium.click("//form[@id='login_form']/table/tbody/tr[2]//label/input");
	}

}
