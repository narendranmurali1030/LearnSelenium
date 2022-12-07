package day6;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// implicit wait (driver timeouts)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Get the URL
		driver.get("https://www.leafground.com/select.xhtml");

		// If dropdown is a select class

		WebElement dropDownElement = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following-sibling::div//select"));
		Select allDropDowns = new Select(dropDownElement);
		System.out.println(allDropDowns.getFirstSelectedOption().getText());
		// allDropDowns.selectByVisibleText("Cypress"); // or
		// allDropDowns.selectByValue("Selenium"); // or
		// allDropDowns.selectByIndex(3);
		
		System.out.println("---------------------------------------------");

		 List<WebElement> allElements = allDropDowns.getOptions();
		 for (WebElement each : allElements) {
		 System.out.println(each.getText());
		 }
		
		 for (int i = 0; i < allElements.size(); i++) {
		 System.out.println(allElements.get(i).getText());
		 }

		allDropDowns.selectByIndex(allElements.size() - 1);
		
		System.out.println("---------------------------------------------");
		
		System.out.println(allDropDowns.getFirstSelectedOption().getText());
		
		List<WebElement> allSelectedOptions = allDropDowns.getAllSelectedOptions();
		for (WebElement each : allSelectedOptions) {
			System.out.println(each.getText());
		}
		
		
		// dropdown which is not a select type or select tag
		
		driver.findElement(By.xpath("//label[text()='Select Country']/following-sibling::div")).click();
		driver.findElement(By.xpath("//li[text()='USA']")).click();
		
		
		
		
		
		
		
		

	}

}
