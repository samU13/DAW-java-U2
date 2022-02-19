import java.util.Scanner;

public class Practica1_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        byte nota;


        System.out.print("Introduce una nota (entero entre 0 y 10): ");
        nota = teclado.nextByte();


        if (nota < 0 || nota > 10){
            System.out.println("La nota debe ser un entero entre 0 y 10.");
        } else if (nota < 5){
            System.out.println("Suspenso");
        } else {
            System.out.println("Aprobado");
        }
    }
}
