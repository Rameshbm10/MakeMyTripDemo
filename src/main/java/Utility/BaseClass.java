package Utility;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.Authentication.Failure;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties ppt;
	public WebDriverWait wait;
	
   @BeforeMethod
   public void applLaunch() throws IOException
   {
	   FileInputStream fis=new FileInputStream("./src/test/resources/apllication.properties");
	   ppt=new Properties();
	   ppt.load(fis);
	   String uRL = ppt.getProperty("url");
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get(uRL);
	   wait=new WebDriverWait(driver, 10);
   }
   
   @AfterMethod
   public void closeApp(ITestResult result) throws IOException
   {
	   if(result.getStatus()==ITestResult.FAILURE)
	   {
		    String methodName = result.getMethod().getMethodName();
		    TakesScreenshot tss=(TakesScreenshot)driver;
		    File src = tss.getScreenshotAs(OutputType.FILE);
		    File dst=new File(".screenshot"+methodName+".jpeg");
		    FileUtils.copyFile(src, dst);
	   }
	   driver.close();
   }
}
