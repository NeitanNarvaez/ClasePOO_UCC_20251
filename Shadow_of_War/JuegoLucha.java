package Shadow_of_War;
/**
 * Clase que controla la lógica del combate entre dos personajes
 * Maneja los turnos y dice el ganador
 */

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    /**
     * Inicia la pelea entre los dos personajes
     * Se alternan los turnos hasta que uno de los personajes quede sin vida
     */

    public void iniciarPelea() {
        System.out.println(" empieza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

        //Continúa mientras ambos jugadores estén vivos
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            // solo sigue si el jugador2 sigue vivo
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }
// muetsra el ganador

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " gano la batalla ");
        } else {
            System.out.println(jugador2.getNombre() + " gano la batalla");
        }
    }
/*muesta quien ataca y quien reibe daño */
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". " + defensor.getNombre() +
                " tiene " + defensor.getPuntosDeVida() + " puntos de vida");
// hace el ataque        
                atacante.atacar(defensor);
                //muestra el resultado del ataque       
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.\n");
    }
}
