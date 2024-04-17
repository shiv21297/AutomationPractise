package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledfiledownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk22-linux");
		Thread.sleep(4000);

		driver.findElement(By.linkText("jdk-8u401-linux-aarch64.rpm")).click();
		Thread.sleep(4000);

		WebElement disablebutton = driver.findElement(By.linkText("Download jdk-8u401-linux-aarch64.rpm"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].click();", disablebutton);
	}

}