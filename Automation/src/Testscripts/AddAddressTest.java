package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAddressTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shiva@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();

		driver.findElement(By.xpath("//a[.='shivashiv2102@gmail.com']")).click();
		driver.findElement(By.xpath("(//a[.='Addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='button']")).click();

		driver.findElement(By.id("Address_FirstName")).sendKeys("Shiva");
		driver.findElement(By.id("Address_LastName")).sendKeys("Shiv");
		driver.findElement(By.id("Address_Email")).sendKeys("shivashiv2102@gmail.com");
		driver.findElement(By.id("Address_Company")).sendKeys("Amazon");

		WebElement CountryDropdown = driver.findElement(By.id("Address_CountryId"));
		Select selectcountry = new Select(CountryDropdown);
		System.out.println(selectcountry.isMultiple());
		selectcountry.selectByVisibleText("India");

//		WebElement StateDropdown = driver.findElement(By.id("Address_StateProvinceId"));
//      Select selectState = new Select(StateDropdown);
//		System.out.println(selectState.isMultiple());
//		selectstate.selectByValue("0");

		driver.findElement(By.id("Address_City")).sendKeys("Chennai");
		driver.findElement(By.id("Address_Address1")).sendKeys("3377,Tnhb");
		driver.findElement(By.id("Address_Address2")).sendKeys("Avadi,chennai");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("600054");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("8248637840");
		driver.findElement(By.id("Address_FaxNumber")).sendKeys("91");
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();

		driver.findElement(By.xpath("//a[.='Log out']")).click();

	}
}
