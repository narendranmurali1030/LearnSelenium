package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FewOtherSeleniumMethods {

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

		// Get the title
		String title = driver.getTitle();
		System.out.println(title);

		// enter username
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.clear();
		userNameElement.sendKeys("DemoSalesManager");

		// enter password and press enter
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa", Keys.ENTER);

		// verify crm/sfa link is displayed (checks if present in the UI or not)
		boolean flag = driver.findElement(By.partialLinkText("CRM")).isDisplayed();

		if (flag) {
			String landingPageMessage = driver.findElement(By.tagName("h2")).getText();
			System.out.println(landingPageMessage);

			System.out.println("-------------------");
			landingPageMessage = driver.findElement(By.className("decorativeSubmit")).getText();
			System.out.println(landingPageMessage);
			landingPageMessage = driver.findElement(By.className("decorativeSubmit")).getAttribute("class");
			System.out.println(landingPageMessage);
			System.out.println("-------------------");

			driver.findElement(By.partialLinkText("CRM")).click();
		}

		// close the driver
		driver.close();

	}

}
