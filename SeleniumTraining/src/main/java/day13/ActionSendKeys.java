package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0hy1wxxdd21tl1brhvx6ait51n476552.node0");
		WebElement elementNew = driver.findElement(
				By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following-sibling::div//input"));
		elementNew.sendKeys("mynameishelloworldmynameishelloworld");
		
		new Actions(driver).sendKeys(elementNew, "mynameisnothelloworldmynameisnothelloworld").build().perform();

	}

}
