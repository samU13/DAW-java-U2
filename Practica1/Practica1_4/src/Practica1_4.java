import java.util.Scanner;

public class Practica1_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce un numero entero: ");
        int entero = teclado.nextInt();


        if (entero != 0){
            if (entero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } else {
            System.out.println("El número introducido es cero.");
        }

    }
}
