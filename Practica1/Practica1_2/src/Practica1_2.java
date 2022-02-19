import java.util.Scanner;

public class Practica1_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte nota;


        System.out.print("Introduce una nota del 0 al 10: ");
        nota = teclado.nextByte();


        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe ser un entero entre 0 y 10.");
        } else {
            System.out.println("La nota que ha introducido es: " + nota);
        }
    }
}
