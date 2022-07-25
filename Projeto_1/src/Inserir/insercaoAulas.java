package Inserir;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class insercaoAulas {

    public static ArrayList<Object> aulas = new ArrayList<>();

    public static void insercaoAulas() {
        Scanner in = new Scanner(System.in);
        String res;
        res = "";
        String data = null;
        LocalDate data_Pc = LocalDate.now();

        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;

        Integer id_Clube, id_Aula = 0;

        do {
            System.out.println("Pretende inserir uma nova aula?");
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
            id_Aula++;
            aulas.add(id_Aula);
            do {

                do {
                    System.out.println("Pretende inserir uma data? Se nao pretender será inserir a data actual.");
                    res = in.next().toLowerCase();
                    if (!res.equals("sim") && !res.equals("nao")) {
                        System.out.println("Caracteres Inválidos.");

                    }
                } while (!res.equals("sim") && !res.equals("nao"));

                if (res.equals("sim")) {

                    do {
                        try {
                            System.out.println("Insira a sua data: (Ex.Formato:2011-12-03)");
                            data = in.next();
                            formatador_Data.parse(data);
                            aulas.add(data);

                        } catch (Exception e) {
                            System.out.println("Data Invalida");
                            System.out.println("Deseja anular a inserçao da Aula?");
                            res = in.next().toLowerCase();

                            do {
                                switch (res) {
                                    case "sim":
                                        aulas.remove(aulas.size() - 1);
                                        aulas.remove(id_Aula);
                                        id_Aula--;
                                        break;
                                    case "nao":
                                        data = null;
                                        break;
                                    default:
                                        System.out.println("Caracteres Inválidos");
                                        System.out.println("Deseja anular a inserçao da Aula?");
                                        res = in.next().toLowerCase();
                                        break;
                                }
                            } while (!res.equals("sim") && !res.equals("nao") && data != null);

                        }
                    } while (data == null);
                } else if (res.equals("nao")) {

                    data = data_Pc.toString();

                    aulas.add(data);

                } else {

                    System.out.println("Caracteres Inválidos.");
                }

                do {
                    System.out.println("Pretende criar uma nova aula?");
                    res = in.next().toLowerCase();
                    if (!res.equals("sim") && !res.equals("nao")) {
                        System.out.println("Caracteres Inválidos.");
                    }
                    if (res.equals("nao")) {
                        System.out.println("Até Breve");
                        System.out.println(aulas);
                        //System.out.println(aulas);
                        Main.Menu();
                    }
                } while (!res.equals("sim") && !res.equals("nao"));
            } while (res.equals("sim") && res.equals("nao"));
        } while (res.equals("sim") || res.equals("nao"));

    }

    public static void main(String[] args) {
        insercaoAulas();

    }
}
