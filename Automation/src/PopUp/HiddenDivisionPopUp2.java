package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Modal");
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
//		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[.='Cancel']")).click();
		Thread.sleep(2000);

		// org.openqa.selenium.ElementClickInterceptedException (when u click on element
		// "FileUpload'
		// org.openqa.selenium.ElementNotInteractableException (when u click on search
		// TextField)
	}
}
