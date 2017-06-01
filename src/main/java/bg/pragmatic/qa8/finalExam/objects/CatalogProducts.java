package bg.pragmatic.qa8.finalExam.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import bg.pragmatic.qa8.finalExam.utils.Browser;

public class CatalogProducts {
	
	public static void GoToProducts() {
		
		Browser.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement catalog = Browser.driver.findElement(By.id("catalog"));
		WebElement products = Browser.driver.findElement(By.xpath("//a[contains(@href,'product')]"));
		catalog.click();
		products.click();
	}
	
	public static void FindResults (String ProductName) {
		
		WebElement productNameSearch = Browser.driver.findElement(By.name("filter_name"));
		productNameSearch.sendKeys(ProductName);
		WebElement filterButton = Browser.driver.findElement(By.linkText("Filter"));
		filterButton.click();
	}
	
	public static void InsertProduct (String ProductName) {
		
		WebElement insertButton = Browser.driver.findElement(By.xpath("//a[contains(@href,'insert')]"));
		insertButton.click();
		WebElement productDescription = Browser.driver.findElement(By.name("product_description[1][name]"));
		productDescription.sendKeys(ProductName);
		WebElement data = Browser.driver.findElement(By.xpath("//a[@href='#tab-data']"));
		data.click();
		WebElement model = Browser.driver.findElement(By.name("model"));
		model.sendKeys("CellPhone");
		WebElement Save = Browser.driver.findElement(By.linkText("Save"));
		Save.click();
		Assert.assertTrue(Browser.driver.findElement(By.className("success")).isDisplayed());
	}
	
		
}
