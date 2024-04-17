package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

		System.out.println("Total number of links:" + allLinks.size());
		Thread.sleep(2000);
		for (WebElement link : allLinks) {
			System.out.println(link.getText());

		}

	}
}
