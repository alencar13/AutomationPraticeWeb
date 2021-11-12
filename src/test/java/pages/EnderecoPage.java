package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maps.EnderecoMap;


public class EnderecoPage {
    
	public WebDriver driver;
    private EnderecoMap enderecoMap;
	
    public EnderecoPage(WebDriver driver) {
        this.driver = driver;
        enderecoMap = new EnderecoMap();
        PageFactory.initElements(driver, enderecoMap);
    }

	public void clicaBotaoProsseguir() {
		enderecoMap.btnProcederCompraCarrinho.click();
	}

}
