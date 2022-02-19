import java.util.Scanner;

public class Practica2_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas;
        double precio;

        System.out.print("Introduce número de horas (<0 para salir): ");
        horas = teclado.nextInt();

        while (horas >= 0) {
            System.out.print("Introduce precio de la hora: ");
            precio = teclado.nextDouble();

            if (horas > 40) {
                System.out.println("Sueldo: "
                        + (40 * precio + (horas - 40) * precio * 1.5) + " euros\n");
            } else {
                System.out.println("Sueldo: " + (horas * precio) + " euros\n");
            }

            System.out.print("Introduce número de horas (<0 para salir): ");
            horas = teclado.nextInt();

        }
    }
}