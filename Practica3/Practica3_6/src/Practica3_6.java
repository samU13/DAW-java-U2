import java.util.Scanner;

public class Practica3_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor inicial (entero mayor que 0): ");
        int valorInicial = teclado.nextInt();
        while (valorInicial <= 0) {
            System.out.print("ERROR. Introduzca el valor inicial (entero mayor que 0): ");
            valorInicial = teclado.nextInt();
        }

        System.out.print("Introduzca el incremento: ");
        int incremento = teclado.nextInt();
        while (incremento <= 0) {
            System.out.print("ERROR. Introduzca el incremento (entero mayor que 0): ");
            incremento = teclado.nextInt();
        }

        System.out.println("Serie:");
        int valor = valorInicial;
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            suma = suma + valor;
            valor = valor + incremento;
        }

        System.out.println("Suma: " + suma);
    }
}
