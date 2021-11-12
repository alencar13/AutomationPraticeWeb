package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoMap {

	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement btnDresses;
	@FindBy(xpath = "(//a[@title='Printed Dress'])[2]")
    public WebElement btnPrintedDress;
	@FindBy(xpath = "(//span[text()='More'])[1]")
    public WebElement btnMore;
	@FindBy(xpath = "//p[text()='Catalog']")
    public WebElement lblcatalog;

}
