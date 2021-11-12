package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import maps.EnvioMap;

public class EnvioPage {
    
	public WebDriver driver;
    private EnvioMap envioMap;
	
    public EnvioPage(WebDriver driver) {
        this.driver = driver;
        envioMap = new EnvioMap();
        PageFactory.initElements(driver, envioMap);
    }

	public void aceitaTermos() {
		envioMap.termosDeServico.click();
	}

	public void procedeComCompra() {
		envioMap.btnProcederCompraCarrinho.click();
	}

}
