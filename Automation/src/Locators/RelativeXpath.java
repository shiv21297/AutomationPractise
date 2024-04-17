package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		//Maximize Browser
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Domain' and @id='domain1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mode' and @id='mode2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mode' and @id='mode6']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}