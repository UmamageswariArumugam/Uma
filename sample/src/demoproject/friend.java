package demoproject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class friend {

	
		public static void main(String[] args) {
			String key="webdriver.gecko.driver";
			String path="C:\\seleniumwebdiriver\\driver\\MozillaFirefoxDriver\\geckodriver.exe";
			System.setProperty(key, path);
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.youtube.com/");

	}

}
