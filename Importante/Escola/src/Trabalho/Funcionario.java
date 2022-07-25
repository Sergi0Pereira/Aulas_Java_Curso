package Trabalho;

public abstract class Funcionario extends Pessoa {

    private String Funcao;
    private int renum;

    public String getFuncao() {
        return Funcao;
    }

    private void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public int getRenum() {
        return renum;
    }

    private void setRenum(int renum) {
        this.renum = renum;
    }

    public Funcionario(String nome, String morada, int idade, int contacto, String Funcao, int renum) {
        super(nome, morada, idade, contacto);
        setFuncao(Funcao);
        setRenum(renum);
    }

    public Funcionario() {
    }

    void displayf() {
        display();
        System.out.println("Funcao:" + this.getFuncao());
        System.out.println("Renumeracao:" + this.getRenum());

    }

}
