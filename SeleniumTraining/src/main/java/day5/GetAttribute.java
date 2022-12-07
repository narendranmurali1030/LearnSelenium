package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

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

		// enter username
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.clear();
		userNameElement.sendKeys("DemoSalesManager");

		// enter password and press enter
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa", Keys.ENTER);
		
		String attributeValue = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]/parent::div[@for='crmsfa']")).getAttribute("id");
		System.out.println(attributeValue);
	}

}
