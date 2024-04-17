package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductCheckout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();

		driver.findElement(By.linkText("BOOKS")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.id("add-to-cart-button-13")).click();

		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.xpath("//button[@name='checkout']")).click();

		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='Continue'])[2]")).click();
		driver.findElement(By.id("shippingoption_0")).click();
		driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
		driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
		driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();

		driver.findElement(By.xpath("//a[.='Log out']")).click();

	}
}
