package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollToTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollTo(0,1000)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollTo(0,2000)");
//		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}
}
