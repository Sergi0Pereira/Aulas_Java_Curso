package Trabalho;
// otimizar o codigo para arrayList (Add, Remove, Editar(replace))

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Funcionario {

    Scanner in = new Scanner(System.in);

    // Atributos -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    private int idProf = 0;
    private String disciplinaIn, cursoIn, turmaIn, cursoLimpo, disciplinaLimpo, input;
    private int estudantes,idPessoa ;
    public static int idProfe;
    private ArrayList<String> cursos = new ArrayList<>();
    private ArrayList<String> disciplinas = new ArrayList<>();
    private ArrayList<String> turmas = new ArrayList<>(); // aqui
    final private char CodFunc = 'P';
    private Boolean validacao = true;
    
    

    // Getters/Ver -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    public char getCodFunc() {
        return CodFunc;
    }

    public int getIdProf() {
        return idProfe;
    }

    public int getEstudantes() {
        return estudantes;
    }

    public void getCursos() {
        for (String Curso : this.cursos) {
            System.out.println(Curso);
        }
        if (cursos.isEmpty()) {
            System.out.println("Sem cursos.");
        }

    }

    public void getTurmas() {
        for (String Turmas : this.turmas) {
            System.out.println(Turmas + " ");
        }
        if (turmas.isEmpty()) {
            System.out.println("Sem turmas.");
        }
    }

    public void getDisciplinas() {
        for (String Disciplina : this.disciplinas) {
            System.out.println(Disciplina + " ");
        }
        if (disciplinas.isEmpty()) {
            System.out.println("Sem disciplinas.");
        }

    }

    // Setters/Adicionar -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    private  void setIdProf() {
        Professor.idProfe++;

    }

    private void setEstudantes(int estudantes) {
        this.estudantes = estudantes;
    }

    public void setCursos() {
        System.out.println("Ola " + getNome());
        do {
            System.out.println("Quantos cursos deseja inserir?");
            input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
                validacao = Character.isDigit(input.charAt(i));
                if (!validacao) {
                    System.out.println("Erro!Caracteres Inválidos!");
                    break;
                }

            }
        } while (!validacao);

        int inputI = Integer.parseInt(input);

        for (int x = 1; x <= inputI; x++) {
            do {
                System.out.println("Insira aqui o seu " + x + " curso:");
                cursoIn = in.nextLine();
                String cursosLimpo = cursoIn.replaceAll("\\s+", "");

                for (int i = 0; i < cursosLimpo.length(); i++) {

                    validacao = Character.isAlphabetic(cursosLimpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }
            } while (!validacao);
            this.cursos.add(cursoIn);
        }

    }

    public void setDisciplinas() {

        do {
            System.out.println("Quantas disciplinas deseja inserir?");
            input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
                validacao = Character.isDigit(input.charAt(i));
                if (!validacao) {
                    System.out.println("Erro!Caracteres Inválidos!");
                    break;
                }

            }
        } while (!validacao);
        int inputI = Integer.parseInt(input);
        for (int x = 1; x <= inputI; x++) {
            do {
                System.out.println("Insira aqui a sua " + x + " disciplina:");
                disciplinaIn = in.nextLine();
                String disciplinasLimpo = disciplinaIn.replaceAll("\\s+", "");

                for (int i = 0; i < disciplinasLimpo.length(); i++) {

                    validacao = Character.isAlphabetic(disciplinasLimpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }

            } while (!validacao);
            this.disciplinas.add(disciplinaIn);
        }
    }

    public void setTurmas() {
        do {
            System.out.println("Quantas Turmas deseja inserir?");
            input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
                validacao = Character.isDigit(input.charAt(i));

                if (!validacao) {
                    System.out.println("Erro!Caracteres Inválidos!");
                    break;

                }
            }
        } while (!validacao);

        int inputI = Integer.parseInt(input);
        for (int x = 1; x <= inputI; x++) {

            System.out.println("Insira aqui a sua " + x + " turma:");
            turmaIn = in.nextLine();

            this.turmas.add(turmaIn);
        }
    }
    // Edit----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void editCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Voce nao tem nenhum curso no seu perfil.\nAte Breve.\n");
            return;
        }

        do {

            System.out.println("\nPretende editar um curso?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual o curso que pretende substituir?");
            input = in.nextLine();
            String newInput;
            if (!cursos.contains(input)) {
                System.out.println("Curso nao encontrado");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }
        } while (!cursos.contains(input));
        do {
            System.out.println("Insira aqui o seu novo curso:");
            cursoIn = in.nextLine();
            cursoLimpo = cursoIn.replaceAll("\\s+", "");

            for (int i = 0; i < cursoLimpo.length(); i++) {

                validacao = Character.isAlphabetic(cursoLimpo.charAt(i));
                if (!validacao) {
                    System.out.println("Erro!Caracteres Inválidos!");
                    break;
                }

            }

        } while (!validacao);

        cursos.set(cursos.indexOf(input), cursoIn);

    }

    public void editDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Voce nao tem nenhuma disciplina no seu perfil.\nAte Breve.\n");
            return;
        }

        do {

            System.out.println("\nPretende editar uma disciplina?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual a disciplina que pretende substituir?");
            input = in.nextLine();
            String newInput;
            if (!disciplinas.contains(input)) {
                System.out.println("Disciplina nao encontrada");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }
        } while (!disciplinas.contains(input));
        do {
            System.out.println("Insira aqui a sua nova disciplina:");
            disciplinaIn = in.nextLine();
            disciplinaLimpo = disciplinaIn.replaceAll("\\s+", "");

            for (int i = 0; i < disciplinaLimpo.length(); i++) {

                validacao = Character.isAlphabetic(disciplinaLimpo.charAt(i));
                if (!validacao) {
                    System.out.println("Erro!Caracteres Inválidos!");
                    break;
                }

            }

        } while (!validacao);

        disciplinas.set(disciplinas.indexOf(input), disciplinaIn);

    }

    public void editTurmas() {
        if (turmas.isEmpty()) {
            System.out.println("Voce nao tem nenhuma turma no seu perfil.\n");
            return;
        }

        do {

            System.out.println("\nPretende editar o codigo de uma turma?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual a turma que pretende substituir?");
            input = in.nextLine();
            String newInput;
            if (!turmas.contains(input)) {
                System.out.println("Disciplina nao encontrada");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }
        } while (!turmas.contains(input));
        System.out.println("Insira aqui a sua nova turma:");
        turmaIn = in.nextLine();

        turmas.set(turmas.indexOf(input), turmaIn);

    }

    // Removes ------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void removeCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Voce nao tem nenhum curso no seu perfil.\nAte Breve.\n");
            return;
        }

        do {

            System.out.println("\nPretende apagar todos os cursos?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {

            }
            if (input.equals("sim")) {

                cursos.removeAll(cursos);
                return;
            }

        } while (!input.equals("sim") && !input.equals("nao"));
        do {

            System.out.println("\nPretende apagar os dados de um curso?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual o curso que pretende eliminar?");
            input = in.nextLine();

            if (!cursos.contains(input)) {
                System.out.println("Curso nao encontrado");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }

        } while (!cursos.contains(input));

        cursos.remove(input);

        System.out.println("\nCurso Apagado!");
    }

    public void removeDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Voce nao tem nenhuma disciplina no seu perfil.\nAte Breve.\n");
            return;
        }
        do {

            System.out.println("\nPretende apagar todos as disciplinas?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {

            }
            if (input.equals("sim")) {

                disciplinas.removeAll(disciplinas);
                return;
            }

        } while (!input.equals("sim") && !input.equals("nao"));
        do {

            System.out.println("\nPretende apagar os dados de uma disciplina?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual a disciplina que pretende eliminar?");
            input = in.nextLine();

            if (!disciplinas.contains(input)) {
                System.out.println("Disciplina nao encontrada");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }

        } while (!disciplinas.contains(input));

        disciplinas.remove(input);

        System.out.println("\nDisciplina Apagada!");
    }

    public void removeTurmas() {
        if (turmas.isEmpty()) {
            System.out.println("Voce nao tem nenhuma turma no seu perfil.\nAte Breve.\n");
            return;
        }
        do {

            System.out.println("\nPretende apagar todas as turmas?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {

            }
            if (input.equals("sim")) {

                turmas.removeAll(turmas);
                return;
            }

        } while (!input.equals("sim") && !input.equals("nao"));
        do {

            System.out.println("\nPretende apagar uma turma?");
            input = in.nextLine().toLowerCase();

            if (!input.equals("sim") && !input.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (input.equals("nao")) {
                System.out.println("Até Breve");
                return;

            }

        } while (!input.equals("sim") && !input.equals("nao"));

        do {

            System.out.println("\nQual a turma que pretende eliminar?");
            input = in.nextLine();

            if (!turmas.contains(input)) {
                System.out.println("Turma nao encontrada");
                System.out.println("Pretende sair?");
                input = in.nextLine();
                if (input.equals("sim")) {
                    return;
                }
            }

        } while (!turmas.contains(input));

        turmas.remove(input);

        System.out.println("\nTurma Apagada!");
    }
    // Construtores -----------------------------------------------------------------------------------------------------------------------------------------------------------------

    public Professor(String nome,
            String morada, int idade, int contacto, String Funcao, int renum, int estudantes) {
        super(nome, morada, idade, contacto, Funcao, renum);
        this.estudantes = estudantes;
        setIdProf();
        idPessoa = getIdPessoa();
        idProfe = getIdProf();

    }

    public Professor() {

    }

    // Display -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    void displayP() {
        System.out.println("\n");
        System.out.println("Codigo:" + this.idPessoa + this.getCodFunc() + this.idProfe);
//        System.out.println("Nome:" + this.getNome());
//        System.out.println("Morada:" + this.getMorada());
//        System.out.println("Idade:" + this.getIdade());
//        System.out.println("Contacto:" + this.getContacto());
//        System.out.println("Funcao:" + this.getFuncao());
//        System.out.println("Renumeracao:" + this.getRenum());
        displayf();
        System.out.println("Numero de Alunos:" + this.getEstudantes());
        System.out.println("Cursos Lecionados:");
        this.getCursos();
        System.out.println("Disciplinas Lecionados:");
        this.getDisciplinas();
        System.out.println("Turmas:");
        this.getTurmas();
        System.out.println("");

    }

}
