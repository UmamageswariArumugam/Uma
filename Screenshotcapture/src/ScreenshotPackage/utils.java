package ScreenshotPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utils {
	public static void Myscreenshot(WebDriver d,String screenname)
	{
		try {
		TakesScreenshot st1=(TakesScreenshot)d;//Takesscreenshot class and typecasting
		File sc1=st1.getScreenshotAs(OutputType.FILE);// capture screenshot command and stored into sc1 object
		FileUtils.copyFile(sc1, new File("C:\\seleniumwebdiriver\\PageScrenShots\\"+screenname+".png"));
		
	}
		catch(Exception e)
		{

}
}
}