import java.util.Scanner;

public class Practica3_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("¿Cuantos términos de la sucesión quieres sumar?: ");
        int numTerminos=teclado.nextInt();

        while(numTerminos<=0) {
            System.out.print("ERROR. ¿Cuantos términos de la sucesión quieres sumar?: ");
            numTerminos=teclado.nextInt();
        }


        double numerador = 0, denominador = 2;
        double suma = 0;
        System.out.println(System.currentTimeMillis());
        for(int i=1; i <= numTerminos; i++) {
            System.out.print(numerador+" / ");
            System.out.println(denominador);
            suma = suma + numerador/denominador;
            numerador = numerador + 5;
            denominador = denominador * 3;
        }





        System.out.println("La suma de los " + numTerminos
                + " primeros términos de la serie es: " + suma);

    }
}
