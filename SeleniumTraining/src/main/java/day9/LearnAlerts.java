package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		 options.addArguments("--disable-notifications");
		 options.addArguments("--start-maximized");
		

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver(options);


		// implicit wait (driver timeouts)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the URL
		driver.get("https://www.leafground.com/alert.xhtml");

		// Simple Dialog Alert
		String value = driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::span")).getText();
		System.out.println(value);
		 driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button/span[2]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		value= driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::span")).getText();
		System.out.println(value);

		// Confirm Dialog Alert
		value = driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::span")).getText();
		System.out.println(value);
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button/span[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		value = driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::span")).getText();
		System.out.println(value);

		// Confirm Dialog Alert
		value = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::span")).getText();
		System.out.println(value);
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button/span[2]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Narendran");
		alert2.accept();
		value = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::span")).getText();
		System.out.println(value);
		
		// Sweet Alert (Simple Dialog)
		
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button/span[2]")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//p[contains(text(),'You have clicked and open a dialog that can be inspectable.')]")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("Yes Pop Up Displayed");
			driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		}
		
		
		// notifications handling
		driver.get("https://www.justdial.com/");

	}

}
