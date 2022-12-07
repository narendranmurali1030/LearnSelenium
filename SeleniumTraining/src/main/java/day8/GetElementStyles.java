package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GetElementStyles {

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
		driver.get("https://www.leafground.com/link.xhtml");

		String color = driver.findElement(By.linkText("Go to Dashboard")).getCssValue("color");
		String fontFamily = driver.findElement(By.linkText("Go to Dashboard")).getCssValue("font-family");

		System.out.println(color);
		System.out.println(fontFamily);

		// converting rgba to hex value
		String hexvalue = Color.fromString(color).asHex();
		System.out.println(hexvalue);

		// get location of the element

		Point location = driver.findElement(By.xpath("//h5[text()='Take me to dashboard']")).getLocation();
		System.out.println(location);

		Point location1 = driver.findElement(By.xpath("//h5[text()='Duplicate Link']")).getLocation();
		System.out.println(location1);

		int x = location.getX();
		int y = location.getY();

		System.out.println(x);
		System.out.println(y);

		// get element size

		Dimension size = driver.findElement(By.linkText("Go to Dashboard")).getSize();
		Dimension size2 = driver.findElement(By.xpath("//h5[text()='Take me to dashboard']")).getSize();

		System.out.println(size);
		System.out.println(size2);

		System.out.println(size.height);
		System.out.println(size.width);

		// get tagname
		
		String tagName = driver.findElement(By.xpath("//h5[text()='Take me to dashboard']")).getTagName();
		System.out.println(tagName);

	}

}
