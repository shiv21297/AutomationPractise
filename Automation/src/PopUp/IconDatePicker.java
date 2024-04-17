package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IconDatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[.='Date & Time Picker']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='Date Picker']")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Icon Trigger")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys("21/02/1997");
		Thread.sleep(2000);

	}
}
