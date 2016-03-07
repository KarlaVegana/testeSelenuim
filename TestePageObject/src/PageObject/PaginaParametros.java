package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaParametros extends PaginaBase {
	
	public PaginaParametros(WebDriver driver) {
		super(driver);
	}	
		public String obterValorParametro(String id) {
			return getDriver().findElement(By.id(id)).getAttribute("value");
		}
		public void confirmarParametros() {
			getDriver().findElement(By.id("btnConfirm")).click();
		}
	}


