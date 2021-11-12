package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagamentoMap {

	@FindBy(className =  "bankwire")
    public WebElement btnPagar;
	@FindBy(xpath =  "//span[text()='I confirm my order']")
    public WebElement btnConfirmarPedido;	
	@FindBy(xpath =  "//strong[text()='Your order on My Store is complete.']")
    public WebElement lblCompraCompletaComSucesso;
	
	

}
