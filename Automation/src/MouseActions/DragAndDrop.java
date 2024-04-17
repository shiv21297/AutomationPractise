package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
    	//Launch Browser
		WebDriver driver=new ChromeDriver();
		//Maximize Browser
		driver.manage().window().maximize();
		//Navigate to URL
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		Thread.sleep(4000);
		
		//DragnDrop OsloInNorway
		WebElement oslo=driver.findElement(By.id("box1"));
		WebElement norway=driver.findElement(By.id("box101"));
		Actions mouse1=new Actions(driver);
		mouse1.dragAndDrop(oslo,norway).perform();
		Thread.sleep(2000);
	
		//DragnDrop StockholmInSweden
		WebElement stockholm=driver.findElement(By.id("box2"));
		WebElement sweden=driver.findElement(By.id("box102"));
		Actions mouse2=new Actions(driver);
		mouse2.dragAndDrop(stockholm,sweden).perform();
		Thread.sleep(2000);
		
		//DragnDrop WashingtonInUnitedStates
		WebElement washington=driver.findElement(By.id("box3"));
		WebElement unitedstates=driver.findElement(By.id("box103"));
		Actions mouse3=new Actions(driver);
		mouse3.dragAndDrop(washington,unitedstates).perform();
		Thread.sleep(2000);
		
		//DragnDrop CopenhagenInDenmark
		WebElement copenhagen=driver.findElement(By.id("box4"));
		WebElement denmark=driver.findElement(By.id("box104"));
		Actions mouse4=new Actions(driver);
		mouse4.dragAndDrop(copenhagen,denmark).perform();
		Thread.sleep(2000);

		
		//DragnDrop SeoulInSouthkorea
		WebElement seoul=driver.findElement(By.id("box5"));
		WebElement southkorea=driver.findElement(By.id("box105"));
		Actions mouse5=new Actions(driver);
		mouse5.dragAndDrop(seoul,southkorea).perform();
		Thread.sleep(2000);
		
		//DragnDrop RomeInItaly
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		Actions mouse6=new Actions(driver);
		mouse6.dragAndDrop(rome, italy).perform();
		Thread.sleep(2000);
		
		//DragnDrop MadridInSpain
		WebElement madrid=driver.findElement(By.id("box7"));
		WebElement spain=driver.findElement(By.id("box107"));
		Actions mouse7=new Actions(driver);
		mouse7.dragAndDrop(madrid,spain).perform();
		Thread.sleep(2000);
				
		driver.quit();
		
		}
    
}

