package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRobotTest {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		Robot robo = new Robot();

		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
//      robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_A);

//	    robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_SPACE);
		robo.keyPress(KeyEvent.VK_U);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_H);

	}
}
