public class EjecutarClase7 {
    public static void main(String[] args) {

        // Instanciar el Objeto (Creación)

        Estudiante objEst1 = new Estudiante(1, "Gabriela", "Astorquiza", 15, "Ingeniería");
        Estudiante objEst2 = new Estudiante(2, "Juan", "Castro", 20, "Derecho");

        // Imprimir detalles de los estudiantes
        System.out.println(objEst1);
        System.out.println(objEst2);

        objEst1.setEdad(20);

        System.out.println(objEst1);
    }
}
