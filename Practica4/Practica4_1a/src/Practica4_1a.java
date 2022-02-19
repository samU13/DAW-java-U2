import java.util.Scanner;

public class Practica4_1a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("JUGADOR 1: Escribe un número entre 1 y 50: ");
        int numJugador1 = teclado.nextInt();
        while (numJugador1 < 1 || numJugador1 > 50) {
            System.out.print("ERROR. JUGADOR 1: Escribe un número entre 1 y 50: ");
            numJugador1 = teclado.nextInt();
        }


        System.out.println("\nJUGADOR 2: Tienes 5 intentos para adivinar el número"
                + " de JUGADOR 1.");

        int intentos = 5;
        int numJugador2 = -1;

        while (intentos > 0) {
            System.out.print("JUGADOR 2: Escribe un número entre 1 y 50: ");
            numJugador2 = teclado.nextInt();
            while (numJugador2 < 1 || numJugador2 > 50) {
                System.out.print("ERROR. JUGADOR 2: Escribe un número entre 1 y 50: ");
                numJugador2 = teclado.nextInt();
            }


            if (numJugador1 == numJugador2) {
                break;
            }


            if (numJugador1 > numJugador2) {
                System.out.print("JUGADOR 2: El número a adivinar es mayor.");
            } else {
                System.out.print("JUGADOR 2: El número a adivinar es menor.");
            }
            intentos--;
            System.out.println(" Te quedan " + intentos + " intentos\n");
        }

        if (numJugador1 == numJugador2) {
            System.out.println("JUGADOR 2: ENHORABUENA. Has acertado el número");
        } else {
            System.out.println("JUGADOR 2: LO SIENTO."
                    + " Se te han acabado los intentos.");
        }
    }
}
