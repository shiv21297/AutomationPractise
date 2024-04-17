package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActionOnWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[.='Keyboard Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Keyboard']")).click();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.id("email"));
		Actions keyboard=new Actions(driver);
		keyboard.keyUp(email,Keys.SHIFT).sendKeys("shivashiv2102@gmail.com").perform();
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password"));
		Actions keyboard2=new Actions(driver);
		keyboard2.keyUp(password,Keys.SHIFT).sendKeys("Shiv@1997").perform();
		Thread.sleep(2000);
		WebElement confirmpassword=driver.findElement(By.id("confirmPassword"));
		Actions keyboard3=new Actions(driver);
		keyboard3.keyUp(confirmpassword,Keys.SHIFT).sendKeys("Shiv@1997").perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Press Enter to Submit']")).submit();
		driver.quit();
	  }
	 
}

