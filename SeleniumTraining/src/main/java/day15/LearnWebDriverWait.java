package day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("//span[text()='Click']")).click();

		Thread.sleep(11000);

		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();

		System.out.println(displayed);

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();

		WebElement element = driver.findElement(By.xpath("//span[text()='I am about to hide']"));

		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(180));
		wd.until(ExpectedConditions.invisibilityOf(element));

		List<WebElement> allElements = driver.findElements(By.xpath("//span[text()='I am about to hide']"));
		int size = allElements.size();

		System.out.println(size);

	}

}
