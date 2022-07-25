package Inserir;

import static Inserir.insercaoAulas.aulas;
import static Inserir.insercaoClube.clubes;
import static Inserir.insercaoMembro.membros;
import static Inserir.insercaoSocio.socios;
import static Inserir.insercaoTipoSocio.tipoSocio;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class insercaoMensalidade {

    public static ArrayList<Object> mensalidade = new ArrayList<>();

    public static void insercaoMensalidade() {

        insercaoMensalidade rlc = new insercaoMensalidade();
        String res, identSocio, aulas, idadeSenior, data;
        int idMensa = 0, idMembro, desconto, idClube, aulasNum, valorAulas = 25;
        double idadeSeniorNum, mensa = 0;
        boolean validacao = true, isDirigente = true, isPaga = true;
        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Pretende adicionar uma nova mensalidade?");
            res = in.nextLine().toLowerCase();

            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            }
            if (res.equals("nao")) {
                System.out.println("Até Breve");
                Main.Menu();

            }
        } while (!res.equals("sim") && !res.equals("nao"));
        do {
            idMensa++;
            mensalidade.add(idMensa);

            do {

                System.out.println("Qual o id do Clube que o sócio frequenta?");

                idClube = in.nextInt();
                if (!clubes.contains(idClube)) {
                    System.out.println("Id de clube inexistente.");
                }

            } while (!clubes.contains(idClube));
            mensalidade.add(idClube);

            do {

                System.out.println("Qual o IdMembro do sócio?");

                idMembro = in.nextInt();
                if (!membros.contains(idMembro)) {
                    System.out.println("Id de membro inexistente.");
                }

            } while (!membros.contains(idMembro));

            mensalidade.add(idMembro);

            do {

                System.out.println("Qual a Identificaçao do sócio?");

                identSocio = in.next().toUpperCase();
                if (!socios.contains(identSocio)) {
                    System.out.println("Id de Tipo de Socio inexistente.");
                }
            } while (!socios.contains(identSocio));

            do {
                try {
                    System.out.println("Insira a data da Mensalidade(Ex.Formato:2011-12-03): ");
                    data = in.next();
                    formatador_Data.parse(data);
                } catch (Exception e) {
                    System.out.println("Data Invalida");
                    data = null;

                }
            } while (data == null);
            mensalidade.add(data);
            do {

                System.out.println("Insira aqui o numero de aulas que frequentou este mes:");

                aulas = in.next();

                for (int i = 0; i < aulas.length(); i++) {

                    validacao = !Character.isDigit(aulas.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);
            aulasNum = Integer.parseInt(aulas);

            identSocio = rlc.removeLastChar(identSocio);

            switch (identSocio) {
                case "SMENOR":
                    desconto = 20;
                    if (aulasNum > 5) {
                        mensa = 100 - (100 * (desconto / 100));
                    } else {
                        mensa = aulasNum * valorAulas;
                        mensa -= (mensa * (desconto / 100));
                    }
                    break;
                case "SADULTO":
                    do {
                        System.out.println("O SADULTO é dirigente?");
                        res = in.next().toLowerCase();

                        switch (res) {
                            case "sim":
                                isDirigente = true;
                                mensa = 0;
                                break;
                            case "nao":
                                isDirigente = false;
                                if (aulasNum > 5) {
                                    mensa = 100;
                                } else {
                                    mensa = aulasNum * valorAulas;
                                }
                                break;
                            default:
                                System.out.println("Caracteres Inválidos");
                                break;
                        }

                    } while (!res.equals("sim") && !res.equals("nao"));

                    break;
                case "SSENIOR":
                    do {
                        System.out.println("O SSENIOR é dirigente?");
                        res = in.next().toLowerCase();
                        switch (res) {
                            case "sim":
                                isDirigente = true;
                                mensa = 0;
                                break;
                            case "nao":
                                isDirigente = false;
                                do {
                                    System.out.println("Qual a sua idade?");
                                    idadeSenior = in.next();

                                    for (int i = 0; i < idadeSenior.length(); i++) {

                                        validacao = !Character.isDigit(idadeSenior.charAt(i));
                                        if (validacao) {
                                            System.out.println("Erro!Caracteres Inválidos");
                                            break;
                                        }
                                    }

                                } while (validacao);
                                idadeSeniorNum = Double.parseDouble(idadeSenior);
                                //System.out.println("IDADE: "+idadeSeniorNum);
                                mensa = (150 - (150 * (idadeSeniorNum / 100)));
                                break;
                            default:
                                System.out.println("Caracteres Inválidos");
                                break;
                        }
                    } while (!res.equals("sim") && !res.equals("nao"));
            }
            mensalidade.add(mensa);
            do {
                System.out.println("A mensalidade encontra-se paga?");
                res = in.next().toLowerCase();
                switch (res) {
                    case "sim":
                        isPaga = true;
                        mensalidade.add(isPaga);
                        break;
                    case "nao":
                        isPaga = false;
                        mensalidade.add(isPaga);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {
                System.out.println("\nQuer inserir mais mensalidades?");
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
        clubes.add(1);
        membros.add(1);
        socios.add("SSENIOR1");

        insercaoMensalidade();
    }

    private String removeLastChar(String identSocio) {
        return identSocio.substring(0, identSocio.length() - 1);
    }
}
