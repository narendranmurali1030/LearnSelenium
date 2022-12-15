package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");

		System.out.println("---------------------------Before Clicking-------------------------------------");

		String firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);

		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']/following-sibling::button/span"))
				.click();

		System.out.println("---------------------------Current Window hanlde-------------------------------------");

		firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);

		System.out.println("---------------------------After Clicking-------------------------------------");

		Set<String> allWindowIDs = driver.getWindowHandles();
		for (String string : allWindowIDs) {
			System.out.println(string);
		}

		System.out.println(
				"---------------------------Getting Windows handler using list-------------------------------------");

		List<String> list = new ArrayList<String>(allWindowIDs);
		String firstWindows = list.get(0);
		String secondWindows = list.get(1);
		System.out.println(firstWindows);
		System.out.println(secondWindows);

		driver.switchTo().window(secondWindows);

		boolean displayed = driver.findElement(By.xpath("//div[text()='LEARNERS']")).isDisplayed();
		if (displayed) {
			System.out.println("yes the element is displayed");
		}

		driver.close();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(windowHandles);
		String oldWindow = list1.get(0);

		driver.switchTo().window(oldWindow);

		boolean displayed2 = driver
				.findElement(
						By.xpath("//h5[text()='Click and Confirm new Window Opens']/following-sibling::button/span"))
				.isDisplayed();
		if (displayed2) {
			System.out.println("yes the element is displayed");
		}

	}

}
