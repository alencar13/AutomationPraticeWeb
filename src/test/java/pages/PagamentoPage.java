package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maps.PagamentoMap;

public class PagamentoPage {
    
	public WebDriver driver;
    private PagamentoMap pagamentoMap;
	
    public PagamentoPage(WebDriver driver) {
        this.driver = driver;
        pagamentoMap = new PagamentoMap();
        PageFactory.initElements(driver, pagamentoMap);
    }

	public void confirmaFormaDePagamento() {
		pagamentoMap.btnPagar.click();
		pagamentoMap.btnConfirmarPedido.click();
	}
	
	public void validaDadosPedido() {
		assertEquals(pagamentoMap.lblCompraCompletaComSucesso.getText(), "Your order on My Store is complete.");
	}

}
