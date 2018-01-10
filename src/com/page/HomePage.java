package com.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
WebDriver driver;
public  HomePage(WebDriver driver) {
this.driver =driver;
}

public String getTitle() {
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.MILLISECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	//driver.manage().window().fullscreen();
//	driver.findElement(By.name("yes")).sendKeys(Keys.ENTER);
//	WebDriverWait wait = new WebDriverWait(driver,10);
//	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//	Wait fwait =new FluentWait(driver).withTimeout(30, TimeUnit.MILLISECONDS).pollingEvery(5, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
	return driver.getTitle();
}

public void enterSearchBox() {
	WebElement searchBox = driver.findElement(By.xpath("*//input[@id=\"searchBox\"]"));
	searchBox.clear();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	searchBox.sendKeys("Cupertino CA");
	searchBox.sendKeys(Keys.ENTER);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
