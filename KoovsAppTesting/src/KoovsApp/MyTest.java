package KoovsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTest {

	public static void main(String[] args) {
		
      
		System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdiriver\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.koovs.com");
		dr.manage().window().maximize();
		
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"))).build().perform();
		dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]//following::a[1]")).click();
		act.moveToElement(dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]"))).build().perform();
		dr.findElement(By.xpath("//a[@href='https://www.koovs.com/men'][contains(text(),'MEN')]]//following::a[11]")).click();
		act.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'COLLECTIONS')]"))).build().perform();
		dr.findElement(By.xpath("//a[contains(text(),'COLLECTIONS')]//following::a[1]")).click();
		//act.moveToElement(dr.findElement(By.xpath("//body/div[@id='app']/div[@class='body-wrapper']/div[@class='content-wrapper']/div[@data-reactid='3']/div[@class='headroom-wrapper']/div[@class='headroom headroom--unfixed']/div[@class='header-wrapper']/div[@class='header-bottom-section']/div[@class='menu-section']/div[@class='menu-categories']/ul[@data-reactid='52']/li[4]"))).build().perform();
		//dr.findElement(By.xpath("//body/div[@id='app']/div[@class='body-wrapper']/div[@class='content-wrapper']/div[@data-reactid='3']/div[@class='headroom-wrapper']/div[@class='headroom headroom--unfixed']/div[@class='header-wrapper']/div[@class='header-bottom-section']/div[@class='menu-section']/div[@class='menu-categories']/ul[@data-reactid='52']/li[4]//following::div[1]")).click();
		//act.moveToElement(dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]"))).build().perform();
		//dr.findElement(By.xpath("//a[contains(text(),'WOMEN')]//following::a[1]")).click();
	}

}
