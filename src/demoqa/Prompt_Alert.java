package demoqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//For Scroll Down:
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//For Prompt Alert:
		WebElement promptbtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptbtn.click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		
		a.sendKeys("Neelam Panwar");
		Thread.sleep(3000);
		
		a.accept();
		Thread.sleep(3000);
		
		WebElement promptResult = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(promptResult.getText());
		Thread.sleep(3000);
		
		driver.quit();
	}

}
