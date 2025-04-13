package Calculadora_Cientifica;

class Ejecutar {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
        System.out.println("Potencia: " + calc.potencia(num1, num2));
        System.out.println("Raíz cuadrada: " + calc.raizCuadrada(num1));
    }
}
