package demoqa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ScrShot = (TakesScreenshot) driver;
		Thread.sleep(3000);
		File ScrFile = ScrShot.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(ScrFile,new File("C:\\Users\\Administrator\\OneDrive\\Pictures\\Screenshots\\test.png"));
		Thread.sleep(3000);
		
		driver.quit();
	}

}
