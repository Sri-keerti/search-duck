package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class search {
	
	WebDriver driver;
	SearchPage search = new SearchPage(driver);
	//SearchPage search;
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/srilakshmikeerti/Desktop/geckodriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.navigate().to("https://www.google.com");
	    
	}

	
	@When("User enters {string} in search text box")
	public void user_enters_in_search_text_box(String string) {
		
		String searchWord = "duck";
		search.enterSearchText(searchWord);
	}
	

	@When("click search")
	public void click_search() {
		search.clickSearch();
	}

	@Then("User can view results page")
	public void user_can_view_results_page() {
		
		search.resultDisplayWordPresent();
		Assert.assertTrue(search.resultDisplayWordPresent());
		
		driver.close();
		driver.quit();
	}
	   
	}
	
	


