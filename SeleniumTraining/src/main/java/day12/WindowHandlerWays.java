package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		// longest way of going to last window

//		 Set<String> windowHandles = driver.getWindowHandles();
//		 List<String> list = new ArrayList<String>(windowHandles);
//		 String lastWindow = list.get(2);
//		
//		 driver.switchTo().window(lastWindow);
//		 String title = driver.getTitle();
//		 System.out.println(title);

		// easiest way of going to the last opened window

//		 Set<String> windowHandles = driver.getWindowHandles();
//		 for (String each : windowHandles) {
//		 driver.switchTo().window(each);
//		 }
//		 String title = driver.getTitle();
//		 System.out.println(title);

		// print all the opened window title

		// Set<String> windowHandles = driver.getWindowHandles();
		// for (String each : windowHandles) {
		// driver.switchTo().window(each);
		// System.out.println("--------------------");
		// System.out.println(each);
		// String title = driver.getTitle();
		// System.out.println(title);
		// }

		// go to particular opened window based on the title

		Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {

			if (driver.switchTo().window(each).getTitle().equals("Dashboard")) {
				break;
			}

			System.out.println(each);
			String title = driver.getTitle();
			System.out.println(title);

		}

	}

}
