import pages.*

import static cucumber.api.groovy.PT.*
import cucumber.api.PendingException
import org.openqa.selenium.By
import java.util.Random;
import geb.Browser;

Dado(~/que usuário esteja na página da loja/) { ->
    Browser.drive{
        go "https://www.submarino.com.br"
        at SubmarinoPage
    }
}

//==============@AdicionarProdutoCarrinho====================

E(~/busca por produto '(.*)'/) { String produto ->
    Thread.sleep(5000)
    page.txtSearchProduct.click()
    Thread.sleep(1000)
    page.txtSearchProduct.value(produto)
    Thread.sleep(1000)
    page.btnSearch.click()
    Thread.sleep(5000)
}

E(~/verifica resultado da busca/) { ->
    assert waitFor(30){
        page.txtProductTitle.text().equals('Smartphone Samsung Galaxy A50 Android 9.0 Tela 6.4" Octa-Core 128GB 4G Câmera Tripla 25MP + 5MP + 8MP - Preto')
    }
    Thread.sleep
    page.imgProduct.click()
    Thread.sleep(5000)
    assert waitFor(30){
        page.txtProductName.text().equals('Smartphone Samsung Galaxy A50 Android 9.0 Tela 6.4" Octa-Core 128GB 4G Câmera Tripla 25MP + 5MP + 8MP - Preto')
    }
    Thread.sleep(1000)
}

Quando(~/adiciona ao carrinho/) { ->
    page.btnBuyProduct.click()
    Thread.sleep(2000)
    page.btnContinue.click()
    Thread.sleep(2000)
}

Então(~/verifica o carrinho/) { ->
    assert waitFor(30){
        page.txtMyBasquet.text().equals("Meu carrinho")
    }
    Thread.sleep(1000)
    page.btnContinueToBuy.click()
    Thread.sleep(2000)
    page.btnHome.click()
    Thread.sleep(2000)
    page.btnMyBasquet.click()
    Thread.sleep(1000)
    assert waitFor(30){
        page.imgBasquetQuantity.text() != "0"
    }
    Thread.sleep(1000)
    page.btnSeeMyBasquet.click()
    Thread.sleep(1000)
    assert waitFor(30){
        page.txtBasquetProductTitle.text().equals('Smartphone Samsung Galaxy A50 Android 9.0 Tela 6.4" Octa-Core 128GB 4G Câmera Tripla 25MP + 5MP + 8MP - Preto')
    }
}
