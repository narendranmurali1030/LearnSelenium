package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeaptTapsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Get the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Get the title
		String title = driver.getTitle();
		System.out.println(title);

		// enter username
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.sendKeys("DemoSalesManager");

		// enter password
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");

		// click login
		driver.findElement(By.className("decorativeSubmit")).click();

		// navigate back
		driver.navigate().back();

		// Get the title
		title = driver.getTitle();
		System.out.println(title);

		// navigate back
		driver.navigate().forward();

		// navigate back
		driver.navigate().refresh();

		// close the driver
		driver.close();

	}

}
