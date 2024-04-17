package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	@FindBy(id = "small-searchterms")
	private WebElement searchfield;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}
	
	
}
