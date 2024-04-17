package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();

		driver.findElement(By.linkText("APPAREL & SHOES")).click();

		WebElement productdropdown = driver.findElement(By.id("products-orderby"));

		Select selectproduct = new Select(productdropdown);
		System.out.println(selectproduct.isMultiple());
		selectproduct.selectByVisibleText("Price: Low to High");

		WebElement productdisplay = driver.findElement(By.id("products-pagesize"));

		Select selectdisplay = new Select(productdisplay);
		selectdisplay.selectByVisibleText("12");

		WebElement productlist = driver.findElement(By.id("products-viewmode"));

		Select selectlist = new Select(productlist);
		selectlist.selectByVisibleText("List");

		driver.findElement(By.xpath("//a[.='Casual Golf Belt']")).click();
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-40']")).click();
	}
}
