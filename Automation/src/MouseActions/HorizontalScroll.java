package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Scroll")).click();
		Thread.sleep(2000);
		
		//HorizontalScrollTest
		Actions mouse=new Actions(driver);
		mouse.scrollByAmount(2000, 5000).perform();
		Thread.sleep(2000);
		mouse.scrollByAmount(-20000, 5000).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}

