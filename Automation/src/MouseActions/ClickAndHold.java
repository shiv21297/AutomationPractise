package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		// Click on ClickandHold
		driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement circle = driver.findElement(By.id("circle"));
		Thread.sleep(2000);
		Actions mouse = new Actions(driver);
		mouse.clickAndHold(circle).perform();
		Thread.sleep(5000);

		// Click on Release
		driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement circle1 = driver.findElement(By.id("circle"));
		Thread.sleep(2000);
		Actions mouse1 = new Actions(driver);
		mouse1.release(circle1).perform();
		Thread.sleep(5000);

		driver.quit();
	}
}
