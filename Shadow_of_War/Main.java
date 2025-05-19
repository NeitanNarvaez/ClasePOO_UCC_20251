package Shadow_of_War;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("personaje 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print(" personaje 2: ");
        String nombre2 = scanner.nextLine();

        Arma espada = new Arma("Espada de fuego", 5);
        Arma hacha = new Arma("Hacha venonosa", 7);

        Guerrero jugador1 = new Guerrero(nombre1, espada);
        Guerrero jugador2 = new Guerrero(nombre2, hacha);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
    }
}
