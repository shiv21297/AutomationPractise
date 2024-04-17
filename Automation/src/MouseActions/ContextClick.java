package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(2000);
		
		//RightClick 1
		WebElement RightClick=driver.findElement(By.id("btn30"));
		Actions action=new Actions(driver);
		action.contextClick(RightClick).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Yes']")).click();
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
			
		//RightClick 2
		WebElement RightClick2=driver.findElement(By.id("btn31"));
		Actions action1=new Actions(driver);
		action1.contextClick(RightClick2).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		Thread.sleep(2000);
		
		String ActualResult1 = driver.findElement(By.xpath("//span[.='You selected \"Yes\"']")).getText();
		String ExpectedResult1 = "You selected \"Yes\"";
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
		
		//RightClick 2	
		WebElement RightClick3=driver.findElement(By.id("btn32"));
		Actions action2=new Actions(driver);
		action2.contextClick(RightClick3).perform();
		Thread.sleep(2000);	
		
		String ActualResult2 = driver.findElement(By.xpath("//div[.='1']")).getText();
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
		driver.quit();
	}
}

