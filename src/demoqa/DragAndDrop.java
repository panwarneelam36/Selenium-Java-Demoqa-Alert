package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		Thread.sleep(3000);
		
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		Thread.sleep(3000);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
		driver.quit();
}
}
