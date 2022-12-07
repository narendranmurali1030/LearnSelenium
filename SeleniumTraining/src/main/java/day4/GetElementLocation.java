package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetElementLocation {

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

		// verify crm/sfa link is displayed (checks if present in the UI or not)
		Point location = driver.findElement(By.partialLinkText("CRM")).getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());

		// close the driver
		driver.close();
		
		
		
		WebElement dropDownElement = driver.findElement(By.id("createLeadForm_industryEnumId"));		
		Select allDropDowns = new Select(dropDownElement);
		allDropDowns.selectByVisibleText("Aerospace"); // or
		allDropDowns.selectByValue("IND_AEROSPACE"); // or
		allDropDowns.selectByIndex(1);

	}

}
