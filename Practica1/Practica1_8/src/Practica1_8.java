import java.util.Scanner;

public class Practica1_8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("1. CADRADO");
        System.out.println("2. RECTÁNGULO");
        System.out.println("3. TRIÁNGULO");
        System.out.println("4. CÍRCULO");
        System.out.println();


        System.out.print("   INTRODUCE OPCIÓN:");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("   OPCIÓN ELEGIDA: CADRADO");
            case 2 -> System.out.println("   OPCIÓN ELEGIDA: RECTÁNGULO");
            case 3 -> System.out.println("   OPCIÓN ELEGIDA: TRIÁNGULO");
            case 4 -> System.out.println("   OPCIÓN ELEGIDA: CÍRCULO");
            default -> System.out.println("   ERROR: Opción non válida!");
        }

    }
}
