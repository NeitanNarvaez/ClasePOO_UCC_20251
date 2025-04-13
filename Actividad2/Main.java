public class Main {
    public static void main(String[] args) {
        Equipaje equipaje[] = new Equipaje[5];

        equipaje[0] = new Bodega(100.0, 10.0);  // 1000 + (100*10*8) = 9000
        equipaje[1] = new Bodega(200);         // 200 + (10*4.5*8) = 560
        equipaje[2] = new Cabina(150, 20.0);   // 1000 + (150*20*2) = 7000
        equipaje[3] = new Cabina();            // 1000 + (10*4.5*2) = 1090
        equipaje[4] = new Bodega();            // 1000 + (10*4.5*8) = 460

        PrecioTotal solucion = new PrecioTotal(equipaje);
        solucion.mostrarTotales();
    }
}
