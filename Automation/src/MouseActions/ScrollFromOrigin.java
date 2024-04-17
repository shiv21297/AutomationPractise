package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);

		WebElement contactusbutton = driver.findElement(By.xpath("//a[.='Contact us']"));
		Thread.sleep(2000);

		Actions mouse = new Actions(driver);
		// mouse.scrollByAmount(0, 500).perform();
		// Thread.sleep(2000);

		ScrollOrigin origin = ScrollOrigin.fromElement(contactusbutton);
		mouse.scrollFromOrigin(origin, 0, -500).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}

