public class Practica2_10 {
    public static void main(String[] args) {

        int sumaPares = 0;
        int sumaImpares = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }


        System.out.println("Suma de pares entre 1 y 100 = " + sumaPares);
        System.out.println("Suma de impares entre 1 y 100 = " + sumaImpares);
    }

}
