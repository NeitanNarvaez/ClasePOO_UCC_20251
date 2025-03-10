import java.util.Arrays;

public class Ejercicio11 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creacion del arreglo a de enteros de n elementos
        // Declaracion del arreglo de tamaño n

        int n = (int) (Math.random() * (30 - 15)) + 15;
        int[] a = new int[n];

        // Llenar el arreglo con numerod comprometidos entre -20 y 20
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (20 + 20)) - 20;
        }
        // Mostrar el arreglo para validar que se estan guardando los elementos

        for (int i = 0; i < a.length; i++) {
            System.out.print("|" + a[i]);
        }
        System.out.println();

        // se va recorrer el arreglo para determinar cuantos
        int contp = 0, contn = 0, contc = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                contp++;
            } else if (a[i] < 0) {
                contn++;
            } else {
                contc++;
            }
        }
        // crear los tres arreglos que almacenaran los numeros positivos, negativos y
        // cero.

        int[] positivos = new int[contp];
        int[] negativos = new int[contn];
        int[] ceros = new int[contc];

        // Guardar los elementos que le corresponde a cada arreglo
        int j = 0, k = 0, q = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positivos[j] = a[i];
                j++;
            } else if (a[i] < 0) {
                negativos[k] = a[i];
                k++;
            } else {
                ceros[q] = a[i];
                q++;
            }
        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        System.out.println(Arrays.toString(ceros));

    }
}
