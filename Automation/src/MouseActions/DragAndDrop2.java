package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);

		Actions mouse = new Actions(driver);
		List<WebElement> allCapitals = driver.findElements(By.xpath("//div[@id='dropContent']/div[contains(@id,'box')]"));

		List<WebElement> allCountries = driver.findElements(By.xpath("//div[@id='countries']/div"));

		for (int i = 0; i < allCapitals.size(); i++) {
			for (int j = 0; j < allCountries.size(); j++) {
				mouse.dragAndDrop(allCapitals.get(i), allCountries.get(j)).perform();
				Thread.sleep(2000);
				
				String color = allCapitals.get(i).getCssValue("background-color");
				System.out.println(color);
				if (color.equals("rgb(0, 255, 0)")){
					
					break;
				}
			}
		}
	}
}
