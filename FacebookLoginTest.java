import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLoginTest {

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
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("karlavianacosta@gmaiil.com");
		 driver.findElement(By.id("pass")).sendKeys("12222");
		 driver.findElement(By.id("u_0_v")).click();
	
	}

}
