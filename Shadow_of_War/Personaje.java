package Shadow_of_War;

import java.util.Random;

public class Personaje {
    private String nombre;
    private int puntosDeVida;
    private Arma arma;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
    }

    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int danoBase = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        int danoTotal = danoBase + arma.getDanoExtra();
        oponente.recibirDano(danoTotal);

        System.out.println(nombre + " ataca con " + arma.getNombre() + " causando " + danoTotal + " puntos de daño a " + oponente.getNombre());
    }

    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

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
