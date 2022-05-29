public class Exercicio__12 {
    public static void main(String[] args) {

        for (int i = 99; i > 0; i--) {

            if (i == 1) {
                System.out.println(i + " bottle of beer on the Wall\n" + i + " bottle of beer\n" +"Take one down.\n" +"Pass it around.”");
                System.out.println("");
                System.out.println("");
                i--;
            }

            if (i == 0) {
                System.out.println("No more bottles of beer on the wall!");
                break;
            }

            System.out.println(i + " bottles of beer on the Wall\n" + i + " bottles of beer\n" + "Take one down.\n"+ "Pass it around.”");
            System.out.println("");
            System.out.println("");
        }
    }
}