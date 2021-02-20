package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver sdriver;
	
	public SearchPage(WebDriver rdriver) {
		sdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	WebDriver driver;
	@FindBy(name="q")
	WebElement searchBox; 
	@FindBy(id = "result-stats")
	WebElement resultsDisplayWord;
	
	public void enterSearchText(String searchWord) {	
	    searchBox.sendKeys(searchWord);
	}
	
	public void clickSearch() {
		searchBox.submit();
	}
	
	public boolean resultDisplayWordPresent() {
		boolean present = resultsDisplayWord.isDisplayed();
		return present;
	}
	
}
