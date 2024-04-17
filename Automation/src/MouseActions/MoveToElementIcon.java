package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementIcon {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		WebDriver driver=new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);

		// navigate to mouse hover
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(2000);

		// cursor placed in icon
		WebElement mouse = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));

		Actions cursor = new Actions(driver);
		cursor.moveToElement(mouse).perform();
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.sendKeys("S");
		Thread.sleep(1000);
		pwd.sendKeys("h");
		Thread.sleep(1000);
		pwd.sendKeys("@");
		Thread.sleep(1000);
		pwd.sendKeys("1");
		Thread.sleep(1000);
		pwd.sendKeys("2");
		Thread.sleep(1000);
		pwd.sendKeys("3");
		Thread.sleep(1000);

	}

}
