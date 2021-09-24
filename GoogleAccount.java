package codes;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GoogleAccount {
		
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arti Harugade\\OneDrive\\Documents\\Jars\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get( "https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp"); 
	    
	    WebElement attr = driver.findElement(By.name("firstName"));
	    attr.sendKeys("Arti");
	    
	    String firstName =  attr.getAttribute("value");
	    
	    System.out.println("First Name:" +firstName);
	    
	    WebElement atr = driver.findElement(By.name("lastName"));
	    atr.sendKeys("Harugade");
	    
	    String lastName =  atr.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Last Name:" +lastName);
	    
	    WebElement ar = driver.findElement(By.name("Username"));
	    String Username =  ar.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Username:" +Username);
	    
	    WebElement at = driver.findElement(By.name("Passwd"));
	    at.sendKeys("Busstop@123");
	    
	    String Passwd =  at.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Password:" +Passwd);
	    
	    WebElement atrr = driver.findElement(By.name("ConfirmPasswd"));
	    atrr.sendKeys("Busstop@123");
	    
	    String ConfirmPasswd =  atrr.getAttribute("value");
	    Thread.sleep(3000);
	    
	    System.out.println("Confirm Password:" +ConfirmPasswd);
	    
	    driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button")).click();
	    
	    Thread.sleep(3000);
	    WebElement a6 = driver.findElement(By.id("phoneNumberId"));
	    a6.click();
	    a6.sendKeys("8433660162");

	    String Phoneno =  a6.getAttribute("value");
	    Thread.sleep(3000); 
	    System.out.println("Phone Number:" +Phoneno);
	    
	    driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();WebElement trr = driver.findElement(By.id(" phoneNumberId"));
	    trr.sendKeys("Busstop@123");
	    
	    String  phoneNumberId =  atrr.getAttribute("value");
	    
	    driver.close();
	   
	}
	}


