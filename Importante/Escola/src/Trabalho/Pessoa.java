package Trabalho;

import java.util.Scanner;

 // Utilizar tudo que aprendemos ate agr. Fazer um esquema de classes em que a superclasse seja a pessoa, depois a pessoa tem subclasses o funcionario e o aluno.
 // O funcionario vai ter o professor e o continuo. Uma delas tem de ser uma classe abstrata. Usar o static para criar os id´s. Usar a abstraccao, overload e overriding.

public abstract class Pessoa {

    public static int idPessoa=0;
    private  int idade,contacto,idPess;
    private  String nome,morada;
    

    public int getIdPessoa() {
        return idPessoa;
    }

    private static void setIdPessoa() {
        Pessoa.idPessoa++;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public int getContacto() {
        return contacto;
    }

    private void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    private void setMorada(String morada) {
        this.morada = morada;
    }
    
    public Pessoa(String nome,String morada,int idade, int contacto){
        setIdPessoa();
        setIdade(idade);
        setContacto(contacto);
        setNome(nome);
        setMorada(morada);
       
        
        idPess=this.getIdPessoa();
    }
    public Pessoa(){
        
    }
    
        void display() {
        System.out.println("\n");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Morada:" + this.getMorada());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Contacto:" + this.getContacto());
        
    }
    

    }
