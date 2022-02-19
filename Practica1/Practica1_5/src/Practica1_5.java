import java.util.Scanner;

public class Practica1_5 {
    public static void main(String[] args) {
        float precio;
        int numUnidades;

        int descuento;

        Scanner teclado = new Scanner(System.in);
        float importeSinDescuento;
        float importeConDescuento;

        System.out.print("Introduce el precio del artículo: ");
        precio = teclado.nextFloat();
        System.out.print("Introduce el número de unidades: ");
        numUnidades = teclado.nextInt();


        if (numUnidades > 100){
            descuento = 40;
        } else if (numUnidades >= 25){
            descuento = 20;
        } else if (numUnidades >= 10){
            descuento = 10;
        } else{
            descuento = 0;
        }


        importeSinDescuento = precio * numUnidades;
        importeConDescuento = importeSinDescuento
                - importeSinDescuento * descuento / 100;


        System.out.println("El importe final de la compra es "
                + importeConDescuento);

    }
}
