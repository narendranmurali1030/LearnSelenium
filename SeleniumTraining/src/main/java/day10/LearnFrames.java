package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Get the URL
		driver.get("https://www.leafground.com/frame.xhtml");

		WebElement frameElement = driver
				.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following-sibling::iframe"));

		// index based
		driver.switchTo().frame(0);

		// name or id based
		// driver.switchTo().frame("frame2");

		// webelement based
		// driver.switchTo().frame(frameElement);

		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		driver.switchTo().frame(2);
		// WebElement outerFrame = driver.findElement(By.xpath("//h5[text()=' Click Me
		// (Inside Nested frame)']/following-sibling::iframe"));
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@name='frame2' and @id='frame2']"));

		// index based
		// driver.switchTo().frame(2);
		// driver.switchTo().frame(0);

		// name or id based
		// driver.switchTo().frame(2);
		// driver.switchTo().frame("frame2");

		// webelement based
		// driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(innerFrame);

		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();

		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		System.out.println(text);

	}

}
