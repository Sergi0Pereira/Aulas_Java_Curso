package Apagar;

import Inserir.Main;
import static Inserir.insercaoSocio.socios;
import java.util.Scanner;

public class apagarSocio {

    public static void apagarSocios() {
        Scanner in = new Scanner(System.in);

        String res;
        boolean validacao = true;
        Integer idClube;
        int index;
        do {

            System.out.println("Pretende apagar os dados de um Socio?");
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
                System.out.println("Qual o identificador do Socio que pretende editar?");
                res = in.next();

                for (int i = 0; i < res.length() - 1; i++) {

                    validacao = Character.isLetter(res.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }
                if (Character.isDigit(res.length())) {
                    validacao = true;
                }

            } while (validacao);
            System.out.println(validacao);

            idClube = Integer.parseInt(res);

            index = socios.indexOf(idClube);

            if (!socios.contains(idClube)) {
                System.out.println("Clube nao encontrado");
            }

        } while (!socios.contains(idClube));

        for (int i = 0; i <= 4; i++) {
            socios.remove(index);
        }

    }

    public static void main(String[] args) {
        apagarSocios();
    }
}
