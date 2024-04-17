package WebElementmethods14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) throws InterruptedException {
		 
		  //Launch browser
		WebDriver driver=new ChromeDriver();
		  
		  //Maximize
		  driver.manage().window().maximize();
		  
		  //Navigate
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  Thread.sleep(3000);
		  
		  String Text=driver.findElement(By.xpath("//a[@class='launchAskDisha']")).getText();
		  System.out.println(Text);
		  
		  String color=driver.findElement(By.xpath("//a[@class='launchAskDisha']")).getCssValue("color");
		  System.out.println(color);
		  
		  Thread.sleep(2000);
		  driver.quit();
		  }
	}
