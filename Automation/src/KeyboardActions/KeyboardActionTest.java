package KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionTest {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		WebDriver driver=new ChromeDriver();
		// Maximize
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		//Keyboard actions
		Actions keyboard = new Actions(driver);
		keyboard.keyDown(Keys.SHIFT).sendKeys("shiva").perform();
		Thread.sleep(2000);
		keyboard.keyUp(Keys.SHIFT).sendKeys(" shiv").perform();
		Thread.sleep(2000);
        
		//SHIVA shiv output
		driver.quit();
	}
}

