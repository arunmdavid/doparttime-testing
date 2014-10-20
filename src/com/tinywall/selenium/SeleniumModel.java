package com.tinywall.selenium;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeleniumModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium browser;
		 browser = new DefaultSelenium("localhost",4444, "*firefox", "http://doparttime.cloudapp.net");
	        browser.start();
	        browser.open(DoPartTimeConstant.BASE_PATH+"/auth/login");
	        browser.waitForPageToLoad("50000");
	        browser.type("username","admin@tinywall.com");
	        browser.type("password","password");
	        browser.click("login-submit");
	        browser.waitForPageToLoad("70000");
	}

}
