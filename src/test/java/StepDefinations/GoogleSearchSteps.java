package StepDefinations;

import org.openqa.selenium.WebDriver;

import Common.SetBrowser;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class GoogleSearchSteps extends SetBrowser{

	private static WebDriver driver = null;
	private String basepath=System.getProperty("user.dir");
	private String url="https://www.google.com/";
	private LoginPage loginpage;
	public Scenario scenario;

	@Before("@SmokeTest")
	public void beforeScenario(Scenario scenario) {
		this.scenario = scenario;
		this.driver=SetBrowser.setupBrowserforTest();
		loginpage= new LoginPage(driver);
	}

	@After("@SmokeTest")
	public void afterScenario(Scenario scenario) throws InterruptedException{
		this.scenario = scenario;
		driver.quit();
	}

	@Given("^this will execute before each scenario as this is a common case that run before each scenario$")
	public void backgroundCase() {
		System.out.println("common to all");
	}

	@Given("user if on google page")
	public void user_if_on_google_page() {
		System.out.println("Inside step google search page");
		loginpage.openUrl(url);		
	}

	@When("user enters text for search")
	public void user_enters_text_for_search() {
		System.out.println("Inside user enters text for search");
		loginpage.enterValuetoSearch("cars");;
	}

	@When("user press enter button")
	public void user_press_search_button() throws InterruptedException {
		System.out.println("User clicks on search");
		loginpage.pressEnterforSearch();
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		loginpage.navigateTosearchResults();
	}

}
