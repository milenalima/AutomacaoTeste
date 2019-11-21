package pages

import org.openqa.selenium.By
import pages.base.BasePage

class SubmarinoPage extends BasePage {
  static at = { title.contains("Submarino") }
  static content ={

    txtSearchProduct {$(By.xpath("//*[@id='h_search-input']"))}
    btnSearch {$(By.xpath("//*[@id='h_search-btn']"))}
    txtProductTitle {$(By.xpath("//*[@id='content-middle']/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[2]/div[1]/h2"))}
    imgProduct {$(By.xpath("//*[@id='content-middle']/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a/section/div[1]/div/div/picture"))}
    txtProductName {$(By.xpath("//*[@id='product-name-default']"))}
    btnBuyProduct {$(By.xpath("//*[@id='btn-buy']"))}
    btnContinue {$(By.xpath("//*[@id='btn-continue']"))}
    txtMyBasquet {$(By.xpath("//*[@id='app']/section/header/h2"))}
    btnContinueToBuy {$(By.xpath("//*[@id='buy-button']"))}
    btnHome {$(By.xpath("//*[@id='brd-link']/svg[2]"))}
    btnMyBasquet {$(By.xpath("//*[@id='h_minicart']/a"))}
    imgBasquetQuantity {$(By.xpath("//*[@id='h_minicart']/a/span"))}
    btnSeeMyBasquet {$(By.xpath("//*[@id='crt-box']/div/a[1]"))}
    txtBasquetProductTitle {$(By.xpath("//*[@id='app']/section/section/div[1]/div/div[1]/section/ul/li/div[2]/div[1]/h2"))}

  }
}