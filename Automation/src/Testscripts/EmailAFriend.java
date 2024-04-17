package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();
		
		driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();
		driver.findElement(By.xpath("//a[.='3rd Album']")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("imshiva21297@gmail.com");
		driver.findElement(By.id("PersonalMessage")).sendKeys("Here is your gift");
		
		driver.findElement(By.xpath("//input[@name='send-email']")).click();
		
}
}
