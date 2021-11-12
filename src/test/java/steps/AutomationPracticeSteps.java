package steps;

import core.Driver;
import enums.Browser;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.DetalhesProdutoMap;
import maps.EnderecoMap;
import maps.EnvioMap;
import maps.LoginMap;
import maps.PagamentoMap;
import maps.PrincipalMap;
import pages.DetalhesProdutoPage;
import pages.EnderecoPage;
import pages.EnvioPage;
import pages.LoginPage;
import pages.PagamentoPage;
import pages.PrincipalPage;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeSteps {
    DetalhesProdutoPage detalhesProdutoPage;
    DetalhesProdutoMap detalhesProdutoMap;
    PagamentoPage pagamentoPage;
    PagamentoMap pagamentoMap;
    PrincipalPage principalPage;
    PrincipalMap principalMap;
    EnderecoPage enderecoPage;
    EnderecoMap enderecoMap;
    EnvioPage envioPage;
    EnvioMap envioMap;
	LoginPage loginPage;
	LoginMap loginMap;
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void iniciaNavegador(Scenario cenario){
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }
    
	@SuppressWarnings({ "unused", "static-access" })
	@Dado("que o site e-commerce esteja sendo exibido")
    public void queOSiteECommerceEstejaSendoExibido() throws IOException {
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
		Driver.getDriver().get("http://automationpractice.com/");
		
    	detalhesProdutoPage = new DetalhesProdutoPage(driver);
    	detalhesProdutoMap = new DetalhesProdutoMap();
    	pagamentoPage = new PagamentoPage(driver);
    	pagamentoMap = new PagamentoMap();
    	principalPage = new PrincipalPage(driver);
    	principalMap = new PrincipalMap();
    	enderecoPage = new EnderecoPage(driver);
    	enderecoMap = new EnderecoMap();
    	loginPage = new LoginPage(driver);
    	loginMap = new LoginMap();
    	envioPage = new EnvioPage(driver);
    	envioMap = new EnvioMap();
    }
    
    @Dado("que acesse o menu dresses")
    public void que_acesse_o_menu_dresses() throws IOException {
    	principalPage.aguardaElementoDresses();
    	principalPage.clicarBotaoDresses();
    }
    
    @Quando("seleciono o produto Printed Dresses e a pagina de detalhes do produto e exibida")
    public void seleciono_o_produto_printed_dresses_e_a_pagina_de_detalhes_do_produto_e_exibida() {
    	principalPage.aguardaElementoCatalog();
    	principalPage.descerAteElementoDresses();
    	principalPage.aguardaElementoMore();
    	principalPage.clicarBtnMore();
    }

    @Entao("valido os dados do produto")
    public void valido_os_dados_do_produto() {
    	detalhesProdutoPage.descerAteElementoDataSheet();
    	detalhesProdutoPage.validaDadosProduto();
    }
    
    @Quando("adiciono o produto no carrinho")
    public void adiciono_o_produto_no_carrinho() {
    	detalhesProdutoPage.adicionaProdutoNoCarrinho();
    }

    @Quando("realizo login")
    public void realizo_login() {
    	loginPage.fazLogin();
    }

    @Quando("preencho os campos com dados pessoais e de cartao")
    public void preencho_os_campos_com_dados_pessoais_e_de_cartao() {
       enderecoPage.clicaBotaoProsseguir();
       envioPage.aceitaTermos();
       envioPage.procedeComCompra();
    }

    @Quando("finalizo a compra")
    public void finalizo_a_compra() {
        pagamentoPage.confirmaFormaDePagamento();
    }

    @Entao("valido os dados da compra")
    public void valido_os_dados_da_compra() {
       pagamentoPage.validaDadosPedido();
       driver.quit();
    }
}
