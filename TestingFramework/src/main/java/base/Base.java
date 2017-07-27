package base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;

	@Before
	public void setupApplication() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
	}

	@After
	public void closeApplication() {
		driver.quit();

	}
}
