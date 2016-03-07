
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial extends PaginaBase {
	public PaginaInicial(WebDriver driver) {
		super(driver);
	}
	public PaginaParametros acessaPaginaDeParametros() {
		getDriver().findElement(By.id("btnParametros")).click();
		return new PaginaParametros(getDriver());
	}
}