package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		Actions mouse = new Actions(driver);
		mouse.scrollToElement(driver.findElement(By.xpath("//h2[.='News']"))).perform();
		Thread.sleep(2000);

		driver.quit();

	}

}

