package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/");
		Thread.sleep(2000);
		
		//Click on PopUps
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		
		//Click on Browser windows
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		Thread.sleep(2000);
		
		//Click on Open in new window button
		driver.findElement(By.linkText("Open in new window")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
		String title=driver.getTitle();
		System.out.println(title);
		}
		
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("shivashiv2102@gmail.com");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("Shiv@123");
		
		//Enter confirm password
		driver.findElement(By.id("confirm-password")).sendKeys("Shiv@123");
		
		//Click on SignUp button
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	}
 }


