package Calculadora_Cientifica;

public class CalculadoraCientifica {
    private double resultado; 
    public CalculadoraCientifica() {
        this.resultado = 0;
    }

    // Métodos
    public double sumar(double a, double b) {
        this.resultado = a + b;
        return this.resultado;
    }

    public double restar(double a, double b) {
        this.resultado = a - b;
        return this.resultado;
    }

    public double multiplicar(double a, double b) {
        this.resultado = a * b;
        return this.resultado;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            this.resultado = a / b;
        } else {
            System.out.println("Error: division no permitida");
            this.resultado = 0;
        }
        return this.resultado;
    }

    public double potencia(double base, double exponente) {
        this.resultado = Math.pow(base, exponente);
        return this.resultado;
    }

    public double raizCuadrada(double a) {
        if (a >= 0) {
            this.resultado = Math.sqrt(a);
        } else {
            System.out.println("Error: No se puede calcular la raíz de un número negativo.");
            this.resultado = 0;
        }
        return this.resultado;
    }

    public double getResultado() {
        return this.resultado;
    }
}