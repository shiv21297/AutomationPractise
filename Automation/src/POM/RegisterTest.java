package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

public class RegisterTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomePage= new WelcomePage(driver);
		welcomePage.getRegisterlink().click();
		
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.getMaleGenderButton().click();
		registerPage.getFirstnameTextField().sendKeys("shiva");
		registerPage.getLastNameTextField().sendKeys("shiv");
		registerPage.getEmailID().sendKeys("shivashiv2102@gmail.com");
		registerPage.getPassword().sendKeys("Shiv@123");
		registerPage.getConfirmpassword().sendKeys("Shiv@123");
		registerPage.getRegisterbutton().click();
		
		
	}
}
