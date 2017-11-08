package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Cadastro;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTestPositivo {

	// instanciando a classe webdriver
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
	public void test2() {
		cadastro.preencherNomeSobrenome();
		// assertEquals(cadastro.erroSobrenome(), "Você não pode deixar este campo
		// em branco.");
	}

	@Test //3
	public void test1() {
		cadastro.preencherEmail();
		cadastro.preencherSenha();
	}

	@Test  //4
	public void test3() {
		cadastro.preencherAniversario();
	}

	@Test //2
	public void test4() {
		cadastro.preencherSexo();
	}

	@Test //2
	public void test5() {
		cadastro.preencherTelefone();
		cadastro.preencherRecoveryEmail();
	}

	@Test //1
	public void test6() {
		cadastro.clicarSubmit();

	}

	

}
