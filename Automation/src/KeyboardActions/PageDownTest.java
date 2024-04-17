package KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) throws InterruptedException {
		
   	 //LaunchBrowser
		WebDriver driver=new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.get("https://www.selenium.dev/");
   	 Thread.sleep(2000);
   	 
   	 Actions keyboard=new Actions(driver);
   	 
   	 keyboard.keyDown(Keys.ARROW_DOWN).perform();
   	 Thread.sleep(2000);
   	 keyboard.keyDown(Keys.ARROW_DOWN).perform();
   	 Thread.sleep(2000);
   	 keyboard.keyDown(Keys.PAGE_DOWN).perform();
   	 Thread.sleep(2000);

   	 keyboard.keyDown(Keys.ARROW_UP).perform();
   	 Thread.sleep(2000);
   	 keyboard.keyDown(Keys.ARROW_UP).perform();
   	 Thread.sleep(2000);
   	 keyboard.keyDown(Keys.PAGE_UP).perform();
   	 Thread.sleep(2000);

   	 driver.quit();
    }
}

