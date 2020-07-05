package crmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		login();
		tearDown();
		
	}
	
	public static void launchBrowser() {
		
	    System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		
	}
	
	public static void login() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
	}
		
	public static void tearDown() {
		driver.close();
	}

}
