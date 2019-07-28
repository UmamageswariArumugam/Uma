package BatchFileCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BatchFile {
	
    @Test
	public void FacebookLoginPage()
	{
	
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
