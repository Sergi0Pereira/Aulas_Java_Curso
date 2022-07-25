package Editar;

import Inserir.Main;
import static Inserir.insercaoAulas.aulas;
import static java.lang.System.exit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class editarAulas {

    public static void editarAulas() {
        Scanner in = new Scanner(System.in);
        String res;
        res = "";
        String data = null;
        LocalDate data_Pc = LocalDate.now();

        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;

        do {
            System.out.println("Pretende modificar uma aula?");
            res = in.next().toLowerCase();
            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (res.equals("nao")) {
                System.out.println("Até Breve");
                exit(0);
            }

        } while (!res.equals("sim") && !res.equals("nao"));

        do {
            if (res.equals("sim")) {

                System.out.println("Qual a aula que pretende modificar?\n");
                int aula = in.nextInt();

                if (aulas.contains(aula)) {

                    System.out.println("Pretende modificar a data? Se nao pretender será inserir a data actual.");
                    res = in.next().toLowerCase();
                    if (res.equals("sim")) {

                        do {
                            try {
                                System.out.println("Insira a sua data(Ex.Formato:2011-12-03): ");
                                data = in.next();
                                formatador_Data.parse(data);
                                aulas.set(aulas.indexOf(aula) + 1, data);

                            } catch (Exception e) {
                                System.out.println("Data Invalida");
                                System.out.println("Deseja anular a inserçao da Aula?");
                                res = in.next().toLowerCase();

                                do {

                                    if (res.equals("sim")) {
                                        aulas.remove(aulas.indexOf(aula) + 1);
                                        break;
                                    } else if (res.equals("nao")) {

                                        data = null;

                                    } else {
                                        System.out.println("Caracteres Inválidos");
                                        System.out.println("Deseja anular a inserçao da Aula?");
                                        res = in.next().toLowerCase();
                                    }
                                } while (!res.equals("sim") && !res.equals("nao"));

                            }
                        } while (data == null);
                    } else {
                        data = data_Pc.toString();
                        aulas.set(aulas.indexOf(aula) + 1, data);
                    }
                }
            }
            do {
                System.out.println("Pretende modificar outra aula?\n");
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

        
    }

    public static void main(String[] args) {

        editarAulas();
    }
}
