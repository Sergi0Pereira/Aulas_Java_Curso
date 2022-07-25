package Apagar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoClube.clubes;
import java.util.Scanner;

public class apagarClube {

    public static void apagarClube() {
        Scanner in = new Scanner(System.in);

        String res;
        boolean validacao = true;
        Integer idClube;
        int index;
        do {

            System.out.println("Pretende apagar os dados de um clube?");
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
            
            index = clubes.indexOf(idClube);
            
            if (!clubes.contains(idClube)) {
                System.out.println("Clube nao encontrado");
            }

        } while (!clubes.contains(idClube));

        for (int i = 0; i <= 4; i++) {
            clubes.remove(index);
        }
        System.out.println("\nClube Apagado!");
        Menu();

    }

    public static void main(String[] args) {
        apagarClube();

    }
}
