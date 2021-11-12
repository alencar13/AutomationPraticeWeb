#language:pt
#encoding:UTF-8
  @SuiteLojaAutomation
Funcionalidade: Validar dados de um produto

Contexto: 
		Dado que o site e-commerce esteja sendo exibido

  @ValidaDadosProdutoSelecionado
  Cenario: Validar dados do produto selecionado
    Dado que acesse o menu dresses
    Quando seleciono o produto Printed Dresses e a pagina de detalhes do produto e exibida
    Entao valido os dados do produto

  @RealizaCompraProduto
  Cenario: Realizar a compra de um produto
    Dado que acesse o menu dresses
    Quando seleciono o produto Printed Dresses e a pagina de detalhes do produto e exibida
    E adiciono o produto no carrinho
    E realizo login
    E preencho os campos com dados pessoais e de cartao
    E finalizo a compra
    Entao valido os dados da compra