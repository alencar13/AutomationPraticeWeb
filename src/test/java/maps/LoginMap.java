package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

	@FindBy(id = "email")
    public WebElement txtEmail;
	@FindBy(id = "passwd")
    public WebElement txtSenha;
	@FindBy(id = "SubmitLogin")
    public WebElement btnEntrar;
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
    public WebElement btnProcederCompraCarrinho;
}
