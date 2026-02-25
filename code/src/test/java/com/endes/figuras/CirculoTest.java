package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTest {
private Circulo circ;
	@BeforeEach
	void setUp() throws Exception {
		//String nombre, String color, double radio, Punto centro
		circ = new Circulo("circ1", "rojo", 1.0, new Punto(1.0, 1.0));
	}
	
	@Test
	void testPerimetro() {
		//fail("Not yet implemented");
		double resultadoEsperado = Math.PI;
		double resultado = circ.perimetro();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testArea() {
		double resultadoEsperado = 2 * Math.PI;
		double resultado = circ.area();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testTrasladar() {
		Punto p = new Punto(0, 0);
		Punto resultadoEsperado = circ.transladar(0, 0); 
		double resultado = circ.transladar(0, 0);
		assertEquals(resultadoEsperado, resultado);
	}

}
