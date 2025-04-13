// Inicio de la solución

public class PrecioTotal {
    // Atributos
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;

    // Constructor
    public PrecioTotal(Equipaje[] equipaje) {
        this.equipaje = equipaje;
    }

    // Metodos
    public void calcularTotales() {
        for (Equipaje e : equipaje) {
            double precio = e.calcularPrecio();
            totalPrecios += precio;

            if (e instanceof Bodega) {
                totalBodega += precio;
            } else if (e instanceof Cabina) {
                totalCabina += precio;
            }
        }
    }

    public void mostrarTotales() {
        // Calculo de totales
        calcularTotales();
        System.out.println("Total Equipaje " + totalPrecios);
        System.out.println("Total Bodega " + totalBodega);
        System.out.println("Total Cabina " + totalCabina);
    }
}

class Equipaje {
    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;

    // Atributos
    protected double peso;
    protected double tamanio;
    protected double precioBase;

    // Constructores
    public Equipaje(double peso, double tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double precioBase) {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = precioBase;
    }

    public Equipaje() {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }

    // Metodos
    public double calcularPrecio(){
        return 0.0;
    }
}

class Bodega extends Equipaje {
    // Constantes
    private static final double CAPACIDAD = 8.0;

    // Constructores
    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public Bodega() {
        super();
    }

    // Metodos
    public double calcularPrecio(){
        // Calculos
        double precioFinal = precioBase + (peso * tamanio * CAPACIDAD);
        return precioFinal;
    }
}

class Cabina extends Equipaje {
    // Constantes
    private final static int TIEMPO = 2;

    // Constructores
    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public Cabina() {
        super();
    }

    // Metodos
    public double calcularPrecio(){
        // Calculos
        double precioFinal = precioBase + (peso * tamanio * TIEMPO);
        return precioFinal;
    }
}

// Fin de la solución
