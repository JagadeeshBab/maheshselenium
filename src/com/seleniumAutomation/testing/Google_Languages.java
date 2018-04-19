package com.seleniumAutomation.testing;

import com.thoughtworks.selenium.DefaultSelenium;

public class Google_Languages {

	
	public DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");

public void OpenUrl()
{
	selenium.start();
	selenium.open("/");
	selenium.windowMaximize();
}

public void Hindi() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}

public void Bengali() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[2]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}
public void Telugu() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[3]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}

public void Marati() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[4]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}
public void Tamil() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[5]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}
public void Gujarati() throws InterruptedException
{
	selenium.click("//div[@id='als']/div/a[6]");
	Thread.sleep(5000);
	selenium.click("//div[@id='als']/div/a[1]");
	Thread.sleep(5000);
}

public static void main(String[] args) throws InterruptedException {
	Google_Languages g =new Google_Languages();
	g.OpenUrl();
	g.Hindi();
	g.Bengali();
	g.Telugu();
	g.Marati();
	g.Tamil();
	g.Gujarati();
	
	
}











}
