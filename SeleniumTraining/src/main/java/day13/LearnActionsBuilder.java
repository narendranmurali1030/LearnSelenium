package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");

		// MouseOver
		WebElement element = driver.findElement(By.xpath("(//i[contains(@class,'home')])[1]"));
		Actions builder = new Actions(driver);
		// builder.moveToElement(element).build().perform();

		// rightclick
		// element = driver.findElement(By.xpath("(//i[contains(@class,'home')])[1]"));
		// builder.contextClick(element).build().perform();

		// doubleclick
		// builder.doubleClick(element).build().perform();

		// combining actions
		// element = driver.findElement(By.xpath("(//i[contains(@class,'table')])[1]"));
		// builder.moveToElement(element).pause(5000).contextClick().build().perform();

		// try it out
		// https://www.mstsolutions.com/crm/#
		// flipkart men

		// Drag and Drop

		WebElement pickUpElement = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement dropByElement = driver.findElement(By.xpath("//span[text()='Droppable Target']"));

		builder.dragAndDrop(pickUpElement, dropByElement).build().perform();

		// Drag and Drop By
		WebElement source = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		int x = source.getLocation().getX();
		int y = source.getLocation().getY();
		builder.pause(5000).dragAndDropBy(source, x + 100, y + 100).build().perform();

		// keyboard and mouse (not sequenced)
		WebElement elemet1 = null;
		WebElement elemet2 = null;
		WebElement elemet3 = null;
		WebElement elemet4 = null;
		builder.keyDown(Keys.CONTROL).click(elemet1).click(elemet2).click(elemet3).click(elemet4).keyUp(Keys.CONTROL)
				.build().perform();

		// keyboard and mouse (sequence)
		builder.click(elemet1).keyDown(Keys.SHIFT).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN)
				.keyUp(Keys.SHIFT).keyUp(Keys.DOWN).build().perform();
		
		
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0hy1wxxdd21tl1brhvx6ait51n476552.node0");
		WebElement elementNew = driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following-sibling::div//input"));
		elementNew.sendKeys("mynameishelloworldmynameishelloworld");
	}

}
