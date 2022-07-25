package Trabalho;


public class Aluno extends Pessoa{
    
    int idAluno,idPessoa, anoFreq;
    String curso,disciplinas,notas,funcao="aluno";
    char CodAluno='A';
    
   // 

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno() {
        this.idAluno++;
    }

    public int getAnoFreq() {
        return anoFreq;
    }

    public void setAnoFreq(int anoFreq) {
        this.anoFreq = anoFreq;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public char getCodAluno() {
        return CodAluno;
    }

    public void setCodAluno(char CodAluno) {
        this.CodAluno = CodAluno;
    }
    
    public Aluno(int idade, int contacto, String nome, String morada,int anoFreq,String curso,String disciplinas,String notas){
        super(nome, morada, idade, contacto);
        this.anoFreq=anoFreq;
        this.curso=curso;
        this.disciplinas=disciplinas;
        this.notas=notas;
        
        setIdAluno();

        idAluno = getIdAluno();
        idPessoa = getIdPessoa();
        
    }
    
          void display() {
        System.out.println("\n");
        System.out.println("Codigo:" + idPessoa+this.getCodAluno()+idAluno);
        System.out.println("Nome:" + this.getNome());
        System.out.println("Morada:" + this.getMorada());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Contacto:" + this.getContacto());
        System.out.println("Curso:" + this.getCurso());
        System.out.println("Ano:" + this.getAnoFreq());
        System.out.println("Disciplinas:" + this.getDisciplinas());
        System.out.println("Notas:" + this.getNotas());

    }
}