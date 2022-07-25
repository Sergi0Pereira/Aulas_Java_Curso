package Trabalho;

import static java.lang.System.exit;

public class Menu extends Professor implements apresentacao {

    Boolean validacao = true;
    String login, res;

    Professor Sergio = new Professor("Sergio Pereira", "Rua das cangostas",
            32, 917386182, "Professor Matematica", 1200, 100);

    Professor Rogerio = new Professor("Rogerio Pereira", "Rua das cangostas",
            52, 917386182, "Professor Programacao", 1200, 100);

    public void Menu() {

        ap(this.Rogerio.getNome(), this.Rogerio.getIdade(), this.Rogerio.getFuncao());

        System.out.println("O que pretende fazer? \n");

        res = "N";

        while (!res.equals("S")) {

            System.out.println("-------- 1- Consultar -----------");
            System.out.println("-------- 2- Inserir -------------");
            System.out.println("-------- 3- Editar --------------");
            System.out.println("-------- 4- Apagar --------------");
            System.out.println("-------- V- Visualizar Tudo------");
            System.out.println("-------- S- Sair ----------------");

            res = in.next().toUpperCase();

            while (!res.equals("S")) {
                switch (res) {

                    case "1":
                        while (!res.equals("0")) {

                            System.out.println("-------- CONSULTAR --------------------\n");
                            System.out.println("-------- 1- Cursos ---------------------");
                            System.out.println("-------- 2- Disciplinas ------------");
                            System.out.println("-------- 3- Turmas -------------------");
                            System.out.println("-------- 0- Voltar -------------------");

                            do {

                                res = in.next().toUpperCase();

                                for (Integer i = 0; i < res.length(); i++) {
                                    validacao = !Character.isDigit(res.charAt(i));

                                    if (validacao) {
                                        System.out.println("Erro!Só sao aceites numeros");
                                        break;
                                    }
                                }

                            } while (validacao);

                            switch (res) {
                                case "1":
                                    Rogerio.getCursos();
                                    break;
                                case "2":
                                    Rogerio.getDisciplinas();
                                    break;
                                case "3":
                                    Rogerio.getTurmas();
                                    break;
                                case "0":
                                    Menu();
                                    break;

                                default:
                                    System.out.println("Opção Invalida");
                                    System.out.println("Introduza de novo a opção\n");
                                    break;
                            }
                        }
                        break;

                    case "2":
                        while (!res.equals("0")) {

                            System.out.println("-------- INSERIR ----------------------\n");
                            System.out.println("-------- 1- Cursos ---------------------");
                            System.out.println("-------- 2- Disciplinas ------------");
                            System.out.println("-------- 3- Turmas -------------------");
                            System.out.println("-------- 0- Voltar -------------------");
                            do {

                                res = in.next().toUpperCase();

                                for (Integer i = 0; i < res.length(); i++) {
                                    validacao = !Character.isDigit(res.charAt(i));

                                    if (validacao) {
                                        System.out.println("Erro!Só sao aceites numeros");
                                        break;
                                    }
                                }

                            } while (validacao);

                            switch (res) {
                                case "1":
                                    Rogerio.setCursos();
                                    break;
                                case "2":
                                    Rogerio.setDisciplinas();
                                    break;
                                case "3":
                                    Rogerio.setTurmas();
                                    break;
                                case "0":
                                    Menu();
                                    break;
                                default:
                                    System.out.println("Opção Invalida");
                                    System.out.println("Introduza de novo a opção\n");
                                    break;
                            }
                        }
                        break;
                    case "3":
                        while (!res.equals("0")) {

                            System.out.println("-------- Editar ----------------------\n");
                            System.out.println("-------- 1- Cursos ---------------------");
                            System.out.println("-------- 2- Disciplinas ------------");
                            System.out.println("-------- 3- Turmas -------------------");
                            System.out.println("-------- 0- Voltar -------------------");

                            do {

                                res = in.next().toUpperCase();

                                for (Integer i = 0; i < res.length(); i++) {
                                    validacao = !Character.isDigit(res.charAt(i));

                                    if (validacao) {
                                        System.out.println("Erro!Só sao aceites numeros");
                                        break;
                                    }
                                }

                            } while (validacao);

                            switch (res) {
                                case "1":
                                    Rogerio.editCursos();
                                    break;
                                case "2":
                                    Rogerio.editDisciplinas();
                                    break;
                                case "3":
                                    Rogerio.editTurmas();
                                    break;
                                case "0":
                                    Menu();
                                    break;
                                default:
                                    System.out.println("Opção Invalida");
                                    System.out.println("Introduza de novo a opção\n");
                                    break;
                            }
                        }
                        break;
                    case "4":
                        while (!res.equals("0")) {

                            System.out.println("-------- APAGAR -----------------------\n");
                            System.out.println("-------- 1- Cursos ---------------------");
                            System.out.println("-------- 2- Disciplinas ------------");
                            System.out.println("-------- 3- Turmas -------------------");
                            System.out.println("-------- 0- Voltar -------------------");

                            do {

                                res = in.next().toUpperCase();

                                for (Integer i = 0; i < res.length(); i++) {
                                    validacao = !Character.isDigit(res.charAt(i));

                                    if (validacao) {
                                        System.out.println("Erro!Só sao aceites numeros");
                                        break;
                                    }
                                }

                            } while (validacao);

                            switch (res) {
                                case "1":
                                    Rogerio.removeCursos();
                                    break;
                                case "2":
                                    Rogerio.removeDisciplinas();
                                    break;
                                case "3":
                                    Rogerio.removeTurmas();
                                    break;
                                case "0":
                                    Menu();
                                    break;
                                default:
                                    System.out.println("Opção Invalida");
                                    System.out.println("Introduza de novo a opção");
                                    break;
                            }
                        }
                        break;

                    case "V":
                        Sergio.displayP();
                        Menu();
                        break;

                    case "S":
                        System.out.println("A Sair...");
                        break;

                    default:
                        System.out.println("Opção Invalida");
                        System.out.println("Introduza de novo a opção\n");
                        Menu();
                        break;
                }

            }
        }
        System.out.println("Até à proxima!");
        exit(0);
    }

}
