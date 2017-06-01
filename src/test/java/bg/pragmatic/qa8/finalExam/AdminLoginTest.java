package bg.pragmatic.qa8.finalExam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.qa8.finalExam.objects.AdminLogin;
import bg.pragmatic.qa8.finalExam.utils.Browser;

public class AdminLoginTest {
	
	@Before
	
	public void setUp () {
		Browser.browserInit();
		AdminLogin.goTo();
	}
	
	@After
	public void after () {
		Browser.shutDown();
	}
	
	@Test
	public void successfulLogin() throws Throwable {
	
		AdminLogin.logIn("admin", "parola");	
		
		Thread.sleep(5000);
	}
	
}