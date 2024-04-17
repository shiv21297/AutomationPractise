package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccount {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shiva");
		driver.findElement(By.id("LastName")).sendKeys("S");
		driver.findElement(By.id("Email")).sendKeys("shivashiv2103@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shiv@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Shiv@123");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
		driver.findElement(By.xpath("//a[.='Log out']")).click();
	}
}
