package myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlisthandling {
	void dropdownlist()
	{
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Facebook.com/");
		Select ats=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		ats.selectByIndex(5);
		
		Select ats1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		ats1.selectByIndex(5);
		
		
		Select ats2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		ats2.selectByIndex(5);
	}
	public static void main(String[] args) {
		
		dropdownlisthandling dr=new dropdownlisthandling();
		dr.dropdownlist();
		
	}
	
	}