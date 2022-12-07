package day3;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// implicit wait (driver timeouts)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Get the title
		String title = driver.getTitle();
		System.out.println(title);

		// enter username
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.clear();
		userNameElement.sendKeys("DemoSalesManager");

		// enter password
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");

		// click login
		driver.findElement(By.className("decorativeSubmit")).click();

		// logout
		driver.findElement(By.tagName("input")).click();

		// Get the title
		title = driver.getTitle();
		System.out.println(title);

		// click on crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Get the title
		title = driver.getTitle();
		System.out.println(title);

		// close the driver
		driver.close();

	}

}
