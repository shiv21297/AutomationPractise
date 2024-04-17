package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPrompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		// Click on PopUp
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		// Click on JavaScript
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		Thread.sleep(2000);
		// Click on Prompt
		driver.findElement(By.linkText("Prompt")).click();
		Thread.sleep(2000);
		// Click on PromptAlertBox for "YES"
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		// SendKeys to YES
	//	driver.switchTo().alert().sendKeys("yes");
	//	driver.switchTo().alert().accept();
	//	Thread.sleep(2000);
		
		Alert promptAlert=driver.switchTo().alert();
		
		promptAlert.getText();
		
		promptAlert.sendKeys("no");
		
		promptAlert.accept();
	}
}


