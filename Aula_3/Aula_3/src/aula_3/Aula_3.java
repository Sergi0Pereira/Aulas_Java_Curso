/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_3;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Aula_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        System.out.println("Insira aqui o numero do mes pretendido: ");
        Scanner in= new Scanner(System.in);
        mes= in.nextInt();
        
        
        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            default:
                System.out.println("O seu mes nao esta na lista");
                    
        }
        if(mes==1){
            System.out.println("Janeiro");}
        else if(mes==2){
            System.out.println("Fevereiro");}
        else if(mes==3){
            System.out.println("Março");}
        else if(mes==4){
            System.out.println("Abril");}
        else if(mes==5){
            System.out.println("Maio");}
        else if(mes==6){
            System.out.println("Junho");}
        else{
            System.out.println("O seu mes nao esta na lista");
        }
            
        }
        

    }
    

