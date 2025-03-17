public class Ejecutar {
    public static void main (String[] args) {
     
     //Instanciar el Objeto (Creación)
        
        Estudiante objEst1 = new Estudiante(1, "Gabriela", "Astorquiza", 15, "Ingeniería");
        Estudiante objEst2 = new Estudiante(2, "Juan", "Castro", 20, "Derecho");
     
     // Imprimir detalles de los estudiantes
     imprimirDetalles(objEst1);
     imprimirDetalles(objEst2);

     objEst1.setNombre(120);

     System.out.println(objEst1);
    } 
}
