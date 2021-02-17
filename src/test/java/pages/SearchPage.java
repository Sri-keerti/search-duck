package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	WebDriver driver;
	By searchBox=By.name("q");
	By resultsDisplayWord=By.id("result-stats");
	

	public SearchPage(WebDriver driver) {
		this.driver=driver;
		
	}
	

	public void enterSearchText(String searchWord) {	
		driver.findElement(searchBox).sendKeys(searchWord);	
	}
	
	public void clickSearch() {
		driver.findElement(searchBox).submit();
	}
	
	public boolean resultDisplayWordPresent() {
		boolean present = ((WebElement) resultsDisplayWord).isDisplayed();
		return present;
	}
	
	
	

}
