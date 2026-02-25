package com.endes.figuras;

public class Punto {
    private double x;
    private double y;

    // Constructor del punto
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Métodos setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto otro) {
        double dx = this.x - otro.getX();
        double dy = this.y - otro.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}


