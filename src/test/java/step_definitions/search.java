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
	
	public WebDriver driver;
	public SearchPage sp; 
	
	
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/srilakshmikeerti/Desktop/chromedriver-2");
		driver = new ChromeDriver();
		sp=new SearchPage(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}

	
	@When("User enters {string} in search text box")
	public void user_enters_in_search_text_box(String searchWord) {
		sp.enterSearchText(searchWord);
	}
	

	@When("click search")
	public void click_search() {
		sp.clickSearch();
	}

	@Then("User can view results page")
	public void user_can_view_results_page() {
		
		sp.resultDisplayWordPresent();
		Assert.assertTrue(sp.resultDisplayWordPresent());
		
		driver.close();
		driver.quit();
	}
	   
	}
	
	


