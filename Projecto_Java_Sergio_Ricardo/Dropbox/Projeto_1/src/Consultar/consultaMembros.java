package Consultar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoMembro.membros;
import java.util.Scanner;

public class consultaMembros {

    public static void consultaMembros() {

        Scanner in = new Scanner(System.in);
        String res = "sim";

        do {
            System.out.println("Pretende efetuar uma consulta dos membros?");
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

                System.out.println("\nQuer consultar todos os membros?");
                res = in.next().toLowerCase();
                int x = 0, y = 1, z = 2, c = 3, v = 4;
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (!membros.isEmpty()) {
                    if (res.equals("sim")) {

                        while (v < membros.size() + 1) {// penso que so o v comanda esta operaçao

                            System.out.println("\nId do membro: " + membros.get(x));
                            x += 5;
                            System.out.println("Nome do membro: " + membros.get(y));
                            y += 5;
                            System.out.println("NIF do membro: " + membros.get(z));
                            z += 5;
                            System.out.println("Dirigente: " + membros.get(c));
                            c += 5;
                            System.out.println("Data Nascimento: " + membros.get(v));
                            v += 5;

                        }

                    } else if (res.equals("nao")) {
                        do {

                            System.out.println("\nQuer consultar membros individualmente?");
                            res = in.next().toLowerCase();

                            if (res.equals("sim")) {

                                System.out.println("\nQual o membro que pretende consultar?");
                                int id = in.nextInt();

                                if (membros.contains(id)) {
                                    Object resp = membros.get(membros.indexOf(id));
                                    System.out.println("\nId do membro: " + resp);

                                    resp = membros.get(membros.indexOf(id) + 1);
                                    System.out.println("Nome do membro: " + resp);

                                    resp = membros.get(membros.indexOf(id) + 2);
                                    System.out.println("NIF do membro: " + resp);

                                    resp = membros.get(membros.indexOf(id) + 3);
                                    System.out.println("Dirigente: " + resp);

                                    resp = membros.get(membros.indexOf(id) + 4);
                                    System.out.println("Data Nascimento: " + resp);

                                } else {
                                    System.out.println("\nId não existe.\n");
                                }
                            }

                        } while (res.equals("sim"));
                    }
                } else {
                    System.out.println("\nNão há membros");
                    Menu();
                }

            } while (res.equals("sim"));

            do {
                System.out.println("\nQuer consultar outros membros?");
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

        Scanner in = new Scanner(System.in);

        consultaMembros();
    }
}
