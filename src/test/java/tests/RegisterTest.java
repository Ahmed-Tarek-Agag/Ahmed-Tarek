package tests;


import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends TestBase {

	LoginPage loginObject;
	RegisterPage registerObject;
	Faker fakeData = new Faker();
	String firstName = fakeData.name().firstName();
	String lastName = fakeData.name().lastName();
	String email = fakeData.internet().emailAddress();
	@SuppressWarnings("static-access")
	String emailConfirmation = fakeData.internet().safeEmailAddress(email).valueOf(email);
	String password = fakeData.number().digits(8).toString();
	int dayBirthday = fakeData.number().randomDigitNotZero();
	Faker monthBirthday = Faker.instance();
	Faker yearBirthday = Faker.instance();
	String genderValue = fakeData.toString();
			

	@Test
	public void FillinRegistrationForm () {
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage();
		registerObject = new RegisterPage(driver);
		registerObject.userRegisration(firstName,lastName,email,emailConfirmation,password,dayBirthday,monthBirthday,yearBirthday,genderValue);
	}
	
	@Test
	public void UserCanLoginFacebookWithValidData() {
		loginObject = new LoginPage(driver);
		loginObject.openLoginPageAgain();
		loginObject.userCanLogin("yasen.tarek1122@gmail.com" , "P@ssw0rd");
	}
	
	@Test()
	public void UserCanLoginFacebookWithInvalidData() {
		loginObject = new LoginPage(driver);
		loginObject.openLoginPageAgain();
		loginObject.userCanLogin("yasen.tarek1122@gmail.com" , "password");
	}
	
	

}
