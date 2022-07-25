package Insercao;

import java.util.ArrayList;
import java.util.Scanner;

public class Clube {

    final static ArrayList<Object> clubes = new ArrayList<>();

    public static void dados_Clube() {
        Scanner in = new Scanner(System.in);

        String res, nome_Clube, nif_Clube, preco_Aula, capital_Social;

        Integer id_Clube = 1;

        Boolean validacao = true;

        System.out.println("Pretende criar um novo clube?");
        res = in.next().toLowerCase();

        do {
            if (res.equals("sim")) {

                System.out.println("Vamos começar a nossa inserçao!");

                clubes.add(id_Clube);
                do {
                    System.out.println("Insira aqui o nome do Clube:\n");
                    nome_Clube = in.next();

                    for (int i = 0; i < nome_Clube.length(); i++) {
                        validacao = Character.isAlphabetic(nome_Clube.charAt(i));

                        if (!validacao) {
                            System.out.println("Erro!");

                            break;
                        }
                    }

                } while (!validacao);

                clubes.add(nome_Clube);

                do {
                    System.out.println("Insira aqui o nif do Clube:\n");
                    nif_Clube = in.next();

                    for (int i = 0; i < nif_Clube.length(); i++) {
                        validacao = Character.isAlphabetic(nif_Clube.charAt(i));

                        if (validacao) {
                            System.out.println("Erro!Números nao sao aceites!");
                            break;
                        }
                    }

                } while (validacao);

                clubes.add(nif_Clube);

                do {
                    System.out.println("Insira aqui o capital Social:\n");
                    capital_Social = in.next();

                    for (int i = 0; i < capital_Social.length(); i++) {
                        validacao = Character.isAlphabetic(capital_Social.charAt(i));

                        if (validacao) {
                            System.out.println("Erro!Números nao sao aceites!");
                            break;
                        }
                    }

                } while (validacao);

                clubes.add(capital_Social);

                do {
                    System.out.println("Insira aqui o preco por aula:\n");
                    preco_Aula = in.next();

                    for (int i = 0; i < preco_Aula.length(); i++) {
                        validacao = Character.isAlphabetic(preco_Aula.charAt(i));

                        if (validacao) {
                            System.out.println("Erro!Números nao sao aceites!");
                            break;
                        }
                    }

                } while (validacao);

                clubes.add(preco_Aula);

                System.out.println(clubes);
                System.out.println("Dados inseridos com sucesso!");
                id_Clube++;
                System.out.println("Pretende inserir um novo clube?");
                res = in.next();
                if (!res.equals("sim")) {
                    System.out.println("Até Breve");
                    break;
                }
            } else {
                System.out.println("Até Breve");

            }
        } while (res.equals("sim"));

    }

    public static void main(String[] args) {

        dados_Clube();
        System.out.println(clubes);

    }
}
