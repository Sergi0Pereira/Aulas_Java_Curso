package Consultar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoEncEduc.EncEduca;
import java.util.Scanner;

public class consultaEncEd {

    public static void consulta_encEduca() {

        Scanner in = new Scanner(System.in);
        String res = "sim";

        do {
            System.out.println("Pretende efetuar uma consulta dos Encarregados de Educação?");
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

                System.out.println("\nQuer consultar todos os Encarregados de Educação?");
                res = in.next().toLowerCase();
                int x = 0, y = 1, z = 2, c = 3;

                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (!EncEduca.isEmpty()) {
                    if (res.equals("sim")) {

                        while (c < EncEduca.size() + 1) {// penso que so o v comanda esta operaçao 

                            System.out.println("\nId do membro: " + EncEduca.get(x));
                            x += 4;
                            System.out.println("Id do socio: " + EncEduca.get(y));
                            y += 4;
                            System.out.println("Id Tipo de socio: " + EncEduca.get(z));
                            z += 4;
                            System.out.println("Identificador: " + EncEduca.get(c));
                            c += 4;

                        }

                    } else if (res.equals("nao")) {
                        do {
                            System.out.println("\nQuer consultar Encarregados de Educação individualmente?");
                            res = in.next().toLowerCase();

                            if (res.equals("sim")) {

                                System.out.println("\nQual o Encarregado de Educação que pretende consultar?(Insira o identificador)");
                                Object id = in.next().toUpperCase();

                                if (EncEduca.contains(id)) {
                                    Object resp = EncEduca.get(EncEduca.indexOf(id));
                                    System.out.println("\nIdentificador: " + resp);
                                    resp = EncEduca.get(EncEduca.indexOf(id) - 1);
                                    System.out.println("Id Tipo de socio: " + resp);
                                    resp = EncEduca.get(EncEduca.indexOf(id) - 2);
                                    System.out.println("Id do socio: " + resp);
                                    resp = EncEduca.get(EncEduca.indexOf(id) - 3);
                                    System.out.println("Id do membro: " + resp);

                                } else {
                                    System.out.println("\nIdentificador não existe.\n");
                                }
                            }
                        } while (res.equals("sim"));
                    }
                } else {
                    System.out.println("\nNão há Encarregados de Educação");
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

        } while (res.equals("sim"));

    }

    public static void main(String[] args) {

        consulta_encEduca();

    }
}
