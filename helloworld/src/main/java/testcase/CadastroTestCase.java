package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		
		this.cadastro.preencherCadastro("Maria", "teste@teste", "minhasenha", "minhasenha", "999999999", "Alvorada");
		this.cadastro.enviarFormulario();
				
	}
	
	@After
	public void tearDown() {
			this.driver.quit();
	
	
	}
}
