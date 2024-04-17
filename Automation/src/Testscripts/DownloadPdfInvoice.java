package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPdfInvoice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();
		
		driver.findElement(By.xpath("//a[.='shivashiv2102@gmail.com']")).click();
		driver.findElement(By.xpath("(//a[.='Orders'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@onclick=\"setLocation('/orderdetails/1680899')\"]")).click();
		driver.findElement(By.xpath("//a[.='PDF Invoice']")).click();
	}
}
