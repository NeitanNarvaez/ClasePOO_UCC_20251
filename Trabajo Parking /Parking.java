import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        int[] parqueadero = new int[20]; // 20 puestos para motos (0 = libre, 1 = ocupado)
        String[] placas = new String[20]; // se guardaran las placas
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu Principal"); // menu con 3 opciones
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar tarifa");
            System.out.println("3. Salir");
            System.out.print("seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                System.out.println("\nEstado del parqueadero:"); 
                // muestran los puestos disponibles y ocupados
                for (int i = 0; i < parqueadero.length; i++) {
                    System.out.print("Puesto " + i + ": ");
                    if (parqueadero[i] == 0) {
                        System.out.println("[Libre]");
                    } else {
                        System.out.println("[Ocupado] - Placa: " + placas[i]);
                    }
                } 

                System.out.print("\nseleccione un puesto (0-19): "); 
                int puesto = scanner.nextInt();
                scanner.nextLine(); 
                //se solicita la placa de la moto 
                if (puesto >= 0 && puesto < 20 && parqueadero[puesto] == 0) {
                    System.out.print("ingrese la placa de la moto: ");
                    String placa = scanner.nextLine();

                    // Ver si la placa ya esta en uso 
                    boolean placaRepetida = false;
                    for (String p : placas) {
                        if (placa.equals(p)) {
                            placaRepetida = true;
                            break;
                        }
                    }
                   
                    if (!placaRepetida) {
                        placas[puesto] = placa;
                        parqueadero[puesto] = 1;
                        System.out.println("moto con la placa " + placas[puesto] + " registrada en el puesto " + puesto);
                    } else {
                        System.out.println("lko siento, ya existe una moto con esta placa en el parqueadero.");
                    }
                } else {
                    System.out.println("Puesto no válido o ya ocupado.");
                }
            } else if (opcion == 2) {
                System.out.print("ingrese el puesto de la moto a cobrar (0-19): ");
                int puesto = scanner.nextInt();

                if (puesto >= 0 && puesto < 20 && parqueadero[puesto] == 1) {
                    System.out.println("Moto con placa: " + placas[puesto]);
                    System.out.print("ingrese cuanto tiempo estuvo en minutos: ");
                    int tiempo = scanner.nextInt();
                    int tarifa;

                    if (tiempo <= 30) {
                        tarifa = 0;
                    } else if (tiempo <= 60) {
                        tarifa = 800;
                    } else {
                        tarifa = 2000;
                    }

                    System.out.println("total a pagar: $" + tarifa);
                    parqueadero[puesto] = 0; // se libera el puesto que esta ocupado
                    placas[puesto] = null; // se elimina la  la placa registrada
                    System.out.println("puesto " + puesto + " ha sido liberado.");
                } else {
                    System.out.println("puesto no valido o vacio.");
                }
            } else if (opcion != 3) {
                System.out.println("opción no valida, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}