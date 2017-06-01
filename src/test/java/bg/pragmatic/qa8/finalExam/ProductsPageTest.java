package bg.pragmatic.qa8.finalExam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.qa8.finalExam.objects.AdminLogin;
import bg.pragmatic.qa8.finalExam.objects.CatalogProducts;
import bg.pragmatic.qa8.finalExam.utils.Browser;

public class ProductsPageTest {
	
	@Before
	
	public void setUp () {
		Browser.browserInit();
		AdminLogin.goTo();
		AdminLogin.logIn("admin", "parola");
	}
	
	@After
	public void after () {
		Browser.shutDown();
	}
	
	@Test
	
	public void ProductPageTest () throws Throwable {
		CatalogProducts.GoToProducts();
		CatalogProducts.FindResults("LG G5");
		CatalogProducts.InsertProduct("LG G5");
		Thread.sleep(5000);
			
	}
	
}