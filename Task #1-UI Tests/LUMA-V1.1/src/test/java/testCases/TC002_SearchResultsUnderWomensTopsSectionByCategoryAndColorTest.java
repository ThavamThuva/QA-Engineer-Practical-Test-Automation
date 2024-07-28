package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.WomenPage;
import testBase.BaseClass;

public class TC002_SearchResultsUnderWomensTopsSectionByCategoryAndColorTest extends BaseClass{
	
	@Test
	public void validate_that_the_results_returned_matches_the_filter_criteria() {
		
		logger.info("+++++ Starting TC002_SearchResultsUnderWomensTopsSectionByCategoryAndColorTest +++++");
		
		HomePage hp = new HomePage(driver);
		hp.clickWomen();
		
		//Click on “Tops” under Women category
		WomenPage wp = new WomenPage(driver);
		wp.clickTop();
		wp.clickCategory();
		wp.clickSelectCategory();
		wp.clickColor();
		wp.clickSelectColor();
		
		Assert.assertEquals(wp.getMsgSelectCategory(), "Jackets");
		Assert.assertEquals(wp.getMsgFilterColor(), "Black");
		
		
		logger.info("+++++ Finished TC002_SearchResultsUnderWomensTopsSectionByCategoryAndColorTest +++++");
	}
}
