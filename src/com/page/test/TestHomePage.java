package com.page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.HomePage;

public class TestHomePage {
WebDriver driver;

@BeforeMethod
public void openBrowser() {
	driver = new SafariDriver();
	driver.get("http://www.trulia.com");
}


@Test
public void checkTitle() {
	//System.setProperty("Webdriver.chrome.driver", "/SeleniumJavaA/chromedriver");
	//driver = new ChromeDriver();
	
	HomePage tp = new HomePage(driver);
	
	String  actual= tp.getTitle();
	System.out.println("Usha "+ actual);
	String expected = "Trulia: Real Estate Listings, Homes For Sale, Housing Data";
	//SYsoAssert.assertEquals(actual, expected);
	//System.out.println(actual);driver.close();
	Assert.assertEquals(actual, expected);
	driver.quit();
}

@Test
public void testSearchBox() {
	HomePage tp = new HomePage(driver);
	tp.enterSearchBox();
	driver.quit();
}
}
