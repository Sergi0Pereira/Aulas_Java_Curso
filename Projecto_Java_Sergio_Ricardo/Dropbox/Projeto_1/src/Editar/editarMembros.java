package Editar;

import Inserir.Main;
import static Inserir.insercaoMembro.membros;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class editarMembros {

    public static void editarMembros() {

        Scanner in = new Scanner(System.in);
        String res, nomeMembro, nomeMembro_Limpo, nif_Membro, data_Nascimento = null;
        Boolean isDirigente = false, validacao = true;
        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;
        Integer id;

        do {
            System.out.println("Pretende Modificar um membro?");
            res = in.next().toLowerCase();

            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            } else if (res.equals("nao")) {
                System.out.println("Até Breve");
                Main.Menu();

            }
        } while (!res.equals("sim") && !res.equals("nao"));
        do {
            do {
                do {
                    System.out.println("Qual o id do membro que pretende editar?");
                    res = in.next();

                    for (int i = 0; i < res.length(); i++) {

                        validacao = !Character.isDigit(res.charAt(i));
                        if (validacao) {
                            System.out.println("Erro!Caracteres Inválidos");
                            break;
                        }
                    }

                } while (validacao);

                id = Integer.parseInt(res);

            } while (!Inserir.insercaoMembro.membros.contains(id));

            do {
                System.out.println("Insira aqui o nome do Membro:");

                nomeMembro = in.next();
                nomeMembro_Limpo = nomeMembro.replaceAll("\\s+", "");

                for (int i = 0; i < nomeMembro_Limpo.length(); i++) {

                    validacao = Character.isAlphabetic(nomeMembro_Limpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }
            } while (!validacao);

            membros.set(membros.indexOf(id) + 1, nomeMembro);

            do {
                System.out.println("Insira aqui o nif do Membro:");
                nif_Membro = in.next();

                for (int i = 0; i < nif_Membro.length(); i++) {

                    validacao = !Character.isDigit(nif_Membro.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            membros.set(membros.indexOf(id) + 2, nif_Membro);

            do {
                System.out.println("Este membro e dirigente?");
                res = in.next().toLowerCase();

                switch (res) {
                    case "sim":
                        isDirigente = true;
                        membros.set(membros.indexOf(id) + 3, isDirigente);
                        break;
                    case "nao":
                        isDirigente = false;
                        membros.set(membros.indexOf(id) + 3, isDirigente);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {
                try {
                    System.out.println("Insira a data de nascimento(Ex.Formato:2011-12-03): ");
                    data_Nascimento = in.next();
                    formatador_Data.parse(data_Nascimento);
                    membros.set(membros.indexOf(id) + 4, data_Nascimento);

                } catch (Exception e) {
                    System.out.println("Data Invalida");

                    data_Nascimento = null;

                }
            } while (data_Nascimento == null);

            do {
                System.out.println("Pretende modificar outro membro?");
                res = in.next().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (res.equals("nao")) {
                    System.out.println("Até Breve");

                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));

        } while (res.equals("sim"));

        System.out.println(membros);
    }

    public static void main(String[] args) {
        editarMembros();
    }
}
