/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha_3;

import java.util.Scanner;


public class Exercicio_100 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Double x,y;
        System.out.println("Insira por favor o primeiro numero: ");
        x=in.nextDouble();
        System.out.println("Insira por favor o segundo numero: ");
        y=in.nextDouble();

        if(x==y){
            System.out.println("Os numeros sao iguais");
        }
        else{
            System.out.println("Os numeros nao sao iguais");
        }
    }
}
