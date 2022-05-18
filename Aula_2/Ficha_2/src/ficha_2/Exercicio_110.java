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
public class Exercicio_110 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num,resto,soma=0; 
        System.out.println("Insira um numero entre 0 e 1000");
        num= in.nextInt();
        
        while(num>0){
        resto=num%10;
        soma+=resto;
        num/=10;
        }
        
        System.out.println(soma);
        
    }
    
}
