package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class fbSteps {

	WebDriver dr;
@Given("^Open Browser$")
public void open_Browser()  {
		String key="webdriver.gecko.driver";
	String path="C:\\seleniumwebdiriver\\driver\\MozillaFirefoxDriver\\geckodriver.exe";
	System.setProperty(key, path);
	dr=new FirefoxDriver();

	dr.get("https://www.facebook.com/");
}

@When("^Enter Username and Password$")
public void enter_Username_and_Password()  {
	dr.findElement(By.xpath("//input[@id='email']")).sendKeys("umamageswari.am");
	dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("hghbhjhjhjhj");
	dr.findElement(By.xpath("//input[@id='u_0_a']")).click();
}


}
