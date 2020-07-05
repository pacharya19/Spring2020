package crmTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {
	
   WebDriver driver; 
   @Before
   public void launchBrowser() {
		
	    System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
	}
	@Test
	
   public void loginTest1() throws InterruptedException {
		
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	}
	
	@After	
	public void tearDown() {
		driver.close();
	}

}

