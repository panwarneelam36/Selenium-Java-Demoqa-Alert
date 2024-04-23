package demoqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// For Simple Alert:
		
		WebElement alertbtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbtn.click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(5000);
		a.accept();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
