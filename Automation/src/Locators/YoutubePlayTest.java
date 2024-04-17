package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePlayTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search_tf= driver.findElement(By.xpath("//textarea[@name='q']"));
		search_tf.sendKeys("satranga song");
		search_tf.sendKeys(Keys.ENTER);
       }
}