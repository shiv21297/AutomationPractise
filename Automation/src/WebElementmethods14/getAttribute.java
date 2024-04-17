package WebElementmethods14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		WebDriver driver = new ChromeDriver();

		// Maximize Window
		driver.manage().window().maximize();

		// Navigate To URL
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);

		// Get Placeholder
		String placeholder = driver.findElement(By.id("name")).getAttribute("placeholder");
		System.out.println(placeholder);

		if (placeholder.equals("Enter your name")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println(placeholder);
		}
		driver.quit();
	}

}
