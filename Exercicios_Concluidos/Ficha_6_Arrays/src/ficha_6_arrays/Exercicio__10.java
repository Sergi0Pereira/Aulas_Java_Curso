package Exercicios_Concluidos.Ficha_6_Arrays.src.ficha_6_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio__10{
    
    public static void main(String [] args){
    
    Scanner in= new Scanner(System.in);
    
    int primeiro[]={1,2,9,4,5};
    int segundo[]={1,3,6,7,9,1};
    
    for(int i=0 ; primeiro.length > i;i++){
        for(int x=0; segundo.length> x;x++){
            if(primeiro[i]==segundo[x]){
            System.out.println(primeiro[i]);
        }
        }
    }
    

    }
    }
