package Screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

	public class ScreenshotTest {

	  public static void main(String[] args) throws InterruptedException, IOException {
	    //launch browser
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //navigate to URL
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    //Step:1 convert WebDriver reference to TakeScreenoshot
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    
	    //step:2 call getstringAs() to take WebPage screenshot
	    File temp=ts.getScreenshotAs(OutputType.FILE);
	    
	    //step 3: create a Permanent file location
	    File permanent=new File("./screenshot/"+ getTime() +"photo.png");
	    
	    //copy the screenshot from Temp to Permanent
	    FileHandler.copy(temp, permanent);
	    driver.quit();
	  }
	  public static String getTime() {
	    return LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
	    
	  }
	}
