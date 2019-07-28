package ScreenshotPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Screenclass {
	
    @Test
	public void Mytest()
	{
	String key="webdriver.chrome.driver";
	String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, path);
	WebDriver driver=new ChromeDriver();
	utils.Myscreenshot(driver, "open chrome");
	
	driver.get("https://www.myntra.com/");
	//validate men menu
	
	driver.findElement(By.xpath("//a[contains(text(),'Men')]")).click();
	utils.Myscreenshot(driver, "Men Menu");
	
	driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
	utils.Myscreenshot(driver, "Women menu");
	Actions act=new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Men')]"))).build().perform();
    driver.findElement(By.xpath("//a[contains(text(),'Men')]//following::a[1]")).click();
	act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Women')]//following::a[11]")).click();

}

}
