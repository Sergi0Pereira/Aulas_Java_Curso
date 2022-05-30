
import java.util.Scanner;

public class Exercicio_8 {

     public static void main(String[] args) {

          String frase = "The quick brown fox jumps over the lazy dog.";
          System.out.println(frase);
          System.out.println("As vogais da frase estao presentes nos seguintes indices:");
          for (int i = 0; i < frase.length(); i++) {
               switch (frase.charAt(i)) {
                    case 'a':
                         System.out.println(i);
                         break;
                    case 'e':
                         System.out.println(i);
                         break;
                    case 'i':
                         System.out.println(i);
                         break;
                    case 'o':
                         System.out.println(i);
                         break;
                    case 'u':
                         System.out.println(i);
                         break;
               }
          }
     }
}