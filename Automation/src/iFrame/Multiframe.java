package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);

		driver.findElement(By.id("email")).sendKeys("shiv2102@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Shiv@123");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("Shiv@123");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);

		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(1);

		driver.findElement(By.id("username")).sendKeys("shiv2102@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Shiv@123");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
