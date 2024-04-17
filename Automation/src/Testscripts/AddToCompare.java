package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompare {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();
		
		driver.findElement(By.linkText("COMPUTERS")).click();
		driver.findElement(By.xpath("(//a[@title='Show products in category Notebooks'])[1]")).click();
		
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Remove']")).click();
	}
}
