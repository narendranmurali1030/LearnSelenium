package day15;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("//span[text()='Click']")).click();

		// Thread.sleep(3000);

		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();

		System.out.println(displayed);

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();

		// Thread.sleep(3000);

		boolean isDisplayed = driver.findElement(By.xpath("//span[text()='I am about to hide']")).isDisplayed();

		System.out.println(isDisplayed);

	}

}
