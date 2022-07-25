package Apagar;

import Inserir.Main;
import static Inserir.Main.Menu;
import static Inserir.insercaoTipoSocio.tipoSocio;
import java.util.Scanner;

public class apagarTipoSocio{
    
    public static void apagarTipoSocio(){
    
        Scanner in=new Scanner(System.in);
        
        String res;
        boolean validacao=true;
        int index,idTipoSocio;
        
            do {

            System.out.println("\nPretende apagar os dados de um clube?");
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
                System.out.println("\nQual o id do tipo de Socio que pretende apagar?");
                res = in.next();

                for (int i = 0; i < res.length(); i++) {

                    validacao = !Character.isDigit(res.charAt(i));
                    if (validacao) {
                        System.out.println("Erro!Caracteres Inválidos");
                        break;
                    }
                }

            } while (validacao);

            idTipoSocio = Integer.parseInt(res);
            
            index = tipoSocio.indexOf(idTipoSocio);
            
            
              if (!tipoSocio.contains(idTipoSocio)) {
                System.out.println("Clube nao encontrado");
            }

        } while (!tipoSocio.contains(idTipoSocio));

        for (int i = 0; i <= 6; i++) {
            tipoSocio.remove(index);
        }
        System.out.println("\nTipo de Socio Apagado!");
        Menu();

            
            
}
    public static void main(String[] args) {
        apagarTipoSocio();
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}