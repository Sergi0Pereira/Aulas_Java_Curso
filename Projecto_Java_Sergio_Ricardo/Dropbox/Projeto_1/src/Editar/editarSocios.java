package Editar;

import static Inserir.insercaoMembro.membros;
import static Inserir.insercaoSocio.socios;
import static Inserir.insercaoTipoSocio.tipoSocio;
import java.time.LocalDate;
import java.util.Scanner;


public class editarSocios {

    public static void editar_Socios() {
        Scanner in = new Scanner(System.in);
        String data, res = "", id;
        Integer idMembro, idTipoSocio;
        LocalDate data_Pc = LocalDate.now();
        data = data_Pc.toString();
        boolean validacao, isActive = true;

        do {
            do {
                System.out.println("Pretende editar um socio?");
                res = in.next();
            } while (!res.equals("sim") && !res.equals("nao"));
            do {
                System.out.println("Qual o identificador do socio que pretende editar?");
                id = in.next().toUpperCase();
                

            } while (!Inserir.insercaoSocio.socios.contains(id));

            socios.set(socios.indexOf(id) + 1, data);
            System.out.println("A sua data de registo foi atualizada.");

            do {
                System.out.println("O socio encontra-se ativo?");
                res = in.next().toLowerCase();

                switch (res) {
                    case "sim":
                        isActive = true;
                        socios.set(socios.indexOf(id) + 2, isActive);
                        break;
                    case "nao":
                        isActive = false;
                        socios.set(socios.indexOf(id) + 2, isActive);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {

                System.out.println("Qual o novo IdMembro do sócio?");

                idMembro = in.nextInt();
                if (!membros.contains(idMembro)) {
                    System.out.println("Id de membro inexistente.");
                }

            } while (!membros.contains(idMembro));

            socios.set(socios.indexOf(id) + 3, idMembro);

            do {

                System.out.println("Qual o novo IdTipoSocio do sócio?");

                idTipoSocio = in.nextInt();
                in.nextLine();
                if (!tipoSocio.contains(idTipoSocio)) {
                    System.out.println("Id de Tipo de Socio inexistente.");
                }

            } while (!tipoSocio.contains(idTipoSocio));

            socios.set(socios.indexOf(id) + 4, idTipoSocio);

            if (!Inserir.insercaoSocio.socios.contains(id)) {
                System.out.println("\nId não existe.\n");
            }

            System.out.println("\nQuer editar outro Socio?");
            res = in.next();
        } while (res.equals("sim"));

    }

    public static void main(String[] args) {

        editar_Socios();
    }
}
