package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);

		// Click on LoginButton
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);

		// Click on GotIt button
		driver.findElement(By.cssSelector("[class='acceptance-btn-text']")).click();
		Thread.sleep(2000);

		// Click on SignIn button
		driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();
		Thread.sleep(2000);

		Set<String> allWindows= driver.getWindowHandles();

		for (String window:allWindows) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if (title.contains("Sign in")) {
				break;
			}
		}
		Thread.sleep(2000);
		//Enter email
		driver.findElement(By.id("identifierId")).sendKeys("shivashiv2102@gmail.com");
	}
}
