package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.GearPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC003_ClothingItemFromTheGearSectionAndAddThemToTheCartTest extends BaseClass {

	@Test
	public void validate_that_the_item_has_successfully_been_added_to_the_cart() throws InterruptedException {

		logger.info("+++++ Starting TC003_ClothingItemFromTheGearSectionAndAddThemToTheCartTest +++++");

		HomePage hp = new HomePage(driver);
		hp.clickGear();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)", "");
		
		Thread.sleep(5000);	
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Fusion Backpack']"));
		Actions act = new Actions(driver);
		act.moveToElement(img).perform();
		
		GearPage gp = new GearPage(driver);
		gp.clickAddToCart();

		Assert.assertEquals(gp.getMsgAddSuccessCart(), "You added Fusion Backpack to your shopping cart.");
		
		logger.info("+++++ Finished TC003_ClothingItemFromTheGearSectionAndAddThemToTheCartTest +++++");
	}

}
