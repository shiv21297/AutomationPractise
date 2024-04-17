package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToElementRating {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		WebDriver driver=new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Ratings")).click();
		Thread.sleep(2000);

		List<WebElement> allstars = driver.findElements(By.xpath("//input[@name='radio']/.."));

		Actions mouse = new Actions(driver);

		while (true) {
			for (WebElement star : allstars) {

				mouse.moveToElement(star).perform();
				Thread.sleep(500);
			}
			for (int i = allstars.size() - 1; i >= 0; i--) {
				mouse.moveToElement(allstars.get(i)).perform();
				Thread.sleep(500);

				driver.quit();
			}
		}
	}
}

