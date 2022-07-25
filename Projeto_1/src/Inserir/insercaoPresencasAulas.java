package Inserir;

import static Inserir.insercaoAulas.aulas;
import static Inserir.insercaoMembro.membros;
import static Inserir.insercaoSocio.socios;

import java.util.ArrayList;
import java.util.Scanner;
import static Inserir.insercaoTipoSocio.tipoSocio;

public class insercaoPresencasAulas {

    public static ArrayList<Object> presencas = new ArrayList<>();

    public static void insercaoPresencasAulas() {
        Scanner in = new Scanner(System.in);
        String res, idAula;
        int idAulaNum, idTipoSocio,idMembro;

        boolean validacao = true;

        do {
            System.out.println("Pretende adicionar um novo registo de presencas?");
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

                System.out.println("Qual o id da Aula?");

                idAula = in.next();

                for (int i = 0; i < idAula.length(); i++) {

                    validacao = !Character.isDigit(idAula.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            idAulaNum = Integer.parseInt(idAula);

            if (!aulas.contains(idAulaNum)) {
                System.out.println("Id de aula inexistente.");
            }

        } while (!aulas.contains(idAulaNum));

        presencas.add(idAula);
        
                    do {

                System.out.println("Qual o IdMembro do sócio?");

                idMembro = in.nextInt();
                if (!membros.contains(idMembro)) {
                    System.out.println("Id de membro inexistente.");
                }

            } while (!membros.contains(idMembro));
            presencas.add(idMembro);
        do {
            do {

                System.out.println("Qual o IdTipoSocio do sócio?");

                idTipoSocio = in.nextInt();
                in.nextLine();
                if (!tipoSocio.contains(idTipoSocio)) {
                    System.out.println("Id de Tipo de Socio inexistente.");
                }

            } while (!tipoSocio.contains(idTipoSocio));
            socios.add(idTipoSocio);

            do {
                System.out.println("Pretende criar um novo registo de presencas?");

                res = in.next().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                } else if (res.equals("nao")) {
                    System.out.println("Até Breve");

                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));

        } while (res.equals("sim"));
    }

    public static void main(String[] args) {
        insercaoPresencasAulas();
    }
}
