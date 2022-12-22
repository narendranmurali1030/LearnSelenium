package day14new;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.6");
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\20122022.png");
		
		FileUtils.copyFile(source, dest);

	}

}
