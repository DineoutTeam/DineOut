package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AUL_Lib {
	public static String getProperty(String path,String key)
	{
		String v="";
		
		try
		{
			Properties p = new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);

		}
		catch(Exception e)
		{
			Reporter.log("error");
		}
		
		return v;
	}

	public static void Takephoto(String folder,String Testname,WebDriver driver)
	{

		String dateTime = new Date().toString().replaceAll(":","_");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		String dstPath = folder+Testname+dateTime+".png";
		try
		{

			FileUtils.copyFile(srcFile,new File(dstPath));
		}
		catch(Exception e)
		{
			Reporter.log("error occured");
		}

	}
	public void verifytitle(WebDriver driver,String atitle)
	{
		atitle=driver.getTitle();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(atitle));
		}
		catch(Exception e)
		{
			Reporter.log("Title not visble");
		}
		
	}
	
	public static void selectelement(WebElement element)
	{
		element.click();
	}

	public static void clickElement(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.moveToElement(element);
		
		
		
	}

}
