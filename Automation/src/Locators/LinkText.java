package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws Exception {
		// Launch Browser
		WebDriver driver=new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Launch Demo WebShop
		driver.get("https://demowebshop.tricentis.com");

		// Open Book Link
		driver.findElement(By.linkText("BOOKS")).click();
		Thread.sleep(2000);

		// Open Computer TextLink
		driver.findElement(By.linkText("COMPUTERS")).click();
		Thread.sleep(2000);

		// Open Electronics TextLink
		driver.findElement(By.linkText("ELECTRONICS")).click();
		Thread.sleep(2000);

		// Open Apparel&shoes TextLink
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		Thread.sleep(2000);

		// Open DigitalDownload
		driver.findElement(By.linkText("DIGITAL DOWNLOADS")).click();
		Thread.sleep(2000);

		// Open Jewelry
		driver.findElement(By.linkText("JEWELRY")).click();
		Thread.sleep(2000);

		// Open GiftCards
		driver.findElement(By.linkText("GIFT CARDS")).click();
		Thread.sleep(2000);

		
		//Close the Browser
		driver.quit();
	}
}

