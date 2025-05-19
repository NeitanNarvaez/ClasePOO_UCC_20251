package Shadow_of_War;
// clase guerreo que hereda de personaje
public class Guerrero extends Personaje {

    // constructor de guerrero, nombre y arma, que usara el constructor de personaje
    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma); //llama al constructor de la clase padre (Personaje)
    }
}
