package Myntra_ReportDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReportUtils {
	public static String screenshot(WebDriver driver, String Screenname)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sr=ts.getScreenshotAs(OutputType.FILE);
			String des="C:\\seleniumwebdiriver\\Reports"+Screenname+".png";
			File desnation=new File(des);
			FileUtils.copyFile(sr, desnation);
			return des;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return e.getMessage();
			
			
		}
	}

}
