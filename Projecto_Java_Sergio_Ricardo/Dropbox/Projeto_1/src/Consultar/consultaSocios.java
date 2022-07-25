package Consultar;

import static Inserir.insercaoSocio.socios;
import java.util.Scanner;

public class consultaSocios {

    public static void consultaSocios() {

        Scanner in = new Scanner(System.in);
        String res = "sim";
        while (res.equals("sim")) {
            do {

                System.out.println("\nQuer consultar todos os Socios?");
                res = in.next().toLowerCase();
                int x = 0, y = 1, z = 2, c = 3, v = 4;

                if (res.equals("sim")) {

                    while (v < socios.size() + 1) {

                        System.out.println("\nIdentificador: " + socios.get(x));
                        x += 5;
                        System.out.println("Data de Registo: " + socios.get(y));
                        y += 5;
                        System.out.println("Activo: " + socios.get(z));
                        z += 5;
                        System.out.println("Id de membro: " + socios.get(c));
                        c += 5;
                        System.out.println("Id Tipo de Socio: " + socios.get(v));
                        v += 5;

                    }// penso que so o v comanda esta operaçao

                }

            } while (res.equals("sim"));

            System.out.println("\nQual o Socio que pretende consultar?(Insira o identificador.Ex:SSENIOR1");
            Object id = in.next().toUpperCase();

            if (socios.contains(id)) {
                Object resp = socios.get(socios.indexOf(id));
                System.out.println("\nIdentificador: " + resp);

                resp = socios.get(socios.indexOf(id) + 1);
                System.out.println("Data de Registo: " + resp);

                resp = socios.get(socios.indexOf(id) + 2);
                System.out.println("Activo: " + resp);

                resp = socios.get(socios.indexOf(id) + 3);
                System.out.println("Id de membro: " + resp);

                resp = socios.get(socios.indexOf(id) + 4);
                System.out.println("Id Tipo de Socio: " + resp);

            } else {
                System.out.println("\nId não existe.\n");
            }

            System.out.println("\nQuer consultar outro Socio?");
            res = in.next().toLowerCase();

        }
    }

    public static void main(String[] args) {

        consultaSocios();
    }
}
