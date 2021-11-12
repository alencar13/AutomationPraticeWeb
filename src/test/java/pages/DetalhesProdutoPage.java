package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;
import maps.DetalhesProdutoMap;

public class DetalhesProdutoPage {
    
	public WebDriver driver;
    private DetalhesProdutoMap detalhesProdutoMap;
    
    public DetalhesProdutoPage(WebDriver driver) {
        this.driver = driver;
        detalhesProdutoMap = new DetalhesProdutoMap();
        PageFactory.initElements(driver, detalhesProdutoMap);
	}

	public void validaDadosProduto() {
		assertEquals(detalhesProdutoMap.compositionsValue.getText(), "Cotton");
		assertEquals(detalhesProdutoMap.stylesValue.getText(), "Girly");
		assertEquals(detalhesProdutoMap.propertiesValue.getText(), "Colorful Dress");
	}
	
	public void descerAteElementoDataSheet() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		Actions builder = new Actions(driver);
		WebElement element = wait.until(ExpectedConditions
		            .elementToBeClickable(By.xpath(("//tr[3]/td[2]"))));
		Action action = builder.moveToElement(element).build();
		action.perform();
	}
	
	public void adicionaProdutoNoCarrinho() {
		clicaAdicionaCarrinho();
		clicaProcederCompra();
		confirmaDadosCompraEProssegue();
	}


	public void clicaAdicionaCarrinho() {
		detalhesProdutoMap.adicionaCarrinho.click();
		aguardaElementoCarrinho();
		assertEquals(detalhesProdutoMap.validaItemCarrinho.getText(), "There is 1 item in your cart.");
	}

	public void clicaProcederCompra() {
		detalhesProdutoMap.btnProcederCompra.click();
	}

	public void confirmaDadosCompraEProssegue() {
		detalhesProdutoMap.btnProcederCompraCarrinho.click();
		
	}
	
	public void aguardaElementoCarrinho(){
        Driver.visibilityOf(detalhesProdutoMap.validaItemCarrinho);
    }
	
	
}
