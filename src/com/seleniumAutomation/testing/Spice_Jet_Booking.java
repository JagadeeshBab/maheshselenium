package com.seleniumAutomation.testing;

import com.thoughtworks.selenium.DefaultSelenium;

public class Spice_Jet_Booking {

	DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://www.spicejet.com/");
	
	public void OpenUrl() throws InterruptedException
	{
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		Thread.sleep(3000);
	}                                              

	public void Booking() throws InterruptedException
	{
		selenium.click("ctl00_mainContent_rbtnl_Trip_0");
		Thread.sleep(5000);

		selenium.click("ctl00_mainContent_ddl_originStation1");
		Thread.sleep(5000);
		selenium.click("link=Hyderabad (HYD)");
		Thread.sleep(5000);
		selenium.click("link=Bengaluru (BLR)");
		
		selenium.click("link=31");
		selenium.select("ctl00_mainContent_ddl_Adult", "3");
		selenium.select("ctl00_mainContent_ddl_Child", "2");
		selenium.select("ctl00_mainContent_DropDownListCurrency", "INR");
		selenium.click("ctl00_mainContent_btn_FindFlights");
		}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Spice_Jet_Booking sjb=new Spice_Jet_Booking();
		sjb.OpenUrl();
		sjb.Booking();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
