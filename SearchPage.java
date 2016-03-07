

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchPage {

	@Before
	public void setUp() throws Exception {
	}
	WebDriver  driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		driver.get("http://www.indeed.com.br/empregos");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='what']")).sendKeys("java");
		driver.findElement(By.xpath(".//*[@id='where']")).clear();
		driver.findElement(By.xpath(".//*[@id='where']")).sendKeys("Recife/PE");
		driver.findElement(By.xpath(".//*[@id='fj']")).click();
		driver.getTitle().contentEquals("Desenvolvedor Júnior");
		driver.findElement(By.linkText("Desenvolvedor Júnior")).click();
		
		
		
	}

}
