import java.util.Scanner;

public class Practica2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();


        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }

}