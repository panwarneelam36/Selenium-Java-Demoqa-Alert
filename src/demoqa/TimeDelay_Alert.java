package demoqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeDelay_Alert {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//For Scroll Down:
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
        // For TimeDelay Alert:
		
		WebElement timealertbtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timealertbtn.click();
		Thread.sleep(8000);
		
		Alert b = driver.switchTo().alert();
		Thread.sleep(6000);
		System.out.println(b.getText());
		Thread.sleep(6000);
		
		b.accept();
		Thread.sleep(6000);
		
		driver.quit();
}
}