package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Step1 Create an object of ChromeOptions
		ChromeOptions option = new ChromeOptions();

		// Step2 Add Argument
		option.addArguments("--disable-notifications");

		// Step3 Pass chromeOptions reference variable to ChromeDriver
		WebDriver driver=new ChromeDriver(option);
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/");
		Thread.sleep(6000);

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
}

