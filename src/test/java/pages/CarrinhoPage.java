package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Driver;
import maps.PrincipalMap;

public class CarrinhoPage {
    
    public WebDriver driver;
    private PrincipalMap principalMap;
	
    public CarrinhoPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }
	
	public void clicarPrintedDress() {
		principalMap.btnPrintedDress.click();
	}
	
	public void clicarBtnMore() {
		principalMap.btnMore.click();
	}
	
	public void clicarBotaoDresses() {
		principalMap.btnDresses.click();
	}

	public void aguardaElementoDresses(){
        Driver.visibilityOf(principalMap.btnDresses);
    }
	
	public void aguardaElementoPrintedDresses(){
        Driver.visibilityOf(principalMap.btnPrintedDress);
    }
	
	public void aguardaElementoMore(){
        Driver.visibilityOf(principalMap.btnMore);
    }
	
	public void descerAteElementoDresses() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		Actions builder = new Actions(driver);
		WebElement element = wait.until(ExpectedConditions
		            .elementToBeClickable(By.xpath(("(//a[@title='Printed Dress'])[2]"))));
		Action action = builder.moveToElement(element).build();
		action.perform();
	}
	
	public void aguardaElementoCatalog(){
        Driver.visibilityOf(principalMap.lblcatalog);
    }

}
