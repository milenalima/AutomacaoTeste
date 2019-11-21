import pages.*

import static cucumber.api.groovy.PT.*
import org.openqa.selenium.By

Dado(~/que o usuário vá na página da loja/) { ->
  to HomePage
  Thread.sleep(2000)
}

Então(~/estará na página inicial/) { ->
  Thread.sleep(2000)
  at SubmarinoPage
}

