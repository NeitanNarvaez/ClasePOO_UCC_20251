public class Arreglos {
public static void main(String[] args) {

    /*
     * Primera forma de declarar un arreglo:
     * int[] a = {8, 3, 10, 22, 1, 9};
     * 
     * segunda Forma de declarar un arreglo:
     * int[] a = new int [6];
     * El numero hace referncia al tamaño del arreglo 
     * tendremos que llener el arreglo.
    */
    int[] a = {8, 3, 10, 22, 1, 9};
    for (int i = 0; i < a.length; i++){
        System.out.println("a[" +i + "]=" + a[i]);
    }
    int tam = 10;
    int [] b = new int [tam];
    for (int i = 0; i < b.length; i ++ ){
        b[i] = (int)(Math.random() *  (30 + 10)) + 10;

    }
    //mostrar los elementos del arreglo b
    
    for (int i = 0; i < a.length; i++){
        System.out.println("a[" +i + "]=" + b[i]);
    }
}
}