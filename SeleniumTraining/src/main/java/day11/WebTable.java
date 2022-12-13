package day11;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting System Property
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Get the URL
		driver.get("https://etrain.info/trains/Chennai-Central-MAS-to-Coimbatore-Jn-CBE");

		// find the webtable
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'trainlist')]/table"));

		// find the row from the webtable
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// get the count for rows / number of rows
		int rowSize = rows.size();
		System.out.println("RowSize -->" + rowSize);

		// pick up the first row
		WebElement firstRow = rows.get(0);

		// find the columns from particular row
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));

		// get the count for columns / number of columns
		int columnSize = columns.size();
		System.out.println("columnSize -->" + columnSize);

		// pick up the first columns
		WebElement firstColumn = columns.get(1);

		// get the text
		String text = firstColumn.getText();
		System.out.println(text);

		// Printing all values from the webtable

		row: for (int i = 1; i <= rowSize; i++) {

			column: for (int j = 1; j <= columnSize; j++) {

				String xpath1 = "//div[contains(@class,'trainlist')]/table//tr[";
				String xpath2 = "]/td[";
				String xpath3 = "]";

				String value = driver.findElement(By.xpath(xpath1 + i + xpath2 + j + xpath3)).getText();
				System.out.print(value + "--> ");

			}
			System.out.println();

		}

	}

}
