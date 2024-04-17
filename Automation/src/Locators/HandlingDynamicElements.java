package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicElements {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
	
		//Click on UI Testing Concepts
		driver.findElement(By.xpath("//p[contains(.,'UI Testing Concepts')]")).click();
		Thread.sleep(4000);
		
		//Click on Web Table
		driver.findElement(By.xpath("//section[contains(.,'Web Table')]")).click();
		Thread.sleep(2000);
		
		//Click on Dynamic Table
		driver.findElement(By.xpath("//a[contains(.,'Dynamic Web Table')]")).click();
		Thread.sleep(2000);
		
		//Dynamically
		String levisprice=driver.findElement(By.xpath("//th[.=\'Levi's Shirt\"]/../td@class='px-6 py-4 font-bold text-black']")).getText();
		Thread.sleep(2000);
		System.out.println(levisprice);
		
		//Get the price of the SamSung Galaxy
		String priceofSamsungGalaxy=driver.findElement(By.xpath("(//th[.='Samsung Galaxy']/..//td[@class='px-6 py-4 font-bold text-black']")).getText();
		Thread.sleep(2000);
				
		System.out.println(priceofSamsungGalaxy);
		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();
	}
	
}

