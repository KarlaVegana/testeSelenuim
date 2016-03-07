import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FiltrarPorMenorPreçoTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.belezanaweb.com.br/maquiagem/olhos/sombra/");
		driver.manage().window().maximize();
		
	}

}
