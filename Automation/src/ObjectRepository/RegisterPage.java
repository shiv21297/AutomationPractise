package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGenderButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstnameTextField;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement emailID;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getMaleGenderButton() {
		return maleGenderButton;
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
}
