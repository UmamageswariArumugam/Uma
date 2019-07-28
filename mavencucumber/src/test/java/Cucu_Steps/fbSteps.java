package Cucu_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class fbSteps {

	WebDriver dr;
@Given("^Open Browser$")
public void open_Browser()  {
	String key="webdriver.chrome.driver";
	String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, path);
	dr=new ChromeDriver();
	dr.get("https://www.facebook.com/");
	
}

@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_and(String arg1, String arg2) {

	dr.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
	dr.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg2);
	dr.findElement(By.xpath("//input[@id='u_0_a']")).click();
}


}
