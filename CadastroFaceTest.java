
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CadastroFaceTest {

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
		 driver.findElement(By.id("u_0_1")).sendKeys("karla");
		 driver.findElement(By.id("u_0_3")).sendKeys("Viana");
		 driver.findElement(By.id("u_0_5")).sendKeys("teste@gmail.com");
		 driver.findElement(By.id("u_0_8")).sendKeys("teste@gmail.com");
		 driver.findElement(By.xpath(".//*[@id='u_0_d']")).click();
		 
		 // selecionar mês, dia e ano
		 
		 Select s1 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		 s1.selectByIndex(29);
		 
		 Select s2 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		 s2.selectByIndex(7);
		 
		 
		 Select s3 = new  Select(driver.findElement(By.xpath(".//*[@id='year']")));
		 s3.selectByValue("1978");
		 
		 // disparar o evento do click do botão 
		 
		 driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		 driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a"));
		 driver.navigate().back();
		 
	
	}
	

}
