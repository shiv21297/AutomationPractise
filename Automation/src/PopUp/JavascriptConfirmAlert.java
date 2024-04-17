package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		//Click on PopUp
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		//Click on JavaScript
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		Thread.sleep(2000);
		//Click on Confirm
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(2000);
		//Click on ConfirmBoxButton
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		//Accept(Okay)
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		//Dismiss(cancel)
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
			
	}
}
