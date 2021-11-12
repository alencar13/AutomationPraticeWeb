package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnvioMap {

	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    public WebElement btnProcederCompraCarrinho;
	@FindBy(id = "cgv")
    public WebElement termosDeServico;
	
	

}
