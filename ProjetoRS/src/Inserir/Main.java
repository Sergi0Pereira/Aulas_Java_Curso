package Inserir;

import static java.lang.System.exit;
import java.util.Scanner;

import static Inserir.insercaoAulas.insercaoAulas;
import static Inserir.insercaoClube.insercaoClube;
import static Inserir.insercaoEncEduc.insercaoEncEduca;
import static Inserir.insercaoMembro.insercaoMembros;
import static Inserir.insercaoMensalidade.insercaoMensalidade;
import static Inserir.insercaoPresencasAulas.insercaoPresencasAulas;
import static Inserir.insercaoSocio.insercaoSocio;
import static Inserir.insercaoTipoSocio.insercaoTipoSocio;

import static Consultar.consultaAulas.consultaAulas;
import static Consultar.consultaClube.consultaClube;
import static Consultar.consultaEncEd.consulta_encEduca;
import static Consultar.consultaMembros.consultaMembros;
import static Consultar.consultaSocios.consultaSocios;
import static Consultar.consultaTiposSocio.consultaTiposSocio;
import static Consultar.consulta_Mensalidade.consultaMensalidades;

import static Editar.editarClube.editarClube;
import static Editar.editarMembros.editarMembros;
import static Editar.editarAulas.editarAulas;
import static Editar.editarSocios.editar_Socios;
import static Editar.editarTiposSocio.editarTiposSocio;

import static Apagar.apagarClube.apagarClube;
import static Apagar.apagarMembro.apagarMembros;
import static Apagar.apagarSocio.apagarSocios;
import static Apagar.apagarTipoSocio.apagarTipoSocio;

public class Main {

    public static void Menu() {

        System.out.println("\nBem Vindo \n");

        System.out.println("Esta é a sua Base de Dados. \n");

        System.out.println("O que pretende fazer? \n");
        String res = "99999999";

        boolean validacao = true;
        while (!res.equals("S")) {

            res = "99999999";
            System.out.println("-------- 1- Consultar -----------");
            System.out.println("-------- 2- Inserir -------------");
            System.out.println("-------- 3- Editar --------------");
            System.out.println("-------- 4- Apagar --------------");
            System.out.println("-------- S- Sair ----------------");

            Scanner in = new Scanner(System.in);

            res = in.next().toUpperCase();

            while (!res.equals("S")) {
                switch (res) {
                    case "1":
                        while (!res.equals("0")) {

                            System.out.println("-------- CONSULTAR --------------------\n");
                            System.out.println("-------- 1- Clube ---------------------");
                            System.out.println("-------- 2- Tipos de Socio ------------");
                            System.out.println("-------- 3- Membros -------------------");
                            System.out.println("-------- 4- Socios --------------------");
                            System.out.println("-------- 5- Ecarregados de Educação ---");
                            System.out.println("-------- 6- Aulas ---------------------");
                            System.out.println("-------- 7- Presenças -----------------");
                            System.out.println("-------- 8- Mensalidade ---------------");
                            System.out.println("-------- 0- Voltar --------------------");

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
                                    consultaClube();
                                    break;
                                case "2":
                                    consultaTiposSocio();
                                    break;
                                case "3":
                                    consultaMembros();
                                    break;
                                case "4":
                                    consultaSocios();
                                    break;
                                case "5":
                                    consulta_encEduca();
                                    break;
                                case "6":
                                    consultaAulas();
                                    break;
                                case "7":
                                    //em falta
                                    break;
                                case "8":
                                    consultaMensalidades();
                                    break;
                                case "0":
                                    System.out.println("A Sair...");
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
                            System.out.println("-------- 1- Clube ---------------------");
                            System.out.println("-------- 2- Tipos de Socio ------------");
                            System.out.println("-------- 3- Membros -------------------");
                            System.out.println("-------- 4- Socios --------------------");
                            System.out.println("-------- 5- Encarregados de Educação --");
                            System.out.println("-------- 6- Aulas ---------------------");
                            System.out.println("-------- 7- Presenças -----------------");
                            System.out.println("-------- 8- Mensalidade ---------------");
                            System.out.println("-------- 0- Voltar --------------------");

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
                                    insercaoClube();
                                    break;
                                case "2":
                                    insercaoTipoSocio();
                                    break;
                                case "3":
                                    insercaoMembros();
                                    break;
                                case "4":
                                    insercaoSocio();
                                    break;
                                case "5":
                                    insercaoEncEduca();
                                    break;
                                case "6":
                                    insercaoAulas();
                                    break;
                                case "7":
                                    insercaoPresencasAulas();
                                    break;
                                case "8":
                                    insercaoMensalidade();
                                    break;
                                case "0":
                                    System.out.println("A Sair...");
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

                            System.out.println("-------- EDITAR -----------------------\n");
                            System.out.println("-------- 1- Clube ---------------------");
                            System.out.println("-------- 2- Tipos de Socio ------------");
                            System.out.println("-------- 3- Membros -------------------");
                            System.out.println("-------- 4- Socios --------------------");
                            System.out.println("-------- 5- Ecarregados de Educação ---");
                            System.out.println("-------- 6- Aulas ---------------------");
                            System.out.println("-------- 7- Presenças -----------------");
                            System.out.println("-------- 8- Mensalidade ---------------");
                            System.out.println("-------- 0- Voltar --------------------");

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
                                    editarClube();
                                    break;
                                case "2":
                                    editarTiposSocio();
                                    break;
                                case "3":
                                    editarMembros();
                                    break;
                                case "4":
                                    editar_Socios();
                                    break;
                                case "5":

                                    break;
                                case "6":
                                    editarAulas();
                                    break;
                                case "7":
                                    break;
                                case "8":

                                    break;
                                case "0":
                                    System.out.println("A Sair...");
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
                            System.out.println("-------- 1- Clube ---------------------");
                            System.out.println("-------- 2- Tipos de Socio ------------");
                            System.out.println("-------- 3- Membros -------------------");
                            System.out.println("-------- 4- Socios --------------------");
                            System.out.println("-------- 5- Encarregados de Educação --");
                            System.out.println("-------- 6- Aulas ---------------------");
                            System.out.println("-------- 7- Presenças -----------------");
                            System.out.println("-------- 8- Mensalidade ---------------");
                            System.out.println("-------- 0- Voltar --------------------");

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
                                    apagarClube();
                                    break;
                                case "2":
                                    apagarTipoSocio();
                                    break;
                                case "3":
                                    apagarMembros();
                                    break;
                                case "4":
                                    apagarSocios();
                                    break;
                                case "5":
                                    break;
                                case "6":
                                    break;
                                case "7":
                                    break;
                                case "8":

                                    break;
                                case "0":
                                    System.out.println("A Sair...");
                                    Menu();
                                    break;
                                default:
                                    System.out.println("Opção Invalida");
                                    System.out.println("Introduza de novo a opção");
                                    break;
                            }
                        }
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

    public static void main(String[] args) {
        Menu();
    }

}
