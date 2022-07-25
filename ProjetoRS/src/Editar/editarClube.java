package Editar;

import Inserir.Main;
import static Inserir.insercaoClube.clubes;
import static Inserir.Main.Menu;

import java.util.Scanner;

public class editarClube {

    public static void editarClube() {
        Scanner in = new Scanner(System.in);

        String res, resLimpo;
        boolean validacao = true;

        Integer idClube;

        do {
            System.out.println("Pretende editar os dados de um clube?");
            res = in.next().toLowerCase();

            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (res.equals("nao")) {
                System.out.println("Até Breve");
                Main.Menu();

            }

        } while (!res.equals("sim") && !res.equals("nao"));
        do {
            do {
                System.out.println("Qual o id do Clube que pretende editar?");
                res = in.next();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            idClube = Integer.parseInt(res);

        } while (!Inserir.insercaoClube.clubes.contains(idClube));

        do {
            do {
                System.out.println("Insira aqui o novo nome do Clube:");

                res = in.nextLine();
                resLimpo = res.replaceAll("\\s+", "");

                for (int i = 0; i < resLimpo.length(); i++) {

                    validacao = Character.isAlphabetic(resLimpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }
            } while (!validacao);

            clubes.set(clubes.indexOf(idClube) + 1, res);

            do {
                System.out.println("Insira aqui o novo nif do Clube:");
                res = in.nextLine();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            clubes.set(clubes.indexOf(idClube) + 2, res);

            do {
                System.out.println("Insira aqui o novo Capital Social do Clube:");
                res = in.nextLine();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            clubes.set(clubes.indexOf(idClube) + 3, res);

            do {
                System.out.println("Insira aqui o novo preco por aula:");
                res = in.nextLine();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            clubes.set(clubes.indexOf(idClube) + 4, res);
            do {
                System.out.println("Pretende modificar outro clube?");
                res = in.nextLine().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (res.equals("nao")) {
                    System.out.println("Até Breve");

                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));

        } while (res.equals("sim"));

    }

    public static void main(String[] args) {
        editarClube();
    }
}
