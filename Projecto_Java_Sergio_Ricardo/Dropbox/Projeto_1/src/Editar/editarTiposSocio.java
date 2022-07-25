package Editar;

import static Inserir.insercaoTipoSocio.tipoSocio;
import java.util.Scanner;

public class editarTiposSocio {

    public static void editarTiposSocio() {

        Scanner in = new Scanner(System.in);

        String res, designaTipo = "";
        int id, desconto = 0;
        boolean validacao = true;

        do {
            System.out.println("Pretende editar um tipo de socio?");
            res = in.next();
            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Invalidos");
            }
        } while (!res.equals("sim") && !res.equals("nao"));
        do {
            do {
                System.out.println("Qual o id do tipo de sócio que pretende editar?");
                id = in.nextInt();

                if (!tipoSocio.contains(id)) {
                    System.out.println("Socio inexistente");
                }

            } while (!tipoSocio.contains(id));

            do {
                System.out.println("Qual a nova idade minima do socio?");
                res = in.next();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }
            } while (validacao);

            tipoSocio.set(tipoSocio.indexOf(id) + 1, res);

            do {
                System.out.println("Este socio necessita de encarregado de educaçao?");
                res = in.next().toLowerCase();

                switch (res) {
                    case "sim":
                        validacao = true;
                        tipoSocio.set(tipoSocio.indexOf(id) + 2, validacao);
                        break;
                    case "nao":
                        validacao = false;
                        tipoSocio.set(tipoSocio.indexOf(id) + 2, validacao);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {
                System.out.println("Insira aqui o novo valor de referencia mensal:");
                res = in.next();

                for (int i = 0; i < res.length(); i++) {
                    validacao = !Character.isDigit(res.charAt(i));

                    if (validacao) {
                        System.out.println("Erro!Só sao aceites numeros");
                        break;
                    }
                }

            } while (validacao);

            tipoSocio.set(tipoSocio.indexOf(id) + 3, res);

            do {
                System.out.println("Insira aqui a nova designaçao do Tipo de Sócio:");

                res = in.next();
                String resLimpo = res.replaceAll("\\s+", "");

                for (int i = 0; i < resLimpo.length(); i++) {

                    validacao = Character.isAlphabetic(resLimpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }
            } while (!validacao);

            tipoSocio.set(tipoSocio.indexOf(id) + 4, res);

            switch (designaTipo) {
                case "SMENOR":
                    desconto = 20;
                    break;
                case "SADULTO":
                    desconto = 0;
                    break;
                case "SSENIOR":
                    System.out.println("Desconto igual à idade!");
                    break;

            }

            tipoSocio.add(desconto);

            do {
                System.out.println("Pretende editar um socio?");
                res = in.next();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Invalidos");
                }
            } while (!res.equals("sim") && !res.equals("nao"));

        } while (res.equals("sim"));

    }

    public static void main(String[] args) {

        editarTiposSocio();
    }
}
