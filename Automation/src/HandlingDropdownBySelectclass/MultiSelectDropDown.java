package HandlingDropdownBySelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
  	    //Maximize
      	driver.manage().window().maximize();
      	
      	//Navigate to URL
      	driver.get("https://demoapps.qspiders.com/");
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.linkText("Multi Select")).click();
      	Thread.sleep(2000);
      	
      	WebElement countryDropdown=driver.findElement(By.id("select-multiple-native"));
      	Select selectcountry=new Select(countryDropdown);
      	System.out.println(selectcountry.isMultiple());
      	
      	selectcountry.selectByValue("Canada");
      	Thread.sleep(2000);
      	selectcountry.selectByIndex(5);
      	Thread.sleep(2000);
      	selectcountry.selectByVisibleText("India");
      	driver.quit();
      	}
}      
      	
