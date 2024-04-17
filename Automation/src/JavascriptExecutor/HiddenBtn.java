package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenBtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);

		WebElement Hiddentext = driver.findElement(By.id("displayed-text"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='shiv';", Hiddentext);

		driver.findElement(By.id("show-textbox")).click();

	}
}
