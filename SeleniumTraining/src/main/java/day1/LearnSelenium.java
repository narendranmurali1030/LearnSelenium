package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting the property
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Training\\MyTrainingTeamWorkSpace\\SeleniumTraining\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./MyChromeDriverFile/chromedriver.exe");

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Get the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Get the title
		String title = driver.getTitle();
		System.out.println(title);

	}

}
