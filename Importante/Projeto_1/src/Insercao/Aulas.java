package Insercao;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aulas {

    static ArrayList<Object> Aulas = new ArrayList<>();
    static ArrayList<Object> aulasFinal = new ArrayList<>();

    public static void dados_Aulas() {
        Scanner in = new Scanner(System.in);
        String res;
        res = "";
        String data = null;
        LocalDateTime data_Pc = LocalDateTime.now();

        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        Integer id_Clube, id_Aula = 0;

        do {
            System.out.println("Pretende inserir uma nova aula?");
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
                id_Aula++;

                Aulas.add(id_Aula);

                System.out.println("Pretende inserir uma data(Ex.Formato:2011-12-03T10:15:30)? Se nao pretender será inserir a data actual.");
                res = in.next().toLowerCase();
                if (res.equals("sim")) {

                    do {
                        try {
                            System.out.println("Insira a sua data: ");
                            data = in.next();
                            formatador_Data.parse(data);
                            Aulas.add(data);

                        } catch (Exception e) {
                            System.out.println("Data Invalida");
                            System.out.println("Deseja anular a inserçao da Aula?");
                            res = in.next().toLowerCase();

                            do {

                                if (res.equals("sim")) {
                                    Aulas.remove(Aulas.size() - 1);
                                    Aulas.remove(id_Aula);
                                    id_Aula--;
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
                    Aulas.add(data);
                }

            }

            System.out.println("Pretende inserir uma nova aula?");
            res = in.next().toLowerCase();
        } while (res.equals("sim"));

        System.out.println("Até Breve");

    }

}
