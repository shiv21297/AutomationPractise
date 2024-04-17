package HandlingDropdownBySelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
    	
    	//Maximize the Browser
    	driver.manage().window().maximize();
    	
    	//Navigate to URL
    	driver.get("https://demoapps.qspiders.com/");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
    	Thread.sleep(2000);
    	
    	//Click on MultiSelect
    	driver.findElement(By.linkText("Multi Select")).click();
    	Thread.sleep(2000);
    	
    	WebElement CountryDropdown=driver.findElement(By.id("select-multiple-native"));
    	Select selectcountry=new Select(CountryDropdown);
    	System.out.println(selectcountry.isMultiple());

    	//Select
        selectcountry.selectByValue("United Kingdom");
        Thread.sleep(2000);
        selectcountry.selectByIndex(1);
        Thread.sleep(2000);
        selectcountry.selectByVisibleText("United Arab Emirates");
        Thread.sleep(2000);
        
        //DeSelect
        selectcountry.deselectByValue("United Kingdom");
        Thread.sleep(2000);
        selectcountry.deselectByIndex(1);
        Thread.sleep(2000);
        selectcountry.deselectByVisibleText("United Arab Emirates");
        Thread.sleep(2000);
        
        driver.quit();
        }
}

