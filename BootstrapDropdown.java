package codes;




	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class BootstrapDropdown {
	 public static void main(String[] args) throws InterruptedException {
		 String projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);
			  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Arti Harugade\\\\OneDrive\\\\Documents\\\\Jars\\\\chromedriver.exe");
	 
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	  driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[3]/strong")).click();
	  Thread.sleep(5000);
	  List<WebElement> list = driver.findElementsByXPath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div");
	  
	  for (WebElement cr : list)
	  {
	   System.out.println("Values " + cr.getAttribute("innerHTML"));
	 
	   if (cr.getAttribute("innerHTML").contains("HTML,CSS")) {
	    
		   cr.click();
		    break;
		   }
		  }
		 }
		}


