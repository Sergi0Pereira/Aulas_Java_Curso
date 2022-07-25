package Inserir;

import static Inserir.insercaoMembro.membros;
import static Inserir.insercaoTipoSocio.tipoSocio;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class insercaoSocio {

    public static ArrayList<Object> socios = new ArrayList<>();

    public static void insercaoSocio() {

        String res = "", identificador, data;
        Integer idMembro, idTipoSocio, x = 0, y = 0, z = 0;
        Boolean isActive = false, validacao = false;
        LocalDate data_Pc = LocalDate.now();

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Pretende adicionar um novo Socio?");

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
                System.out.println("Insira aqui o identificador do Socio: (Ex:SMENOR....");

                identificador = in.next().toUpperCase();

                if (identificador.matches("^SMENOR||SADULTO||SSENIOR$*")) {
                    validacao = true;
                    switch (identificador) {
                        case "SMENOR":
                            x++;
                            socios.add(identificador + x);
                            break;
                        case "SADULTO":
                            y++;
                            socios.add(identificador + y);
                            break;
                        case "SSENIOR":
                            z++;
                            socios.add(identificador + z);
                            break;
                    }
                    break;
                } else {
                    validacao = false;
                    System.out.println("Identificador nao existente.");
                }

            } while (!validacao);

            data = data_Pc.toString();
            socios.add(data);

            do {
                System.out.println("O socio encontra-se ativo?");
                res = in.next().toLowerCase();

                switch (res) {
                    case "sim":
                        isActive = true;
                        socios.add(isActive);
                        break;
                    case "nao":
                        isActive = false;
                        socios.add(isActive);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {

                System.out.println("Qual o IdMembro do sócio?");
                System.out.println("Membros:\n"+membros);

                idMembro = in.nextInt();
                if (!membros.contains(idMembro)) {
                    System.out.println("Id de membro inexistente.");
                }

            } while (!membros.contains(idMembro));
            socios.add(idMembro);

            do {

                System.out.println("Qual o IdTipoSocio do sócio?");
                System.out.println("Tpo de Socios\n:" + tipoSocio);
                idTipoSocio = in.nextInt();
                in.nextLine();
                if (!tipoSocio.contains(idTipoSocio)) {
                    System.out.println("Id de Tipo de Socio inexistente.");
                }

            } while (!tipoSocio.contains(idTipoSocio));
            socios.add(idTipoSocio);
            do {
                System.out.println("Pretende criar um novo Socio?");
                res = in.next().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (res.equals("nao")) {
                    System.out.println("Até Breve");
                    System.out.println(socios);
                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));
        } while (res.equals("sim"));

    }

    

    public static void main(String[] args) {
        insercaoSocio();
      
        System.out.println(socios);

    }
}
