package pages;

public class SearchPage {
	
	WebDriver driver;
	By searchBox=By.name("q");
	By resultsDisplayWord=By.id("result-stats");
	
	
	public searchPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void enterSearchText(String searchWord) {	
		driver.findElement(searchBox).sendKeys(searchWord);	
	}
	
	public void clickSearch() {
		driver.findElement(searchBox).submit();
	}
	
	public boolean resultDisplayWordPresent() {
		boolean present = resultsDisplayWord.isDisplayed();
		return present;
	}
	
	
	

}
