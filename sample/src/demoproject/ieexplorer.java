package demoproject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.ie.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.myntra.com/");

	}

}
