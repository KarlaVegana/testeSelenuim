package funcionalTest;


import org.junit.Assert;
import org.junit.Test;
import PageObject.PaginaBase;
import PageObject.PaginaInicial;
import PageObject.PaginaLogin;
import PageObject.PaginaParametros;

public class ParametroTest {
	protected PaginaBase paginaBase = new PaginaBase();;
	protected PaginaLogin paginaLogin;
	protected PaginaInicial paginaInicial;
	protected PaginaParametros paginaParametros;

	@Test
	public void valorParametro() throws Exception {
			acessandoPaginaLogin();
			adotandoQueUsuarioLogado();
			acessaMenuParametro();
			verificaValorParametro();
			confirmaEntaoParametros();
			fechaNavegador();
		}

		private void acessandoPaginaLogin() {
			this.paginaBase.navegateTo("localhost:8080/sys/login.html");
	    	}
		private void adotandoQueUsuarioLogado() {
			this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
			this.paginaInicial = paginaLogin.logar("admin","admin123");
	   	}
		private void acessaMenuParametro() {
			this.paginaParametros = paginaInicial.acessaPaginaDeParametros();
		}
		private void verificaValorParametro() {
	     Assert.assertEquals("30", this.paginaParametros.obterValorParametro("prTempMax"));
	    	}
		private void confirmaEntaoParametros() {
			this.paginaParametros.confirmarParametros();
		}
		private void fechaNavegador() {
			this.paginaBase.closeNavegator();
		}
	}


