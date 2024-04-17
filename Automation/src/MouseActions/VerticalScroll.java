package MouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerticalScroll {

	public static void main(String[] args) throws InterruptedException {
		 //Launch Browser
		WebDriver driver=new ChromeDriver();;
   	 //Maximize
   	 driver.manage().window().maximize();
   	 driver.get("https://www.selenium.dev/");
   	 Thread.sleep(2000);
   	 
   	 //VerticalScrollTest
   	 Actions mouse=new Actions(driver);
   	 mouse.scrollByAmount(0, 2752).perform();
   	 Thread.sleep(2000);
   	 mouse.scrollByAmount(0, -2752).perform();
   	 Thread.sleep(2000);
   	 driver.quit();
	}
}

