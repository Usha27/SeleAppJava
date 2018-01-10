package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class appiumIos {
	
	WebDriver driver;
	
	@Test
	public void startBrowser() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone 7 Plus");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
		driver = new RemoteWebDriver(new URL ("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		search.sendKeys("India");
		//search.click();
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"tsbb\"]"));
		searchButton.click();
	}
	
/*	@Test
	public void startChromeBrower() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone 7 Plus");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceVersion", "10.3");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("app", "/Users/shingade/Desktop/kp/iOS/TestUI/Build/Products/Debug-iphonesimulator/TestUI.app");
		driver = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement lable =driver.findElement(By.id("myLabel"));
		System.out.println(lable.getAttribute("name"));
	}
	*/
	/*
	 *  @BeforeClass
		  public void beforeTest() throws MalformedURLException {
			 
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability(CapabilityType.VERSION, "5.0");
			 capabilities.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
			 capabilities.setCapability("platformName", "Android");
			 capabilities.setCapability("deviceName", "549038f4");
			 capabilities.setCapability("app", "/Users/usha/Downloads/kp-flagship-beta-470001.apk");
			 
			 wd = new RemoteWebDriver (new URL("0.0.0.0:4723"), capabilities);
		 }
	

	  @Test
	  public void testCase() throws InterruptedException, ParseException {
		  wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
	  wd.findElement(By.id("org.kp.m.beta:id/settings_username_edittext")).sendKeys("col623509902");//logging in with user id
	  wd.findElement(By.id("org.kp.m.beta:id/settings_password_edittext")).sendKeys("password7");//enter password
	  wd.findElement(By.name("Sign In")).click();

}
	}
}
	 */
	
	@Test
	public void openChrome() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "1015fa3061d12b05");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("app", "/Users/shingade/Desktop/kp-flagship-beta-470001.apk");
		capabilities.setCapability("appPackage", "org.kp.m.beta");
		//capabilities.setCapability("appActivity", "org.kp.m.env.EnvironmentChooserActivity");
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		
		 driver.findElement(By.xpath("//*[contains(@text,’HPP’)]")).click();
	}
	 
	
	@Test
	
	public void openBrowser() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","1015fa3061d12b05");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
