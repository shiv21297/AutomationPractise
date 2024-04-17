package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedwithMultipleiframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(0);

		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		Thread.sleep(2000);
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		Thread.sleep(2000);
		String confirmpassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.switchTo().frame(0);

		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(confirmpassword);
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);

		//WAS to transfer control from one frame to another frame
	}
}
