public class Practica3_1 {
    public static void main(String[] args) {
        int acumulador;

        for (int i = 1; i <= 10; i++) {
            acumulador = 1;
            for (int j = 1; j <= 5; j++) {
                acumulador = acumulador * i;
                System.out.println(i + " elevado a " + j + " = "
                        + acumulador);
            }
            System.out.println("");
        }
    }
}