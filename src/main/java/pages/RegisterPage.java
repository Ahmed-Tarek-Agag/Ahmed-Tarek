package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class RegisterPage extends PageBase {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name= "firstname")
	WebElement FirstName;

	@FindBy(name= "lastname")
	WebElement LastName;

	@FindBy(name= "reg_email__")
	WebElement Email;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement EmailConfirmation;

	@FindBy(id="password_step_input")
	WebElement Password;

	@FindBy (id="day")
	WebElement DayBirthday;

	@FindBy (id="month")
	WebElement MonthBirthday;

	@FindBy (id="year")
	WebElement YearBirthday;
	
	@FindBy (name="sex")
	WebElement Gender;


	@FindBy(name="websubmit")
	WebElement SubmitButton;
	
	

	public void userRegisration(String firstName , String lastName , String email , String emailConfirmation , String password , int dayBirthday , Faker monthBirthday , Faker yearBirthday, String value) {
		setText(FirstName,firstName);
		setText(LastName, lastName);
		setText(Email, email);
		setText(EmailConfirmation, emailConfirmation);
		setText(Password,password);
		
		select = new Select(DayBirthday);
		select.selectByIndex(dayBirthday);
		select = new Select(MonthBirthday);
		select.selectByIndex(5);
		select = new Select(YearBirthday);
		select.selectByIndex(30);
		
		clickButton(Gender);
		clickButton(SubmitButton);
	}

	
}
