package Cucu_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
@Given("^Open chrome browser$")
public void open_chrome_browser() {
	
	String key="webdriver.chrome.driver";
	String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, path);
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}

@When("^Enter the application URL$")
public void enter_the_application_URL() {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umamageswari.am");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hghbhjhjhjhj");
	driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
	
}

@Then("^Validation of Login page open function$")
public void validation_of_Login_page_open_function() {
	
System.out.println("Login successful");
}



}
