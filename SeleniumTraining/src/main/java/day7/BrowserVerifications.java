package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// implicit wait (driver timeouts)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		// enter username
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.clear();
		userNameElement.sendKeys("democsr");

		// enter password and press enter
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa", Keys.ENTER);
		
		// click on crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
		// click on create lead link on the left side
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		// get attribute id for company name field
		String value = driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).getAttribute("id");
		System.out.println(value);

	}

}
