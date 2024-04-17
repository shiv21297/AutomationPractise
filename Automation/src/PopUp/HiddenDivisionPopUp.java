package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Shiva S");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shivashiv2102@gmail.com");
	//	driver.findElement(By.xpath("//label[.='Email']/../..//input")).sendKeys("shivashiv2102@gmail.com");
		Thread.sleep(2000);
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		
		Select selectproduct=new Select(Dropdown);
      	
      	selectproduct.selectByIndex(1);
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("Hi there");
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
      	Thread.sleep(2000);
      	
	}
}