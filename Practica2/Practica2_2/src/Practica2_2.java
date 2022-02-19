import java.util.Scanner;

public class Practica2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador=1;

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();


        System.out.println("Potencias desde 1 hasta 5 de " + numero + ":");
        for (int i = 1; i <= 5; i++) {
            acumulador=acumulador*numero;
            System.out.println(numero + " elevado a " + i + " = "
                    + acumulador);
        }
    }
}
