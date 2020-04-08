package com.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public  WebDriver driver;
 public  void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\sridhar\\TestNgParallel\\Driver\\chromedriver.exe");
    driver=new ChromeDriver();
}
 public  void loadUrl(String s) {
	driver.get(s);

}
 public static void element(WebElement e,String s) {
	e.sendKeys(s);

}
 public static void click(WebElement e) {
	e.click();
}   
}
