# Martial-Academy
Martial academy system with java

Para Conectar o Banco Primeiramente, entar na tela Login no pkg graphic e Descomentar duas linhas
//        CriarTabelas tabelas = new CriarTabelas();;
//        tabelas.criarTabela();

depois disso descomentar o throws Exception

e por fim descomentar o import do criarTabelas la no topo
//import config.CriarTabelas;

feito isso pode executar o codigo
para criar as tabelas no postgres

depois de criado pode refazer o processo ao contrario para comentar
pois a partir dai vai ser utilizada a classe conexao
