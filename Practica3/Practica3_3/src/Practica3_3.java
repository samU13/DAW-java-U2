import java.util.Scanner;

public class Practica3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce precio del artículo (0 para salir): ");
        double precio = teclado.nextDouble();

        while (precio != 0) {

            System.out.print("Introduce IVA (1 – 4%, 2 – 7%, 3 – 16%): ");
            int iva = teclado.nextInt();
            while (iva < 1 || iva > 3) {
                System.out.print("IVA incorrecto.Introduce IVA (1 – 4%, 2 – 7%, 3 – 16%): ");
                iva = teclado.nextInt();
            }

            int margen = 0;
            switch (iva) {
                case 1:
                    iva = 4;
                    if (precio <= 3000) {
                        margen = 30;
                    } else {
                        margen = 45;
                    }
                    break;
                case 2:
                    iva = 7;
                    if (precio <= 700) {
                        margen = 22;
                    } else {
                        margen = 50;
                    }
                    break;
                case 3:
                    iva = 16;
                    if (precio <= 180) {
                        margen = 75;
                    } else {
                        margen = 100;
                    }
                    break;
            }


            double precioConMargen = precio + precio * margen / 100;
            double precioFinal = precioConMargen + precioConMargen * iva / 100;

            System.out.println("Precio de venta al público: " + precioFinal + "\n");

            System.out.print("Introduce precio del artículo (0 para salir): ");
            precio = teclado.nextDouble();
        }
    }
}
