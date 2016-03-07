
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearchTestJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

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
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("selenuim ide");
		 driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		 driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("selenuim ide");
		 driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
         

		 
		 
	}
}