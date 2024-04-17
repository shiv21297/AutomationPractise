package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//DemoWebShopTricentis
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	    //Click on SearchButton
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//Accept(Okay)
		driver.switchTo().alert().accept();
	}
}

