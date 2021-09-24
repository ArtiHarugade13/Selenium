package codes;

import java.io.File;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class screenshot {

	
	@Test
	public void CaptureScreenshot()  throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arti Harugade\\OneDrive\\Documents\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./Screenshot/ss.png"));
		System.out.println("Screenshot Taken");
		driver.quit();
		
	}
}
