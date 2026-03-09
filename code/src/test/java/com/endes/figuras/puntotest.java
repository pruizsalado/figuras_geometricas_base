package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class puntotest {

	@BeforeEach
	void setUp() throws Exception {
		//coordenadas del punto usualmente es X e Y
		punto punto1 = new punto(0, 0);
	}

	@Test
	void testDistancia() {
        // Creacion de dos puntos
        punto p1 = new punto(0, 0); // Punto en el origen
        punto p2 = new punto(3, 4); // Punto en las coordenadas (3, 4)
        
        // Calcular la distancia entre p1 y p2
        double distanciaC = p1.distancia(p2);
        
        // La distancia esperada es 5 (por el teorema de Pitágoras: √(3² + 4²) = 5)
        double distanciaEsp = 5.0;
        
        // Asegurar que la distancia esperada es igual a la esperada
        assertEquals(distanciaEsp, distanciaC, 0.0001); // El tercer parámetro es la tolerancia de error
	}
	
    @Test
    public void testTrasladar() {
        // creacion de la variable
        punto p = new punto(1, 1); // Punto inicial en (1, 1)
        
        // Mover el punto
        p.trasladar(3, 4); // Debe moverse a (1+3, 1+4) = (4, 5)
        
        // Verificación de las coordenadas del punto
        assertEquals(4.0, p.getX(), 0.0001); // Comprobar coordenada X
        assertEquals(5.0, p.getY(), 0.0001); // Comprobar coordenada Y
    }

}
