package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisabledTextfield {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[.='Disabled']")).click();
		Thread.sleep(2000);

//		jse.executeScript("document.getElementById('name').value='shiva';");   JAVASCRIPT

		WebElement nameTextfield = driver.findElement(By.id("name"));
		WebElement emailID = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));

		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='shiva';arguments[1].value='shivashiv2102@gmail.com';arguments[2].value='Shiv@123';",nameTextfield, emailID, password);
	
		Thread.sleep(2000);

	    driver.findElement(By.xpath("//button[.='Register']")).click();
	}

}
