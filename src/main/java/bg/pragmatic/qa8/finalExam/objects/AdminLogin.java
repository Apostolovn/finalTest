package bg.pragmatic.qa8.finalExam.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import bg.pragmatic.qa8.finalExam.utils.Browser;

public class AdminLogin {
	@FindBy (how = How.NAME, using = "username")
	private static WebElement username;
	
	@FindBy (how = How.NAME, using = "password")
	private static WebElement password;

	private static final String url = "http://shop.pragmatic.bg/admin/";
	
	public static void goTo() {
		Browser.driver.get(url);
		PageFactory.initElements(Browser.driver, AdminLogin.class);
	}

	public static void logIn(String usernameParam, String passwordParam) {
		
	username.sendKeys(usernameParam);
	password.sendKeys(passwordParam);
	Browser.driver.findElement(By.cssSelector("a.button")).click();
	
	}
}