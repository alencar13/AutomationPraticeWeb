package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalhesProdutoMap {

	@FindBy(xpath = "//tr[1]/td[2]")
    public WebElement compositionsValue;
	@FindBy(xpath = "//tr[2]/td[2]")
    public WebElement stylesValue;
	@FindBy(xpath = "//tr[3]/td[2]")
    public WebElement propertiesValue;
	@FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement adicionaCarrinho;	
	@FindBy(xpath = "//span[contains(text(),'There is 1 item in your cart')]")
    public WebElement validaItemCarrinho;
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    public WebElement btnProcederCompra;
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    public WebElement btnProcederCompraCarrinho;

}
