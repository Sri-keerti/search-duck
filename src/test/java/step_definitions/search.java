package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class search {
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.gecko.driver", "/Users/srilakshmikeerti/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.navigate().to("https://www.google.com");
	    
	}

	
	@When("User enters {string} in search text box")
	public void user_enters_in_search_text_box(String string) {
		
		String searchWord = "duck";
		searchPage search = new searchPage(driver);
		search.enterSearchText(searchWord);
	}
	

	@When("click search")
	public void click_search() {
		SearchPage search = new searchPage(driver);
		search.clickSearch();
	}

	@Then("User can view results page")
	public void user_can_view_results_page() {
		
		SearchPage search = new searchPage(driver);
		search.resultDisplayWordPresent();
		Assert.assertTrue(search.resultDisplayWordPresent(), "Results are displyed");
		
		driver.close();
		driver.quit();
	}
	   
	}
	
	

}
