# AutomacaoTeste

Para rodar o projeto do Katalon é preciso:

Instalar o Katalon na máquina

Instalar o plugin no navegador que deseja usar, menos no Firefox que é default

Importar o projeto

Executar o projeto

Para rodar o projeto do VS Code é preciso:

O JDK Java 8 deve ser instalado e configurado no JAVA_HOME do sistema operacional.

O Vs Code deve ser instalado normalmente (opicional) e será usado como ambiente de desenvolvimento para o projeto

O Gradle deve ser descompactado em uma pasta e configurado no PATH do sistema operacional e também deve ser criado um GRADLE_HOME.

Se tudo for corretamente instalado e configurado com um Command Shell aberto ao usar o comando "gradle -v" o seguinte status deve ser retornado:

Para rodar o projeto é preciso:

Abrir o prompt de comando cmd ou powershell no caminho do projeto

Executar o comando *gradle bdd*, para rodar o projeto inteiro ou *gradle bdd -Ptag=@<tag_do_caso_de_teste>* para rodar um caso de teste específico.
