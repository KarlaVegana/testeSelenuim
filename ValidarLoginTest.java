import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ValidarLoginTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	WebDriver  driver = new FirefoxDriver();
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 driver.get("http://www.bol.uol.com.br");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("user")).sendKeys("karlaviana");
		 driver.findElement(By.id("password")).sendKeys("12345");
	}

}
