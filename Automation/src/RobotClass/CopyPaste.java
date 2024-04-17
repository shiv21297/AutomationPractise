package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("name")).click();
		Thread.sleep(2000);
		
        Robot robo=new Robot();
        
        Thread.sleep(2000);
        
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		
		
		
	}
}


