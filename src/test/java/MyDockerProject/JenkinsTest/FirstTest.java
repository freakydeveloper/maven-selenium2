package MyDockerProject.JenkinsTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	@Test
	public void test() throws InterruptedException, IOException {
		WebDriver driver;
		String os = System.getProperty("os.name");
		System.out.println(System.getProperty("os.name"));
		if(os.toLowerCase().contains("mac")) {

			 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2");
		}
		else {
			Runtime.getRuntime().exec("sudo chmod +x drivers/chromedriver3");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver3");
		}

			System.out.println("Test2"); 
	      driver = new ChromeDriver(); 
	      System.out.println("Test2"); 
	      driver.get("https://www.google.ae/"); 
	      System.out.println("Test3"); 
	      driver.findElement(By.name("q")).sendKeys("GMAIL");
	      System.out.println("Test4"); 
	      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	      Thread.sleep(5000);;
	      System.out.println("TITLE"+driver.getTitle());
	      
	      WebElement element = driver.findElement(By.cssSelector("#rso > div > div > div:nth-child(1) > div > div > h3 > a"));
	      System.out.println("link text : "+element.getText());
	      element.click();
	      System.out.println("TITLE"+driver.getTitle());
	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   // Now you can do whatever you need to do with it, for example copy somewhere
	   FileUtils.copyFile(scrFile, new File("/home/Screenshot.png"));
	      driver.quit();
	
	
	
	}

}
