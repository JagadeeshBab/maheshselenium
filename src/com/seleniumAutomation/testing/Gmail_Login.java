package com.seleniumAutomation.testing;

import com.thoughtworks.selenium.DefaultSelenium;

public class Gmail_Login {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://gmail.com");
	
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
	
	Thread.sleep(3000);
	selenium.type("identifierId", "jbabu294");
	selenium.click("identifierNext");
	
	Thread.sleep(3000);
	selenium.type("name=password", "babu123");
	selenium.click("passwordNext");
}
}
