import java.util.Scanner;

public class Practica2_1 {
    public static void main(String[] args) {
        int n,i;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(i+"\t");
            System.out.print(i*i+"\t");
            System.out.print(i*i*i+"\n");
        }
    }
}
