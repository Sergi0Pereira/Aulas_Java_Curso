package calculadora;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Calculadora {

    private Double n1, n2, res;
    private char x;
    private boolean verificacao = true;
    Exception e = new Exception();

    /**
     *
     * @throws Exception
     */
    public void Calculadora() throws Exception {
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Insira aqui o primeiro numero: ");
                n1 = in.nextDouble();
                verificacao = true;

            } catch (Exception e) {
                System.out.println("Um numero nao foi inserido.Erro: " + e);
                verificacao = false;
            }
            in.nextLine();

        } while (verificacao == false);

        do {
            try {
                System.out.println("Insira aqui o segundo numero: ");
                n2 = in.nextDouble();
                verificacao = true;

            } catch (Exception e) {
                System.out.println("Um numero nao foi inserido.Erro: " + e);
                verificacao = false;
                in.nextLine();
            }
        } while (verificacao == false);
        do {
            System.out.println("Insira aqui a operacao que deseja realizar: ");

            x = in.next().charAt(0);

            switch (x) {

                case '+':
                    res = n1 + n2;
                    break;
                case '-':
                    res = n1 - n2;
                    break;
                case '*':
                    res = n1 * n2;

                    break;
                case '/':
                    res = n1 / n2;
                    if (n2 == 0) {
                        System.out.println("O numero nao pode ser divido por 0. Erro: " + e);
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador Inválido.Erro: " + e);
                    break;
            }

        } while (res == null);
        System.out.println(n1 + "" + "" + x + "" + n2 + " = " + res);
    }

}
