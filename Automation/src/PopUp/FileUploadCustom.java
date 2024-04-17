package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadCustom {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Custom Button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='Upload File']")).click();
		Thread.sleep(2000);

		Robot robo = new Robot();

		//To press 8 times
	//	for(int i=0;i<8;i++) {
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_RIGHT);
		robo.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_RIGHT);
		robo.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_RIGHT);
		robo.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_RIGHT);
		robo.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		

	}
}

