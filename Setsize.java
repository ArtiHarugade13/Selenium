package codes;


	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Setsize {
		public static void main(String[] args) {
		      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arti Harugade\\OneDrive\\Documents\\Jars\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.zlti.com";
		      driver.get(url);
		      Dimension d = new Dimension(500,900);
		      driver.manage().window().setSize(d);
		}
		
	}


