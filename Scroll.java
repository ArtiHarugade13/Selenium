package codes;


	import org.junit.Test;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Scroll {

		
		@Test
		public void scrollPageDown() throws Throwable 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arti Harugade\\OneDrive\\Documents\\Jars\\chromedriver.exe");
			 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
			Thread.sleep(5000);
			
			((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		}
		
	}

