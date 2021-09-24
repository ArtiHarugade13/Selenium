package codes;



	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TextwithoutSendkey {
		   public static void main(String[] args) {
			   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arti Harugade\\\\OneDrive\\\\Documents\\\\Jars\\\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
		      driver.get("https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		       
		      JavascriptExecutor js = (JavascriptExecutor)driver;
		      js.executeScript ("document.getElementById('identifierId').value='Arti Harugade'");
		      
		     
		      
		   }
		}

