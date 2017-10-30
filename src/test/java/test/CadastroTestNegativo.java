package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Cadastro;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTestNegativo {

	static WebDriver driver;
	static Cadastro cadastro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=pt-BR");
		cadastro = new Cadastro(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test //2
	public void sobrenomeInvalido() {
		cadastro.sobrenomeInvalido();
		assertEquals("Você não pode deixar este campo em branco.", cadastro.erroSobrenome());
	}

	// @Test
	// public void nomeInvalido(){
	// cadastro.nomeInvalido();
	// assertEquals(cadastro.erroNome(), "Você não pode deixar este campo em
	// branco.");
	// }

	@Test //4
	public void emailESenhaInvalido() {
		cadastro.emailVaziol();
		assertEquals(cadastro.erroEmail(), "Você não pode deixar este campo em branco.");
		cadastro.senhaDiferente();
		assertEquals("Você não pode deixar este campo em branco.", cadastro.erroSenha());
	}
	

	@Test //2
	public void testSexo() {
		cadastro.preencherSexo();
	}

	@Test //2
	public void recoveryTest() {
		cadastro.preencherTelefone();
		cadastro.preencherRecoveryEmail();
	}

	@Test //1 
	public void clickTest() {
		cadastro.clicarSubmit();
	}

}
