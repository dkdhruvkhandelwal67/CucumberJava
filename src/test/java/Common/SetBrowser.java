package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowser {

	static WebDriver driver = null;
	static String basepath=System.getProperty("user.dir");

	public static WebDriver setupBrowserforTest() {
		System.out.println("Inside step browser start");

		System.setProperty("webdriver.chrome.driver",basepath+"/Library/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
}
