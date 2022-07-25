package Inserir;

import static Inserir.insercaoMembro.membros;
import static Inserir.insercaoSocio.socios;
import static Inserir.insercaoTipoSocio.tipoSocio;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

public class insercaoEncEduc {

    public static ArrayList<Object> EncEduca = new ArrayList<>();

    public static void insercaoEncEduca() {
        Scanner in = new Scanner(System.in);
        String res = "", idMembro, idSocio, idTipoSocio, idEncEd;
        boolean validacao = true;
        Integer idMembroNum, idSocioNum, idTipoSocioNum;

        do {
            System.out.println("Pretende adicionar um novo Encarregado de Educaçao?");
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
                System.out.println("Qual o id de Membro do Encarregado de educaçao?");
                System.out.println("Membros:\n"+membros);

                idMembro = in.nextLine();

                do {

                    for (int i = 0; i < idMembro.length(); i++) {
                        validacao = Character.isDigit(idMembro.charAt(i));

                        if (!validacao) {
                            System.out.println("Erro!Só sao aceites numeros");
                            break;
                        }
                    }

                } while (!validacao);

                idMembroNum = Integer.parseInt(idMembro);
                if (!insercaoMembro.membros.contains(idMembroNum)) {
                    System.out.println("Id de membro nao encontrado");
                    System.out.println("Deseja cancelar a inserçao?");
                    res = in.nextLine();
                    if (res.equals("sim")) {
                        Main.Menu();
                    }
                }

            } while (!insercaoMembro.membros.contains(idMembroNum));

            EncEduca.add(idMembroNum);

            do {
                System.out.println("Qual o id de Socio do Encarregado de educaçao?");
                System.out.println("Socios:\n"+ socios);

                idSocio = in.nextLine();

                do {

                    for (int i = 0; i < idSocio.length(); i++) {
                        validacao = Character.isDigit(idMembro.charAt(i));

                        if (!validacao) {
                            System.out.println("Erro!Só sao aceites numeros");
                            break;
                        }
                    }

                } while (!validacao);

                idSocioNum = Integer.parseInt(idSocio);
                if (!socios.contains(idSocioNum)) {
                    System.out.println("Id de sócio nao encontrado");
                    System.out.println("Deseja cancelar a inserçao?");
                    res = in.nextLine();
                    if (res.equals("sim")) {
                        Main.Menu();
                    }
                }

            } while (!membros.contains(idSocioNum));

            EncEduca.add(idSocioNum);

            do {
                System.out.println("Qual o id de Tipo de Socio do Encarregado de educaçao?");
                 System.out.println("Tipo de Socio:\n"+ tipoSocio);
                
                idTipoSocio = in.nextLine();

                do {

                    for (int i = 0; i < idTipoSocio.length(); i++) {
                        validacao = Character.isDigit(idTipoSocio.charAt(i));

                        if (!validacao) {
                            System.out.println("Erro!Só sao aceites numeros");
                            break;
                        }
                    }

                } while (!validacao);

                idTipoSocioNum = Integer.parseInt(idTipoSocio);
                if (!tipoSocio.contains(idTipoSocioNum)) {
                    System.out.println("Id de sócio nao encontrado");
                    System.out.println("Deseja cancelar a inserçao?");
                    res = in.nextLine();
                    if (res.equals("sim")) {
                        Main.Menu();
                    }
                }

            } while (!membros.contains(idTipoSocioNum));

            EncEduca.add(idSocioNum);

            idEncEd = idMembroNum + "-" + idSocioNum + "-" + idTipoSocioNum;

            EncEduca.add(idEncEd);

            System.out.println("Pretende adicionar um novo Encarregado de Educaçao?");
            res = in.nextLine().toLowerCase();

        } while (res.equals("sim"));
        Main.Menu();
 

    }

   

    public static void main(String[] args) {

        insercaoEncEduca();
    
        
    }
}
