package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// implicit wait (driver timeouts)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the URL
		driver.get("https://www.leafground.com/checkbox.xhtml");

		// is enabled
		boolean enabled = driver.findElement(By.xpath("//span[text()='Basic']/preceding::span[1]")).isEnabled();
		System.out.println(enabled);

		// is selected
		boolean selected = driver.findElement(By.xpath("//span[text()='Basic']/preceding::span[1]")).isSelected();
		System.out.println(selected);

		// is enabled
		boolean enabled1 = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::span[1]")).isEnabled();
		System.out.println(enabled1);

		// is selected
		boolean selected1 = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::span[1]")).isSelected();
		System.out.println(selected1);

		System.out.println("---------------------------");

		Thread.sleep(6000);

		// // checking the checkbox
		// driver.findElement(By.xpath("//span[text()='Basic']/preceding::span[1]")).click();

		// is enabled
		enabled = driver.findElement(By.xpath("//span[text()='Basic']/preceding::span[1]")).isEnabled();
		System.out.println(enabled);

		// is selected
		selected = driver.findElement(By.xpath("//span[text()='Basic']/preceding::span[1]")).isSelected();
		System.out.println(selected);

	}

}
