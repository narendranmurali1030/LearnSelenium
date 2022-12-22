package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");

		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
//
//		// type 
//		js.executeScript("arguments[0].value='Hello';", element);
//		
//		// click
//		
//		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node05hbovgztzflw1v5adpvb41scu1028.node0");
//		
//		element = driver.findElement(By.xpath("//label[text()='Select Country']"));
//		
//		js.executeScript("arguments[0].click();", element);
		
		
		// scroll
		
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement element = driver.findElement(By.xpath("//h4[text()='Resize Image']"));
		
		// js.executeScript("window.scrollBy(0,250)");
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		
		
		

	}

}
