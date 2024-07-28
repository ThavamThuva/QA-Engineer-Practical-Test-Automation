package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GearPage extends BasePage{
	
	WebDriver driver;
	
	public GearPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt='Fusion Backpack']")
	WebElement itemImage;
	
	@FindBy(xpath="(//span[normalize-space()='Add to Cart'])[1]")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement msgAddSuccessCart;
	
	public void scrollPage() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView();", itemImage);
	}
	
	public void hoverItemImage() {
		Actions act = new Actions(driver);
		act.moveToElement(itemImage).perform();
	}
	
	public void clickAddToCart() {
		btnAddToCart.click();
	}
	
	public String getMsgAddSuccessCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(msgAddSuccessCart));
		return msgAddSuccessCart.getText();
	}

}
