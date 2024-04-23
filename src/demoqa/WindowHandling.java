package demoqa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\OneDrive\\Documents\\Uncodemy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String parentWindowID = driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowID);
		Thread.sleep(3000);
		
		WebElement instaPage = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		instaPage.click();
		Thread.sleep(3000);
		
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println("All Window ID: "+allWindowID);
		Thread.sleep(3000);
		
		for(String webPages: allWindowID)
		{
			if(!parentWindowID.equals(webPages))
			{
				driver.switchTo().window(webPages);
			}
		}
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Neelam panwar");
		
	}
}
