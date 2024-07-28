package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends BasePage{
	
	WebDriver driver;
	
	public WomenPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Tops')]")
	WebElement btnTops;
	
	@FindBy(xpath="//div[normalize-space()='Category']")
	WebElement btnCategory;
	
	@FindBy(xpath="//a[contains(text(),'Jackets')]")
	WebElement btnSelectCategory;
	
	@FindBy(xpath="//span[@class='filter-value'][normalize-space()='Jackets']")
	WebElement msgSelectCategory;
	
	@FindBy(xpath="//span[@class='base']")
	WebElement titleTopsPage;
	
	@FindBy(xpath="//div[normalize-space()='Color']")
	WebElement btnColor;
	
	@FindBy(xpath="//a[@aria-label='Black']//div[@class='swatch-option color ']")
	WebElement selectColor;
	
	@FindBy(xpath="//span[normalize-space()='Black']")
	WebElement msgFilterColor;
	
	public void clickTop() {
		btnTops.click();
	}
	
	public void clickCategory() {
		btnCategory.click();
	}
	
	public void clickSelectCategory() {
		btnSelectCategory.click();
	}
	
	public String getMsgSelectCategory() {
		return msgSelectCategory.getText();
	}
	
	public void clickColor() {
		btnColor.click();
	}
	
	public void clickSelectColor() {
		selectColor.click();
	}
	
	public String getMsgFilterColor() {
		return msgFilterColor.getText();
	}
	

}
