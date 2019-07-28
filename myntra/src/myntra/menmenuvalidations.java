package myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class menmenuvalidations {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		//validate men menu
		//driver.findElement(By.xpath("//a[contains(text(),'Men')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
		
		Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Men')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Men')]//following::a[1]")).click();
	//	act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).build().perform();
	//	driver.findElement(By.xpath("//a[contains(text(),'Women')]//following::a[11]")).click();
		//act.moveToElement(driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Kids')]"))).build().perform();
	//	driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Kids')]//following::a[1]")).click();
	//	act.moveToElement(driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Home & Living')]"))).build().perform();
	//	driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Home & Living')]//following::a[5]")).click();
	  //  act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Discover')]"))).build().perform();
	 //   driver.findElement(By.xpath("//a[contains(text(),'Discover')]//following::a[7]")).click();
	
	
	//TYPE OF BROWSER METHODS
		// 1. driver.get("url")
		//2.driver.getTitle(), 
		System.out.println(driver.getTitle());
		// GET CURRENT URL
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//driver.close();
		//quit also browser close command, close is close the current istant of present browser
		// how to maximise browser
		driver.manage().window().maximize();
		//Browser Navigation Command
		driver.navigate().to("https://www.facebook.com");
		//driver.navigate().back();
	//	driver.navigate().forward();
		
		
		//How to fetch the web page text
		String str=driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).getText();
		System.out.println(str);
		
		//How to handle the drop down list box
		Select ats=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		ats.selectByIndex(5);
		
	
	
	}
	

}
