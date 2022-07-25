package Trabalho;

public class Continuo extends Funcionario {

    
    private static int idCont;
    private int pavilhao, idConti, idPessoa;
    private char CodFunc = 'C';
    private String funcao="continuo",escolaridade, setor;
    
   // 

    public char getCodFunc() {
        return CodFunc;
    }

    public int getIdCont() {
        return idCont;
    }

    private void setIdCont() {
        Continuo.idCont++;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getPavilhao() {
        return pavilhao;
    }

    public void setPavilhao(int pavilhao) {
        this.pavilhao = pavilhao;
    }

    public Continuo(String nome, String morada, int idade, int contacto, String Funcao, int renum, String escolaridade, String setor, int pavilhao) {
        super(nome, morada, idade, contacto, Funcao, renum);
        this.escolaridade = escolaridade;
        this.setor = setor;
        this.pavilhao = pavilhao;
        setIdCont();
        idConti = getIdCont();
        idPessoa = getIdPessoa();
    }

    void display() {
        System.out.println("\n");
        System.out.println("Codigo:" + idPessoa + this.getCodFunc() + idConti);
        System.out.println("Nome:" + this.getNome());
        System.out.println("Morada:" + this.getMorada());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Contacto:" + this.getContacto());
        System.out.println("Funcao:" + this.getFuncao());
        System.out.println("Renumeracao:" + this.getRenum());
        System.out.println("Escolaridade:" + this.getEscolaridade());
        System.out.println("Setor:" + this.getSetor());
        System.out.println("Pavilhao:" + this.getPavilhao());
    }

}
