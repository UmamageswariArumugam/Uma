package TestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
	

	}

}
