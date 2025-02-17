import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor digite la cantidad de elementos: ");
        int n = leer.nextInt();

        // int n = 5;
        int[] b = new int[n];

        // Estructura para llenar el arreglo con números aleatorios
        // entre 10 y 30
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * (30 + 10)) + 10;
        }

        // Mostrar los elementos del arreglo b
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
        // Mostrar los elementos del arreglo b
        int suma = 0;
        for (int i = 0; i < b.length; i++) {
            suma = suma + b[i];
        }
        System.out.println("la suma de los " + n + "elementos del arreglo es :" + suma);

        leer.close();
    }
}
