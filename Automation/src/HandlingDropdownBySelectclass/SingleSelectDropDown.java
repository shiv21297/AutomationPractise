package HandlingDropdownBySelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
  
    	//Maximize
    	driver.manage().window().maximize();
    	
    	//Navigate to URL
    	driver.get("https://demoapps.qspiders.com/");
    	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
    	Thread.sleep(2000);
    	WebElement countryDropdown=driver.findElement(By.id("select3"));
    	
        Select selectCountry=new Select(countryDropdown);
    	System.out.println(selectCountry.isMultiple());
    	
    	selectCountry.selectByIndex(7);
    	Thread.sleep(2000);
    	
    	WebElement stateDropdown=driver.findElement(By.id("select5"));
    	Select selectState=new Select(stateDropdown);
    	selectState.selectByValue("Goa");
        Thread.sleep(2000);
        
        WebElement cityDropdown=driver.findElement(By.id("City"));
    	Select selectCity=new Select(cityDropdown);
    	selectCity.selectByVisibleText("South Goa");
    
        driver.quit();
        
    	}
}

