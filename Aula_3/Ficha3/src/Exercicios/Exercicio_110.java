package Exercicios;

import java.util.Scanner;

public class Exercicio_110 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double num, cent, dez, uni;

    System.out.println("Insira por favor o numero que pretende converter: ");

    num = in.nextDouble();
    if (num > 999 || num <= 0) {
      System.out.println("Numero fora dos limites.");
    } else {
      int centint = 0, dezint = 0, unidint = 0;

      if (num > 100 && num < 1000) {

        cent = num / 100;
        centint = (int) cent * 100;
        // System.out.println(centint);

        dez = (num - centint) / 10;
        dezint = (int) dez * 10;
        // System.out.println(dezint);

        uni = num - centint - dezint;
        unidint = (int) uni;
        // System.out.println(unidint);
      }

      else if (num < 100 && num > 10) {
        dez = (num) / 10;
        dezint = (int) dez * 10;
        // System.out.println(dezint);

        uni = num - dezint;
        unidint = (int) uni;
        // System.out.println(unidint);
      }

      else if (num < 10 && num > 0) {

        uni = num;
        unidint = (int) uni;
        // System.out.println(unidint);
      }

      else {

      }

      String c, d, u;

      switch (centint) {
        case 100:
          c = "C";
          break;
        case 200:
          c = "CC";
          break;
        case 300:
          c = "CCC";
          break;
        case 400:
          c = "CD";
          break;
        case 500:
          c = "D";
          break;
        case 600:
          c = "DC";
          break;
        case 700:
          c = "DCC";
          break;
        case 800:
          c = "DCCC";
          break;
        case 900:
          c = "MC";
          break;
        default:
          c = "";
      }

      switch (dezint) {
        case 10:
          d = "X";
          break;
        case 20:
          d = "XX";
          break;
        case 30:
          d = "XXX";
          break;
        case 40:
          d = "XL";
          break;
        case 50:
          d = "L";
          break;
        case 60:
          d = "LX";
          break;
        case 70:
          d = "LXX";
          break;
        case 80:
          d = "LXXX";
          break;
        case 90:
          d = "XC";
          break;
        default:
          d = "";
      }

      switch (unidint) {
        case 1:
          u = "I";
          break;
        case 2:
          u = "II";
          break;
        case 3:
          u = "III";
          break;
        case 4:
          u = "IV";
          break;
        case 5:
          u = "V";
          break;
        case 6:
          u = "VI";
          break;
        case 7:
          u = "VII";
          break;
        case 8:
          u = "VIII";
          break;
        case 9:
          u = "IX";
          break;
        default:
          u = "";
      }

      System.out.println("O numero " + (int) num + " corresponde ao número " + c + d + u + " em numeraçao romana.");
    }
  }
}
