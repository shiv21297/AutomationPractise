package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyTextTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//Click on UI Testing Concepts
		driver.findElement(By.xpath("//p[.='Experience the seamless interactions and responsive designs']")).click();
	    Thread.sleep(2000);
	    
	    //Click on CheckBox
	    driver.findElement(By.xpath("//section[.='Check Box']")).click();
	    
	    driver.findElement(By.xpath("//th[.=\"Levi's Shirt\"]/..//td[@class='px-6 py-4 font-bold text-black']")).click();
	    driver.quit();
	   }
	}


