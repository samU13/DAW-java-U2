import java.util.Scanner;

public class Practica2_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, contadorMenor15=0, contadorEntre15y50=0, contadorMayor50=0;

        System.out.print("Indica cuántos números vas a introducir: ");
        n = teclado.nextInt();

        for (; n>0; n--) {
            System.out.print("Introduce número: ");
            int numero = teclado.nextInt();

            if (numero < 15) {
                contadorMenor15++;
            } else if (numero > 50) {
                contadorMayor50++;
            } else {
                contadorEntre15y50++;
            }
        }

        System.out.println(contadorMenor15 + " menores de 15");
        System.out.println(contadorEntre15y50 + " entre 15 y 50");
        System.out.println(contadorMayor50 + " mayores de 50");
    }
}
