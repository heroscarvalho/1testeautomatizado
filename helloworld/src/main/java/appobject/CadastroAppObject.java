package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
		private WebDriver driver;
		
		public CadastroAppObject(WebDriver driver) {
			this.driver = driver;
}
	
		//MAPEANDO
		
		
		public WebElement getNomeCompletoTextField() {             
			return this.driver.findElement(By.id("nome"));		
		}
		
		public WebElement getEmailTextField() {
			return this.driver.findElement(By.id("email"));
		}
		
		public WebElement getSenhaTextField() {
			return this.driver.findElement(By.id("password"));		
		}
		
		public WebElement getConfirmarSenhaTextField() {
			return this.driver.findElement(By.id("passconf"));
		}
		
		public WebElement getTelefoneTextField() {
			return this.driver.findElement(By.id("telefone"));
		}
		
		public WebElement getCidadeComboBoxTextField() {
			return this.driver.findElement(By.id("cidade"));
		}
		
		public WebElement getCadastrarButton() {
			//return this.driver.findElement(By.className("btn btn-success")); 
			
			//USAR O CODIGO DE CIMA OU ENTÃO USAR O XPATH, IGUAL EXEMPLO A BAIXO
			
			return this.driver.findElement(By.xpath("//*[@id=\"cadastrar\"]/fieldset/div[8]/div/input"));
		
		}
		
}
