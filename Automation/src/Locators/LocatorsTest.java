package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[]args) throws Exception {
   	 // LaunchMozillabrowser
	 WebDriver driver=new ChromeDriver();
   	 
   	 //Maximize FirefoxBrowser
   	 driver.manage().window().maximize();
   	 
   	 //Launch Demo web shop
   	 driver.get("https://demowebshop.tricentis.com");
   	 driver.findElement(By.className("ico-register")).click();
   	 Thread.sleep(1000);
   	 
   	 //click gender is Male
   	 driver.findElement(By.id("gender-male")).click();
   	 Thread.sleep(1000);
   	 
   	 //Enter the First Name
   	 driver.findElement(By.id("FirstName")).sendKeys("Shiva");
   	 Thread.sleep(1000);
   	 
   	 //Enter the LastName
   	 driver.findElement(By.id("LastName")).sendKeys("S");
   	 Thread.sleep(1000);
   	 
   	 //Enter MailId
   	 driver.findElement(By.id("Email")).sendKeys("shivashiv2102@gmail.com");
   	 Thread.sleep(1000);
   	 
   	 //Enter the Password
   	 driver.findElement(By.id("Password")).sendKeys("Shiva@123");
   	 Thread.sleep(1000);
   	 
   	 //Confirm Password
   	 driver.findElement(By.id("ConfirmPassword")).sendKeys("Shiva@123");
   	 Thread.sleep(1000);
   	 
   	 //click on register button
   	 driver.findElement(By.id("register-button")).click();
   	 Thread.sleep(1000);
   	 
   	 //close the browser
   	 driver.quit();
    }
}	
