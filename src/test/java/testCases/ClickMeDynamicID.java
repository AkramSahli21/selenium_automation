package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMeDynamicID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("http://demoqa.com/buttons");

		// Maximize Browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(), 'Click Me')]")).click();
		
		//System.out.print("Yes");
		
		//Close browser
		//driver.quit();
	}


}
