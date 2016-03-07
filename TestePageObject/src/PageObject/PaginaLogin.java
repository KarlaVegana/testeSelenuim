package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends PaginaBase {
			public PaginaLogin(WebDriver driver) {
				super(driver);
			}
			public PaginaInicial logar(String userName, String userPassword) {
				realizaLogin(userName, userPassword);
				return new PaginaInicial(getDriver());
			}
			private void realizaLogin(String userName, String userPassword) {
				getDriver().findElement(By.id("userName")).clear();
				getDriver().findElement(By.id("userName")).sendKeys(userName);
				getDriver().findElement(By.id("userPassword")).clear();
				getDriver().findElement(By.id("userPassword")).sendKeys(userPassword);
				getDriver().findElement(By.id("btLogin")).click();
			}
	}


