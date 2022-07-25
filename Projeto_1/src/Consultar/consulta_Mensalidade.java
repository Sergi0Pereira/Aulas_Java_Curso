package Consultar;

import static Inserir.Main.Menu;
import java.util.Scanner;
import static Inserir.insercaoMensalidade.mensalidade;

public class consulta_Mensalidade {

    public static void consultaMensalidades() {

        Scanner in = new Scanner(System.in);
        String res = "sim";

        do {
            System.out.println("Pretende efetuar uma consulta das mensalidades?");
            res = in.next().toLowerCase();

            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (res.equals("nao")) {
                System.out.println("Até Breve");
                Menu();

            }
        } while (!res.equals("sim") && !res.equals("nao"));

        do {

            do {

                System.out.println("\nQuer consultar todos as mensalidades?");
                res = in.next().toLowerCase();
                int x = 0, y = 1, z = 2, c = 3, v = 4, b = 5;
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (!mensalidade.isEmpty()) {
                    if (res.equals("sim")) {

                        while (b < mensalidade.size() + 1) {// penso que so o b comanda esta operaçao

                            System.out.println("\nId da mensalidade: " + mensalidade.get(x));
                            x += 6;
                            System.out.println("Id do Clube: " + mensalidade.get(y));
                            y += 6;
                            System.out.println("Id do membro: " + mensalidade.get(z));
                            z += 6;
                            System.out.println("Data limite de pagamento: " + mensalidade.get(c));
                            c += 6;
                            System.out.println("Mensalidade: " + mensalidade.get(v));
                            v += 6;
                            System.out.println("Está paga: " + mensalidade.get(b));
                            b += 6;

                        }

                    } else if (res.equals("nao")) {
                        do {

                            System.out.println("\nQuer consultar mensalidades individualmente?");
                            res = in.next().toLowerCase();

                            if (res.equals("sim")) {

                                System.out.println("\nQual a mensalidade que pretende consultar?");
                                int id = in.nextInt();

                                if (mensalidade.contains(id)) {
                                    Object resp = mensalidade.get(mensalidade.indexOf(id));
                                    System.out.println("\nId da mensalidade: " + resp);

                                    resp = mensalidade.get(mensalidade.indexOf(id) + 1);
                                    System.out.println("Id do Clube: " + resp);

                                    resp = mensalidade.get(mensalidade.indexOf(id) + 2);
                                    System.out.println("Id do membro: " + resp);

                                    resp = mensalidade.get(mensalidade.indexOf(id) + 3);
                                    System.out.println("Data limite de pagamento: " + resp);

                                    resp = mensalidade.get(mensalidade.indexOf(id) + 4);
                                    System.out.println("Mensalidade: " + resp);

                                    resp = mensalidade.get(mensalidade.indexOf(id) + 5);
                                    System.out.println("Está paga: " + resp);

                                } else {
                                    System.out.println("\nId não existe.\n");
                                }
                            }

                        } while (res.equals("sim"));
                    }
                } else {
                    System.out.println("\nNão há mensalidades");
                    Menu();
                }

            } while (res.equals("sim"));

            do {
                System.out.println("\nQuer consultar outras mensalidades?");
                res = in.next().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                }
                if (res.equals("nao")) {
                    System.out.println("Até Breve");

                    Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));
        } while (res.equals("sim"));
    }

    public static void main(String[] args) {

        mensalidade.add(1);
        mensalidade.add(1);
        mensalidade.add(1);
        mensalidade.add("2011-12-03");
        mensalidade.add(0);
        mensalidade.add(true);
        mensalidade.add(2);
        mensalidade.add(1);
        mensalidade.add(2);
        mensalidade.add("2011-12-03");
        mensalidade.add(100);
        mensalidade.add(false);
        consultaMensalidades();
    }
}
