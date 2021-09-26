package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// Open url Tools QA
		driver.get("http://demo.guru99.com/test/upload/");

		// Maximize Browser
		driver.manage().window().maximize();
		
		WebElement uploadFile = driver.findElement(By.name("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\ELITEBOOK\\ISTQB\\formation-theWay\\Test-Auto\\zied.jpg");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		//Verifer le message 
		
		Thread.sleep(5000);
		String submitbutton = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		Assert.assertTrue(submitbutton.contains("successfully"));
		driver.quit();

	}

}
