package Consultar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoAulas.aulas;
import java.util.Scanner;

public class consultaAulas {

    public static void consultaAulas() {

        Scanner in = new Scanner(System.in);
        String res = "sim";
        System.out.println(aulas);

        do {
            System.out.println("Pretende efetuar uma consulta das aulas?");
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

                System.out.println("\nQuer consultar todas as aulas?");
                res = in.next().toLowerCase();
                int x = 0, y = 1;
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (!aulas.isEmpty()) {
                    if (res.equals("sim")) {

                        while (y < aulas.size() + 1) {// penso que so o y comanda esta operaçao

                            System.out.println("\nId da Aula: " + aulas.get(x));
                            x += 2;

                            aulas.get(y);
                            System.out.println("Data da Aula: " + aulas.get(y));
                            y += 2;

                        }

                    } else if (res.equals("nao")) {
                        do {

                            System.out.println("\nQuer consultar aulas individualmente?");
                            res = in.next().toLowerCase();

                            if (res.equals("sim")) {

                                System.out.println("\nQual a Aula que pretende consultar?");
                                int id = in.nextInt();

                                if (aulas.contains(id)) {

                                    Object resp = aulas.get(aulas.indexOf(id));
                                    System.out.println("\nId da Aula: " + resp);

                                    resp = aulas.get(aulas.indexOf(id) + 1);
                                    System.out.println("Data da Aula: " + resp);

                                } else {
                                    System.out.println("\nId não existe.\n");
                                }
                            }
                        } while (res.equals("sim"));
                    }
                } else {
                    System.out.println("\nNão há aulas");
                    Menu();
                }
            } while (res.equals("sim"));

            do {
                System.out.println("\nQuer consultar outras aulas?");
                res = in.next().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (res.equals("nao")) {
                    System.out.println("Até Breve");

                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));
        } while (res.equals(
                "sim"));
    }

    public static void main(String[] args) {

        consultaAulas();

    }
}
