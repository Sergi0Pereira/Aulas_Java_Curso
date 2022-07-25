package Inserir;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

public class insercaoClube {

    public static ArrayList<Object> clubes = new ArrayList<>();

    public static void insercaoClube() {
        Scanner in = new Scanner(System.in);

        String res = "sim", nome_Clube, nomeClube_Limpo, nif_Clube = "", preco_Aula, capital_Social;
        Integer id_Clube = 1;
        Boolean validacao = true;

        do {
            System.out.println("Pretende criar um novo clube?");
            
            res = in.nextLine().toLowerCase();
            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (res.equals("nao")) {
                System.out.println("Até Breve");
                exit(0);

            }
        } while (!res.equals("sim") && !res.equals("nao"));

        do {
            do {
                System.out.println("Insira aqui o nome do Clube:");

                nome_Clube = in.nextLine();
                nomeClube_Limpo = nome_Clube.replaceAll(" ", "");

                for (int i = 0; i < nomeClube_Limpo.length(); i++) {
                    validacao = Character.isAlphabetic(nomeClube_Limpo.charAt(i));

                    if (!validacao) {
                        System.out.println("Erro!Números nao sao aceites!");

                        break;
                    }
                }

            } while (!validacao);
            clubes.add(id_Clube);
            clubes.add(nomeClube_Limpo);

            do {
                System.out.println("Insira aqui o nif do Clube:");

                nif_Clube = in.nextLine();

                for (int i = 0; i < nif_Clube.length(); i++) {
                    validacao = !Character.isDigit(nif_Clube.charAt(i));

                    if (validacao) {
                        System.out.println("Erro!Só sao aceites numeros");
                        break;
                    }
                }

            } while (validacao);

            clubes.add(nif_Clube);

            do {
                System.out.println("Insira aqui o capital Social:");
                capital_Social = in.nextLine();

                for (int i = 0; i < capital_Social.length(); i++) {
                    validacao = !Character.isDigit(capital_Social.charAt(i));

                    if (validacao) {
                        System.out.println("Erro!Só sao aceites numeros");
                        break;
                    }
                }

            } while (validacao);

            clubes.add(capital_Social);

            do {
                System.out.println("Insira aqui o preco por aula:");
                preco_Aula = in.nextLine();

                for (int i = 0; i < preco_Aula.length(); i++) {
                    validacao = !Character.isDigit(preco_Aula.charAt(i));

                    if (validacao) {
                        System.out.println("Erro!Só sao aceites numeros");
                        break;
                    }
                }

            } while (validacao);

            clubes.add(preco_Aula);

            System.out.println("Dados inseridos com sucesso!");
            System.out.println(clubes);
            id_Clube++;

            do {
                System.out.println("Pretende criar um novo clube?");
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

        insercaoClube();

    }
}
