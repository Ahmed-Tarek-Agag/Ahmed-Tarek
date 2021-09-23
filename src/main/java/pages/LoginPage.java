package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(linkText="Log In")
	WebElement LoginButton;
	
	@FindBy(linkText = "English (UK)")
	WebElement ChangeLanguage;
	
	@FindBy (linkText = "Create New Account")
	WebElement CreateNewAccountButton;
	
	@FindBy (id="email")
	WebElement EmailField;
	
	@FindBy (id="pass")
	WebElement PasswordField;
	
	@FindBy (id="loginbutton")
	WebElement LoginBtn;

	
	
	
	public void openLoginPage() {
		clickButton(LoginButton);
		clickButton(ChangeLanguage);
		clickButton(CreateNewAccountButton);
	}
	
	public void openLoginPageAgain() {
		clickButton(LoginButton);
	}
	
	public void userCanLogin(String email , String password) {
		setText(EmailField, email);
		setText(PasswordField, password);
		clickButton(LoginBtn);
	}

	
	
	
	
	
}
