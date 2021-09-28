package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver=null;
	private static WebDriverWait wait ;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@title='Search']")
	WebElement searchbox;
	String searchresults="//h3[@class='LC20lb DKV0Md']";
	
	public void openUrl(String url) {
		System.out.println("openurl");
		driver.navigate().to(url);
	}

	public void enterValuetoSearch(String searchkey) {
		System.out.println("Inside user enters text for search");
		searchbox.sendKeys(searchkey);
	}

	public void pressEnterforSearch() throws InterruptedException {
		System.out.println("User clicks on search");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public void navigateTosearchResults() {
		System.out.println("User is able to see search results");
		List<WebElement> searchresult=driver.findElements(By.xpath(searchresults));
		int count =searchresult.size();
		System.out.println("total elements searched"+ count);
	}

}
