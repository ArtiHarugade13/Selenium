package codes;

	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class SwitchTab {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arti Harugade\\OneDrive\\Documents\\Jars\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		
		    Thread.sleep(3000);
		    
		    String ParentWindowHandle = driver.getWindowHandle();
		    System.out.println("ParentWindowhandle"  +ParentWindowHandle);
		    
		    driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
		    
		    Thread.sleep(4000);
		       
		    for(String childTab:driver.getWindowHandles())
		    {
		    	driver.switchTo().window(childTab);
		    }
		
		    driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
		    
		    Select field = new Select(driver.findElement(By.id("search_type")));
		
		field.selectByVisibleText("First Name");
		field.selectByIndex(2);
		
		 driver.findElement(By.id("search_patient")).click();
		 
		 driver.close();
		}
	
}
