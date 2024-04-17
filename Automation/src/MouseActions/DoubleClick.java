package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		// Launch Browser
		WebDriver driver=new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Double Click")).click();
		Thread.sleep(2000);

		// DoubleClick 1
		WebElement DoubleCLick = driver.findElement(By.id("btn20"));
		Actions mouse = new Actions(driver);
		mouse.doubleClick(DoubleCLick).perform();
		Thread.sleep(2000);

		String ActualResult = driver.findElement(By.xpath("//span[.='You selected \"Yes\"']")).getText();
		String ExpectedResult = "You selected \"Yes\"";
		System.out.println("***************Button***************");

		if (ActualResult.equals(ExpectedResult)) {
			System.out.println("ExpectedResult : " + ExpectedResult);
			System.out.println("ActualResult : " + ActualResult);
			System.out.println("Pass");
		} else {
			System.out.println("ExpectedResult : " + ExpectedResult);
			System.out.println("ActualResult : " + ActualResult);
			System.out.println("Fail");
		}

		//DoubleClick 2
		WebElement DoubleCLick2 = driver.findElement(By.id("btn22"));
        Actions mouse1 = new Actions(driver);
		mouse1.doubleClick(DoubleCLick2).perform();
		Thread.sleep(2000);

		String ActualResult2 = driver.findElement(By.xpath("//span[.='You selected \"Yes\"']")).getText();
		String ExpectedResult2 = "You selected \"Yes\"";
		System.out.println("***************Button***************");

			if (ActualResult.equals(ExpectedResult)) {
				System.out.println("ExpectedResult : " + ExpectedResult);
				System.out.println("ActualResult : " + ActualResult);
				System.out.println("Pass");
			} else {
				System.out.println("ExpectedResult : " + ExpectedResult);
				System.out.println("ActualResult : " + ActualResult);
				System.out.println("Fail");
			}
			
		//DoubleClick 3
		WebElement DoubleCLick3 = driver.findElement(By.id("btn24"));
		Actions mouse2 = new Actions(driver);
		mouse2.doubleClick(DoubleCLick3).perform();
		Thread.sleep(2000);	
		
		String ActualResult3 = driver.findElement(By.xpath("//span[.='You selected \"1\"']")).getText();
		String ExpectedResult3 = "You selected \"1\"";
		System.out.println("***********Button***********");
		
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("ExpectedResult : "+ ExpectedResult);
			System.out.println("ActualResult : + ActualResult");
			System.out.println("Pass");
		}else {
			System.out.println("ExpectedResult : "+ ExpectedResult);
			System.out.println("ActualResult : + ActualResult");
			System.out.println("Fail");
		  }
		driver.quit();
	}

}
