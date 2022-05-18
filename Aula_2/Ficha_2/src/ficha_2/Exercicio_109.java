/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha_2;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Exercicio_109 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        
        
        System.out.println("Insira por favor a temperatura em graus Celsius: ");
        double cel=in.nextDouble();
        
        double fah;
        fah = (9/5) * cel + 32;
        
        System.out.println("A sua temperatura em graus fahnrenheit é de: "+fah);
        
        
        
    }
        
           
    
}
