package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open url OrangeHRM
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				//Maximize Browser
				driver.manage().window().maximize();
				
				//Fill Username
				//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
				//Fill Username with xpath rel
				//driver.findElement(By.xpath("//input[@name= 'txtUsername']")).sendKeys("Admin");

				driver.findElement(By.name("txtUsername")).sendKeys("Admin");

				
				//Fill Password
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				
				//Click login button with explicit wait
				WebElement btnLogin;
				WebDriverWait wait = new WebDriverWait(driver, 20);
				btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
				btnLogin.click();
				
				//Click login button 
				//driver.findElement(By.id("btnLogin")).click();
				
				//Storage and compare
				String user = driver.findElement(By.id("welcome")).getText();
				Assert.assertTrue(user.contains("Welcome"));
				//Assert.assertEquals("Welcome Kotha", user);
				
				//Wait 5 sec
				Thread.sleep(5000);
		
		//kill browser
		driver.quit();
		
		//driver.close();
	
	}

}
