package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver=new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);

		WebElement ComputersLink=driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(2000);
		Actions mouse=new Actions(driver);
		mouse.moveToElement(ComputersLink).perform();
		
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}

