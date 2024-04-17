package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/ui/");
		Thread.sleep(2000);

		// Click on PopUps
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);

		// Click on Browser windows
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		Thread.sleep(2000);

		// Click on Multiple windows
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);

		// Click on Click to open multiple PopUp windows
		driver.findElement(By.id("browserButton3")).click();
		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();

		switchToWindowByUrl(driver, "https://demoapps.qspiders.com/ui/browser/SignUp");

		// Enter username
		driver.findElement(By.id("username")).sendKeys("nandan");
		Thread.sleep(2000);
		// Enter email
		driver.findElement(By.id("email")).sendKeys("nandan@gmail.com");
		Thread.sleep(2000);
		// Enter password
		driver.findElement(By.id("password")).sendKeys("nandan@1234");
		Thread.sleep(2000);
		// Click on Signup button
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.close();

		switchToWindowByUrl(driver, "https://demoapps.qspiders.com/ui/browser/SignUpPage");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("aaaa@gmail.com");

		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);

		switchToWindowByUrl(driver, "https://demoapps.qspiders.com/ui/browser/Login");

		driver.findElement(By.id("username")).sendKeys("aaaaaaaaaaa");
		Thread.sleep(2000);
		driver.close();

		switchToWindowByUrl(driver, "https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		Thread.sleep(2000);
		driver.close();
	}

	public static void switchToWindowByUrl(WebDriver driver, String expectedUrl) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String actualUrl = driver.getCurrentUrl();
			if (actualUrl.equals(expectedUrl)) {
				break;
			}
		}
	}
}
