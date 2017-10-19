package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cadastro {

	static WebDriver driver;

	public Cadastro(WebDriver driver) {
		this.driver = driver;

	}

	public void preencherNomeSobrenome() {
		WebElement nome = driver.findElement(By.id("FirstName"));
		nome.sendKeys("William");

		WebElement sobrenome = driver.findElement(By.name("LastName"));
		sobrenome.sendKeys("Balbino");

	}

	public void sobrenomeInvalido() {
		WebElement nome = driver.findElement(By.id("FirstName"));

	}

	public void nomeInvalido() {
		WebElement sobrenome = driver.findElement(By.name("LastName"));
	}

	public void preencherEmail() {
		WebElement email = driver.findElement(By.id("GmailAddress"));
		email.sendKeys("will123will");
	}

	public void emailVaziol() {
		WebElement email = driver.findElement(By.id("GmailAddress"));

	}

	public void preencherSenha() {
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("senha123@");

		WebElement confirmarsenha = driver.findElement(By.id("PasswdAgain"));
		confirmarsenha.sendKeys("senha123@");

	}

	public void senhaDiferente() {
		WebElement senha = driver.findElement(By.name("Passwd"));
	}

	public void preencherAniversario() {
		WebElement dia = driver.findElement(By.id("BirthDay"));
		dia.sendKeys("14");

		WebElement mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		mes.click();

		WebElement mesmaio = driver.findElement(By.xpath(".//*[@id=':5']/div"));
		mesmaio.click();

		WebElement ano = driver.findElement(By.name("BirthYear"));
		ano.sendKeys("1993");
	}

	public void preencherSexo() {
		WebElement sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div"));
		sexo.click();

		WebElement sexom = driver.findElement(By.xpath(".//*[@id=':f']/div"));
		sexom.click();

	}

	public void preencherTelefone() {
		WebElement celular = driver.findElement(By.name("RecoveryPhoneNumber"));
		celular.sendKeys("83 996365545");

	}

	public void preencherRecoveryEmail() {
		WebElement email2 = driver.findElement(By.name("RecoveryEmailAddress"));
		email2.sendKeys("willteste2@gmail.com");
	}

	public void clicarSubmit() {
		WebElement gravar = driver.findElement(By.id("submitbutton"));
		gravar.click();
	}

	///// MENSAGENS DE ERRO

	public String erroSobrenome() {
		return driver.findElement(By.id("errormsg_0_LastName")).getText();
	}

	public String erroNome() {
		return driver.findElement(By.id("errormsg_0_FirstName")).getText();
	}

	public String erroEmail() {
		return driver.findElement(By.id("errormsg_0_GmailAddress")).getText();
	}

	public String erroSenha() {
		return driver.findElement(By.id("errormsg_0_PasswdAgain")).getText();
	}
	
	public String erroDia(){
		return driver.findElement(By.id("errormsg_0_BirthDay")).getText();
	}

}
