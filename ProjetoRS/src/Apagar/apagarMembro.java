package Apagar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoMembro.membros;
import java.util.Scanner;

public class apagarMembro {

    public static void apagarMembros() {
        Scanner in = new Scanner(System.in);

        String res;
        boolean validacao = true;
        Integer idClube;
        int index;
        do {

            System.out.println("\nPretende apagar os dados de um membro?");
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
                System.out.println("\nQual o id do membro que pretende apagar");
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

            index = membros.indexOf(idClube);

            if (!membros.contains(idClube)) {
                System.out.println("Clube nao encontrado");
            }

        } while (!membros.contains(idClube));

        for (int i = 0; i <= 4; i++) {
            membros.remove(index);
        }
        System.out.println("\nMembro Apagado!");
        Menu();

    }

    public static void main(String[] args) {
        apagarMembros();
    }
}
