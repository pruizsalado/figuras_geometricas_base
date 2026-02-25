package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
	double lado;
	Punto esquina;
	
	public Cuadrado(String nombre, String color, double lado, Punto esquina) {
		super(nombre, color);
		this.lado = lado;
		this.esquina = esquina;
	}

	@Override
	public double area() {
		
		return lado * lado;
	}

	@Override
	public double perimetro() {
		
		return 4 * lado;
	}
    

}
