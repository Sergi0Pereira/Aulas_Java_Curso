package Trabalho;

interface apresentacao {

    default public void ap(String nome,int idade,String funcao) {
        System.out.println("Ola, o seu nome e "+ nome + " tem "+ idade + " anos e e " + funcao + " na FEUP .");
    }

}