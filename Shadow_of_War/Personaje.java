package Shadow_of_War;

import java.util.Random;
//tiene el personaje y atributos, comportamientos

public class Personaje {
    private String nombre;
    private int puntosDeVida;                         // salud del personaje actual
    private Arma arma;
    private final int MAX_DANO = 30;                  // limite de daño
    private final int MIN_DANO = 10;                  // minimo de daño

    //constructor de nombre del personaje, salud y arma
    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;              // ambos perosnajes empiezan con 100 de vida
        this.arma = arma;
    }

    public void atacar(Personaje oponente) {
        Random rand = new Random();                                                         // daño base entre minimo y máximo en daño
        int danoBase = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;                  // suma del daño extra
        int danoTotal = danoBase + arma.getDanoExtra();                                     // hace el daño al oponente
        oponente.recibirDano(danoTotal);

        System.out.println(nombre + " ataca con " + arma.getNombre() + " causando " + danoTotal + " puntos de daño a " + oponente.getNombre());
    }

    public void recibirDano(int dano) {
        
        puntosDeVida -= dano;          // mira que los puntos de vida no sean negativos
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    //mira si el personaje sigue vivo
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    // metodo para acceder a los atributos 
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public Arma getArma() {
        return arma;
    }
}
