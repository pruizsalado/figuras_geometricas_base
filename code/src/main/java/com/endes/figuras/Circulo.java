package com.endes.figuras;

public class Circulo{
	String nombre;
	String color; 
	double radio;
	Punto centro;
}

public Circulo (String nombre, String color, souble radio, Punto centro) {
	this.nombre = nombre;
	this.color = color;
	this.radio = radio; 
	this.centro = centro;
}

public double perimetro() {
	return radio * radio * Math.PI;
}
public double area() {
	return 2 * Math.PI * radio;
}

public void rotar(double angulo) {
	centro.rotar(angulo);
}

public void transladar(double dx, double dy) {
	centro.transladar(dx, dy);
}
