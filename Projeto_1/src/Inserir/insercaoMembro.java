package Inserir;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class insercaoMembro {

    public static ArrayList<Object> membros = new ArrayList<>();

    public static void insercaoMembros() {

        Scanner in = new Scanner(System.in);
        String res, nomeMembro = "", nomeMembro_Limpo, nif_Membro, data_Nascimento = null;
        Boolean isDirigente = false, validacao = true;
        Integer idMembro = 1;
        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;

        do {
            System.out.println("Pretende adicionar um novo membro?");
            res = in.nextLine().toLowerCase();

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
                System.out.println("Insira aqui o nome do Membro:");

                nomeMembro = in.nextLine();
                nomeMembro_Limpo = nomeMembro.replaceAll("\\s+", "");

                for (int i = 0; i < nomeMembro_Limpo.length(); i++) {

                    validacao = Character.isAlphabetic(nomeMembro_Limpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }
            } while (!validacao);
            membros.add(idMembro);
            membros.add(nomeMembro);

            do {
                System.out.println("Insira aqui o nif do Membro:");
                nif_Membro = in.nextLine();

                for (int i = 0; i < nif_Membro.length(); i++) {

                    validacao = !Character.isDigit(nif_Membro.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            membros.add(nif_Membro);

            do {
                System.out.println("Este membro e dirigente?");
                res = in.nextLine().toLowerCase();

                switch (res) {
                    case "sim":
                        isDirigente = true;
                        membros.add(isDirigente);
                        break;
                    case "nao":
                        isDirigente = false;
                        membros.add(isDirigente);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));
            idMembro++;

            do {
                try {
                    System.out.println("Insira a data de nascimento(Ex.Formato:2011-12-03): ");
                    data_Nascimento = in.nextLine();
                    formatador_Data.parse(data_Nascimento);
                    membros.add(data_Nascimento);

                } catch (Exception e) {
                    System.out.println("Data Invalida");
                    System.out.println("Deseja anular a inserçao do membro?");
                    res = in.nextLine().toLowerCase();

                    do {
                        switch (res) {
                            case "sim":
                                membros.remove(membros.size() - 1);
                                membros.remove(nomeMembro);
                                membros.remove(isDirigente);
                                membros.remove(nif_Membro);
                                idMembro--;
                                membros.remove(idMembro);
                                break;
                            case "nao":
                                data_Nascimento = null;
                                break;
                            default:
                                System.out.println("Caracteres Inválidos");
                                System.out.println("Deseja anular a inserçao do membro?");
                                res = in.next().toLowerCase();

                                break;

                        }
                    } while (!res.equals("sim") && !res.equals("nao"));

                }
            } while (data_Nascimento == null);

         
            do {
                System.out.println("Pretende criar um novo membro?");
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
        System.out.println(membros);
    }

    

    public static void main(String[] args) {
        insercaoMembros();
    }
}
