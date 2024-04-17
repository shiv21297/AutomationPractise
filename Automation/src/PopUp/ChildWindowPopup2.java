package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowPopup2 {

	public static void main(String[] args) throws InterruptedException {
		// LaunchChrome browser
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://shoppersstack.com");
		Thread.sleep(25000);

		// wait.until(ExpectedConditions.alertIsPresent());
		// driver.switchTo().alert().accept();

		WebElement men = driver.findElement(By.id("men"));

		Actions mouse = new Actions(driver);

		mouse.moveToElement(men).perform();
		Thread.sleep(6000);

//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='T-shirts']")));
		driver.findElement(By.xpath("//a[.='T-shirts']")).click();
		Thread.sleep(3000);

		mouse.moveToElement(driver.findElement(By.cssSelector("[aria-current='page']"))).perform();

		driver.findElement(By.cssSelector("[alt='Levis Mens Regular Fit Tee']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("compare")).click();

		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		System.out.println();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Total number of windows : " + allWindows.size());

//		//Switch window by title
//		for(String window:allWindows) {
//			driver.switchTo().window(window);
//					String title=driver.getTitle();
//					
//					if(title.contains("site in India:")) {
//						break;
//					}
//		}

		for (String window : allWindows) {
			driver.switchTo().window(window);
			String title = driver.getTitle();

			if (title.contains("ShoppersStack")) {
				continue;
			} else {
				driver.close();
				Thread.sleep(1000);

			}
		}
	}
}
