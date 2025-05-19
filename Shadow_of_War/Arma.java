package Shadow_of_War;
/** 
 * Clase que representa un arma en el juego Shadow of War
 * Contiene información sobre el nombre del arma y el daño extra que proporciona
*/
public class Arma {
    private String nombre;
    private int danoExtra; // cantidad de daño extra
// constructor de arma,nombre y daño extra
    public Arma(String nombre, int danoExtra) {
        this.nombre = nombre;
        this.danoExtra = danoExtra;
    }

    public String getNombre() {
        return nombre;
    }
//obtiene el daño extra del arma en entero

    public int getDanoExtra() {
        return danoExtra;
    }
}
