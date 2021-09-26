package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		
		//Open Chrome 
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Open url OrangeHRM
				driver.get("https://juliemr.github.io/protractor-demo/");
				
				//Maximize Browser
				driver.manage().window().maximize();
				
				//find champs
				
				WebElement first = driver.findElement(By.xpath("//input[@ng-model='first']"));
				WebElement second = driver.findElement(By.xpath("//input[@ng-model='second']"));
				//WebElement btn = driver.findElement(By.xpath("//input[@ng-click='doAddition()']"));

				
				//driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("1");
				//driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("2");
				//driver.findElement(By.xpath("//input[@ng-click='doAddition()']")).click();
				
				//Get champs			
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				
				Actions actions = new Actions (driver);
				actions.sendKeys(first , "0").perform();
				actions.sendKeys(second , "0").perform();
				
				//la somme est
				//actions.keyDown(keys.Control).sendKeys("+").keyUp(Keys.CONTROL).perform();
				driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys(Keys.NUMPAD1 ,Keys.ENTER);

				driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys(Keys.NUMPAD5,Keys.ENTER);

				Thread.sleep(5000);
				
				//kill browser
				//driver.quit();

	}

}
