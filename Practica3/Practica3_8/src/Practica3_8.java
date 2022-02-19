import java.util.Scanner;

public class Practica3_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int total = 0;


        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduce número entero " + i + ": ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                total += numero;
            } else {
                total -= numero;
            }
        }


        System.out.println("Total: " + total);
    }

}
