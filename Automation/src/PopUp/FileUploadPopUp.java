package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
		Thread.sleep(2000);

		File file = new File("‪C:\\Users\\hp\\OneDrive\\Desktop\\Cover letter.pdf");
		String path = file.getAbsolutePath();
		driver.findElement(By.id("fileInput")).sendKeys("‪C:\\Users\\hp\\OneDrive\\Desktop\\Cover letter.pdf");

	}
}
