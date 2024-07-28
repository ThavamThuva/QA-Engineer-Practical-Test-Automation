package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_UsersAreAbleToSearchForAnItemUsingTheSearchBarTest extends BaseClass {

	@Test
	public void validate_that_the_results_returned_matches_the_search_term() {
		
		logger.info("+++++ Starting TC001_UsersAreAbleToSearchForAnItemUsingTheSearchBarTest +++++");
		
		HomePage hp = new HomePage(driver);
		String searchText = "Tank";
		hp.sendTextSearchBox(searchText);
		hp.clickSearchIcon();
		List<WebElement> searchResults = hp.getSearchResultTitles();

		for (WebElement result : searchResults) {
			Assert.assertTrue(result.getText().toLowerCase().contains(searchText.toLowerCase()), "The product name '"
					+ result.getText() + "' does not contain the search word '" + searchText + "'");
		}
		
		logger.info("+++++ Finished TC001_UsersAreAbleToSearchForAnItemUsingTheSearchBarTest +++++");

	}

}
