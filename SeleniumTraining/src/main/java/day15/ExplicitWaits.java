package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		Thread.sleep(11000);
		
		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		
		System.out.println(displayed);

	}

}
