package WebElementmethods14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		 // LaunchMozillabrowser
		 WebDriver driver=new ChromeDriver();
	   	 //Maximize FirefoxBrowser
	   	 driver.manage().window().maximize();
	   	 
	   	 //Navigate to URL 
	   	 driver.get("https://demoapps.qspiders.com/");
	   	 Thread.sleep(2000);
	   	 
	   	 //Click on UI Testing Concepts
	   	 driver.findElement(By.xpath("//p[.='Experience the seamless interactions and responsive designs']")).click();
	     Thread.sleep(3000);
	     
	     //Click on CheckBox
	     driver.findElement(By.xpath("//section[.='Check Box']")).click();
	     Thread.sleep(2000);
	     
	     //Verify Email CheckBox is enabled or disabled
	     WebElement emailCheckbox=driver.findElement(By.id("domain1"));
	      
	     System.out.println(emailCheckbox.isEnabled());
	     
	     //Click on Disabled
	     driver.findElement(By.linkText("Disabled")).click();
	     Thread.sleep(2000);
	     emailCheckbox=driver.findElement(By.id("domain1"));
	     
	     System.out.println(emailCheckbox.isEnabled());
	     
	     driver.quit();
	     
	     }

	}

