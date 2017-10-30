package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Compras;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ComprasTest {
	
	static WebDriver driver;
	static Compras compras;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		compras = new Compras(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	

	@Test //16
	public void test1(){ //cadastrar
		compras.cadastrar();
//		assertEquals("There is 1 error", compras.erroLastName());
	}
	
	
	@Test //7
	public void test2() {  //compra1
		compras.comprar();
	}
	
	@Test //4
	public void test4(){ //compra2
		compras.segundaCompra();
	}
	
	@Test //2
	public void test5(){ //compra3
		compras.terceiraCompra();
	}
	
	@Test //6
	public void test3(){ //editar
		compras.editarUsuario();
	}
	

}
