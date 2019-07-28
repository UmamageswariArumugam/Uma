package seleniumdemoprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selniumclass {

	public static void main(String[] args) {
		// Open browser
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
driver.get("https://www.facebook.com");

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umamageswari.am");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hghbhjhjhjhj");
driver.findElement(By.xpath("//input[@id='u_0_a']")).click();

	}

}
