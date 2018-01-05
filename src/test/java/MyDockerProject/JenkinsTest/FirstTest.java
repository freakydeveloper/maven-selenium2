package MyDockerProject.JenkinsTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2");
	      driver = new ChromeDriver(); 
	      driver.get("https://www.google.ae/"); 
	      driver.findElement(By.name("q")).sendKeys("GMAIL");
	      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	      Thread.sleep(5000);;
	      System.out.println("TITLE"+driver.getTitle());
	      
	      WebElement element = driver.findElement(By.cssSelector("#rso > div > div > div:nth-child(1) > div > div > h3 > a"));
	      System.out.println("link text : "+element.getText());
	      element.click();
	      System.out.println("TITLE"+driver.getTitle());
	      driver.quit();
	
	
	
	}

}
