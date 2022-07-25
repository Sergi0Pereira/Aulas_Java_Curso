package Inserir;

import static Inserir.insercaoClube.clubes;
import static Inserir.insercaoMembro.membros;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class insercaoTipoSocio {

    public static ArrayList<Object> tipoSocio = new ArrayList<>();

    public static void insercaoTipoSocio() {

        Scanner in = new Scanner(System.in);

        String res = "sim", idadeMinima, valorRefMensal, designaTipo, designaTipoLimpo, idClube;
        Boolean precisEncEd = false, validacao = true;
        int idClubeInt, idTipoSocio=1, desconto = 0;
        DateTimeFormatter formatador_Data = DateTimeFormatter.ISO_LOCAL_DATE;

        do {
            System.out.println("Pretende adicionar um novo tipo de Socio?");
            res = in.nextLine().toLowerCase();

            if (!res.equals("sim") && !res.equals("nao")) {
                System.out.println("Caracteres Inválidos.");
            } else if (res.equals("nao")) {
                System.out.println("Até Breve");
                Main.Menu();

            }
        } while (!res.equals("sim") && !res.equals("nao"));
     
       
        do {
            do {
                System.out.println("Insira aqui a idade minima do tipo de Socio:");
                idadeMinima = in.nextLine();

                for (int i = 0; i < idadeMinima.length(); i++) {

                    validacao = !Character.isDigit(idadeMinima.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);
             tipoSocio.add(idTipoSocio);
            tipoSocio.add(idadeMinima);
            idTipoSocio++;

            do {
                System.out.println("Este socio necessita de encarregado de educaçao?");
                res = in.nextLine().toLowerCase();

                switch (res) {
                    case "sim":
                        precisEncEd = true;
                        tipoSocio.add(precisEncEd);
                        break;
                    case "nao":
                        precisEncEd = false;
                        tipoSocio.add(precisEncEd);
                        break;
                    default:
                        System.out.println("Caracteres Inválidos");
                        break;
                }
            } while (!res.equals("sim") && !res.equals("nao"));

            do {
                System.out.println("Insira aqui o valor de referencia mensal:");
                valorRefMensal = in.nextLine();

                for (int i = 0; i < valorRefMensal.length(); i++) {
                    validacao = !Character.isDigit(valorRefMensal.charAt(i));

                    if (validacao) {
                        System.out.println("Erro!Só sao aceites numeros");
                        break;
                    }
                }

            } while (validacao);
            tipoSocio.add(valorRefMensal);

            do {
                System.out.println("Insira aqui a designaçao do Tipo de Sócio:");

                designaTipo = in.nextLine();
                designaTipoLimpo = designaTipo.replaceAll("\\s+", "");

                for (int i = 0; i < designaTipoLimpo.length(); i++) {

                    validacao = Character.isAlphabetic(designaTipoLimpo.charAt(i));
                    if (!validacao) {
                        System.out.println("Erro!Caracteres Inválidos!");
                        break;
                    }

                }

            } while (!validacao);
            tipoSocio.add(designaTipo);

            designaTipo.toUpperCase();

            switch (designaTipo) {
                case "SMENOR":
                    desconto = 20;
                    break;
                case "SADULTO":
                    desconto = 0;
                    break;
                case "SSENIOR":
                    System.out.println("Desconto igual à idade!");
                    break;

            }

            tipoSocio.add(desconto);

            do {

                System.out.println("Qual o id do Clube que o sócio frequenta?");
                System.out.println("Clubes: \n" + clubes);
                idClube = in.nextLine();

                do {
                    for (int i = 0; i < idClube.length(); i++) {
                        validacao = Character.isDigit(idClube.charAt(i));

                        if (!validacao) {
                            System.out.println("Erro!Só sao aceites numeros");
                            break;
                        }
                    }

                } while (!validacao);

                idClubeInt = Integer.parseInt(idClube);

                if (!clubes.contains(idClubeInt)) {
                    System.out.println("Id de sócio nao encontrado");
                }

            } while (!clubes.contains(idClubeInt));
            
            tipoSocio.add(idClubeInt);
           

            do {
                System.out.println("Pretende criar um novo tipo de sócio?");
                res = in.nextLine().toLowerCase();
                if (!res.equals("sim") && !res.equals("nao")) {
                    System.out.println("Caracteres Inválidos.");
                } else if (res.equals("nao")) {
                    System.out.println("Até Breve");
System.out.println(tipoSocio);
                    Main.Menu();
                }
            } while (!res.equals("sim") && !res.equals("nao"));

        } while (res.equals("sim"));
        

    }

    public static void main(String[] args) {
        insercaoTipoSocio();

        System.out.println(tipoSocio);
    }
}
