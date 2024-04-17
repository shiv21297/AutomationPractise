package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tab")).click();
		Thread.sleep(2000);
		
		WebElement Men=driver.findElement(By.className("Men"));
		Thread.sleep(2000);
		Actions mouse=new Actions(driver);
		mouse.moveToElement(Men).perform();
		
		driver.findElement(By.className("Men_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("Men_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[.='80% or more'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}


