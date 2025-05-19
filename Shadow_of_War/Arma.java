package Shadow_of_War;

public class Arma {
    private String nombre;
    private int danoExtra;

    public Arma(String nombre, int danoExtra) {
        this.nombre = nombre;
        this.danoExtra = danoExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanoExtra() {
        return danoExtra;
    }
}
