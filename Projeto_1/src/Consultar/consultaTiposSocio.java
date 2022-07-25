package Consultar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoTipoSocio.tipoSocio;
import java.util.Scanner;

public class consultaTiposSocio {

    public static void consultaTiposSocio() {
        Scanner in = new Scanner(System.in);
        String res = "sim";
        int x = 0, y = 1, z = 2, c = 3, v = 4, b = 5, n = 6, id;

        do {
            System.out.println("Pretende efetuar uma consulta dos tipos de socio?");
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
                System.out.println("Pretende visualizar todos os tipos de socio?");
                res = in.next().toLowerCase();

                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
            } while (!res.equals("sim") && !res.equals("nao"));
            if (!tipoSocio.isEmpty()) {
                switch (res) {
                    case "sim":
                        while (n < tipoSocio.size() + 1) {

                            System.out.println("\nId do tipo Socio: " + tipoSocio.get(x));
                            x += 7;
                            System.out.println("Idade Miníma: " + tipoSocio.get(y));
                            y += 7;
                            System.out.println("Encarregado de Educação: " + tipoSocio.get(z));
                            z += 7;
                            System.out.println("Valor base Mensalidade: " + tipoSocio.get(c));
                            c += 7;
                            System.out.println("Designacao: " + tipoSocio.get(v));
                            v += 7;
                            System.out.println("Desconto: " + tipoSocio.get(b));
                            b += 7;
                            System.out.println("Clube: " + tipoSocio.get(n));
                            n += 7;

                        }
                        break;
                    case "nao":
                        do {
                            System.out.println("\nQual o tipo de socio que pretende consultar?");
                            id = in.nextInt();

                            if (tipoSocio.contains(id)) {
                                Object resp = tipoSocio.get(tipoSocio.indexOf(id));
                                System.out.println("\nId do Tipo Socio: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 1);
                                System.out.println("Idade Miníma: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 2);
                                System.out.println("Encarregado de Educação: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 3);
                                System.out.println("Valor base Mensalidade: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 4);
                                System.out.println("Designação: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 5);
                                System.out.println("Desconto: " + resp);

                                resp = tipoSocio.get(tipoSocio.indexOf(id) + 6);
                                System.out.println("Clube: " + resp);

                            } else {
                                System.out.println("\nId não existe.\n");
                            }

                        } while (!tipoSocio.contains(id));
                        break;
                }
            } else {
                System.out.println("\nNão há aulas");
                Menu();
            }
            do {
                System.out.println("\nQuer consultar outros tipos de Socio?");
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

        consultaTiposSocio();
    }
}
