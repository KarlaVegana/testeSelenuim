import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FiltrarPorMenorPre�oException {

	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.freeitalia.com.br/lista/13/ofertas");
		driver.manage().window().maximize();
		
		/// exibir os produtos menores
		
		 Select s1 = new Select(driver.findElement(By.xpath(".//*[@id='FiltroFaixaPrecocmbFaixaPrecoInicio']")));
		 s1.selectByIndex(6);
		 Select s2 = new Select(driver.findElement(By.xpath(".//*[@id='FiltroFaixaPrecocmbFaixaPrecoFim']")));
		 s2.selectByIndex(2);
		 // clicar no  bot�o de filtar
		 
		  driver.findElement(By.xpath(".//*[@id='filtros_busca']/div/fieldset/label[3]/img")).click();
		
		
	
	}

}
