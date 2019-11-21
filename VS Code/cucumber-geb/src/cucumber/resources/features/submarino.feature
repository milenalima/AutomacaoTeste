#language:pt
Funcionalidade: Verificar fluxo de compra
  Realizar testes sobre as ações básicas de um fluxo de compra

  Contexto:
    Dado que o usuário vá na página da loja
    Então estará na página inicial

# -------------------------------------------------------

@AdicionarProdutoCarrinho
Cenário: Verificar se produto foi adicionado em AdicionarProdutoCarrinho
   Dado que usuário esteja na página da loja
   E busca por produto 'Samsung A50'
   E verifica resultado da busca
   Quando adiciona ao carrinho
   Então verifica o carrinho

