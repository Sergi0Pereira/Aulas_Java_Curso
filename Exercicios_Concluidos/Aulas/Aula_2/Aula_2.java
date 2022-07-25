/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Aula_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada=new Scanner(System.in);
       
       String first;
       String last;
       
       System.out.println("Insira o seu primeiro e ultimo nome , separados por um espaço");
       
       first=entrada.next();
       last= entrada.next();
       
       System.out.println("As suas inciiais sao " + first.charAt(0)+ last.charAt(0) + ".");

       
       /*
       System.out.println("Insira o preço do produto:");
       double preco= entrada.nextDouble();
       
       
       System.out.println("Insira a quantidade do produto: ");
       int quantidade= entrada.nextInt();
       
       Double precoTotal = quantidade*preco;
       
       System.out.println("O preco total é de:" + precoTotal + "euros");
       */
     
        
        /* Scanner entrada= new Scanner(System.in);
        System.out.println ("Insira o seu nome:");
        String nome= entrada.nextLine(); // nextLine() é um metodo que
        System.out.println("O seu nome é: "+nome + ".");*/
    }
    
}
