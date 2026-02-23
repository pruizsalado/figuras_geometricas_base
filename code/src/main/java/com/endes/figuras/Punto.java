package com.endes.figuras;

public class Punto {
    // Atributos
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters
    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    // Métodos setters
    public void setx(double x) {
        this.x = x;
    }

    public void sety(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto otro) {
        // Fórmula de distancia entre dos puntos (x1 - x2)² + (y1 - y2)²
        double dx = this.x - otro.getx();
        double dy = this.y - otro.gety();
        return Math.sqrt(dx * dx + dy * dy);
    }
}