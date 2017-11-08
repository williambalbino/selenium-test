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
		email.sendKeys("221@02.com");
		
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
	
	public void comprar(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement women = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
		women.click();
		
		WebElement top = driver.findElement(By.xpath(".//*[@id='subcategories']/ul/li[1]/h5/a"));
		top.click();
		
		WebElement details = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]/span"));
		details.click();
		
		WebElement qnt = driver.findElement(By.xpath(".//*[@id='quantity_wanted_p']/a[2]/span"));
		qnt.click();
		qnt.click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		size.click();
		
		WebElement sizeM = driver.findElement(By.xpath(".//*[@id='group_1']/option[2]"));
		sizeM.click();
		
		WebElement color = driver.findElement(By.id("color_14"));
		color.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement addToCart = driver.findElement(By.xpath(".//*[@id='add_to_cart']/button"));
		addToCart.click();
		
		
	}
	
	public void segundaCompra(){
		
		
		WebElement dresses = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a"));
		dresses.click();
		
		WebElement casual = driver.findElement(By.xpath(".//*[@id='subcategories']/ul/li[1]/h5/a"));
		casual.click();
		
		WebElement details = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span"));
		details.click();
		
		WebElement cart = driver.findElement(By.xpath(".//*[@id='add_to_cart']/button"));
		cart.click();
		
		
	}
	
	public void terceiraCompra(){
		
		WebElement tShirt = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a"));
		tShirt.click();
		
		WebElement cart = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
		cart.click();
	}
	
	public void editarUsuario(){
		
		WebElement usuario = driver.findElement(By.className("account"));
		usuario.click();
		
		WebElement info = driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[4]/a/span"));
		info.click();
		
		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.clear();
		firstName.sendKeys("Phulano");
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.clear();
		lastName.sendKeys("Dethal");
		
		WebElement oldPassword = driver.findElement(By.id("old_passwd"));
		oldPassword.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.xpath(".//*[@id='center_column']/div/form/fieldset/div[11]/button"));
		submit.click();
		
	}

	
	public String erroLastName(){
		return driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText();
	}
	
	
	
	
}
