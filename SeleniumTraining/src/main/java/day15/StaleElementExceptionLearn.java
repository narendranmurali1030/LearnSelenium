package day15;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementExceptionLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/waits.xhtml");

		try {
			
			driver.findElement(By.xpath("//span[text()='Click']")).click();
			
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			
			Thread.sleep(5000);
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(30));
			wd.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//span[text()='Click']"))));
			driver.findElement(By.xpath("//span[text()='Click']")).click();			
			
		}
		
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(30));
			wd.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Click']"))));
			driver.findElement(By.xpath("//span[text()='Click']")).click();			
			
		}

	}

}
