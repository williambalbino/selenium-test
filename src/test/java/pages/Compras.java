package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compras {

	static WebDriver driver;
	
	public Compras(WebDriver driver){
		this.driver = driver;
	}
		
	public void cadastrar(){
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("testando4321@email.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement sexo = driver.findElement(By.id("id_gender2"));
		sexo.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("William");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Balbino");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("123456");
		
		WebElement dia = driver.findElement(By.id("days"));
		dia.click();
		
		WebElement dia2 = driver.findElement(By.xpath(".//*[@id='days']/option[15]"));
		dia2.click();
		
		WebElement mes = driver.findElement(By.id("months"));
		mes.click();
		
		WebElement mes2 = driver.findElement(By.xpath(".//*[@id='months']/option[6]"));
		mes2.click();
		
		WebElement ano = driver.findElement(By.id("years"));
		ano.click();
		
		WebElement ano2 = driver.findElement(By.xpath(".//*[@id='years']/option[26]"));
		ano2.click();
		
		WebElement endereco = driver.findElement(By.id("address1"));
		endereco.sendKeys("Rua Diogo da Costa, 479");
		
		WebElement cidade = driver.findElement(By.id("city"));
		cidade.sendKeys("New York");
		
		WebElement estado = driver.findElement(By.id("id_state"));
		estado.click();
		
		WebElement estado2 = driver.findElement(By.xpath(".//*[@id='id_state']/option[34]"));
		estado2.click();
		
		WebElement cep = driver.findElement(By.id("postcode"));
		cep.sendKeys("58400");

		WebElement phone = driver.findElement(By.id("phone_mobile"));
		phone.sendKeys("83988880000");
		
		WebElement submit = driver.findElement(By.id("submitAccount"));
		submit.click();
		
	}
	
	
}
