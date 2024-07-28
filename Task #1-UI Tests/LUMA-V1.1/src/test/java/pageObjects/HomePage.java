package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@title='Search']")
	WebElement searchIcon;
	
	@FindBy(xpath="//a[@class=\"product-item-link\"]")
	List<WebElement> productTitles;
	
	@FindBy(xpath="//span[normalize-space()='Women']")
	WebElement btnWomen;
	
	@FindBy(xpath="//span[normalize-space()='Gear']")
	WebElement btnGear;
	
	public void sendTextSearchBox(String txt) {
		searchBox.sendKeys(txt);
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public List<WebElement> getSearchResultTitles() {
		return productTitles;
	}
	
	
	public void clickWomen() {
		btnWomen.click();
	}
	
	public void clickGear() {
		btnGear.click();
	}

}
