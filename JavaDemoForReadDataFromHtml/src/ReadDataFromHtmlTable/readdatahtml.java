package ReadDataFromHtmlTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readdatahtml {
	@Test
	public void ReadDataFromHtml()
	{
		String key="webdriver.chrome.driver";
		String path="C:\\seleniumwebdiriver\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, path);
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();	
        dr.get("https://www.livechennai.com/gold_silverrate.asp");
        System.out.println(dr.getTitle());
        
        
        //Get  cell value from html/WebTable
        System.out.println(dr.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]/td[4]")).getText());
        //Row Count
      
      // List<WebElement> t=dr.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]"));
        List<WebElement> trcount=dr.findElements(By.tagName("tr"));
        System.out.println(trcount.size());
        //table data
        List<WebElement> tdata=dr.findElements(By.tagName("td"));
        System.out.println(tdata.size());
        //Cell Count
	}
	

}
