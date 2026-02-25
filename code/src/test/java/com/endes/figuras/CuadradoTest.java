package com.endes.figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void testAreaYPerimetroConLadoPositivo() {
        Punto p = new Punto();
        Cuadrado c = new Cuadrado("Cuadrado1", "Rojo", 3.0, p);
        assertEquals(9.0, c.area(), 1e-9, "El área de un cuadrado de lado 3 debe ser 9");
        assertEquals(12.0, c.perimetro(), 1e-9, "El perímetro de un cuadrado de lado 3 debe ser 12");
    }

    @Test
    void testAreaYPerimetroConLadoDecimal() {
        Punto p = new Punto();
        Cuadrado c = new Cuadrado("Cuadrado2", "Azul", 2.5, p);
        assertEquals(6.25, c.area(), 1e-9, "Área con lado 2.5 debe ser 6.25");
        assertEquals(10.0, c.perimetro(), 1e-9, "Perímetro con lado 2.5 debe ser 10");
    }

    @Test
    void testAreaYPerimetroConLadoCero() {
        Punto p = new Punto();
        Cuadrado c = new Cuadrado("Cuadrado3", "Verde", 0.0, p);
        assertEquals(0.0, c.area(), 1e-9, "Área con lado 0 debe ser 0");
        assertEquals(0.0, c.perimetro(), 1e-9, "Perímetro con lado 0 debe ser 0");
    }

    @Test
    void testGetNombreYColor() {
        Punto p = new Punto();
        Cuadrado c = new Cuadrado("MiCuadrado", "Negro", 1.0, p);
        assertEquals("MiCuadrado", c.getNombre());
        assertEquals("Negro", c.getColor());
    }

    @Test
    void testCompareToPorArea() {
        Punto p = new Punto();
        Cuadrado c1 = new Cuadrado("A", "Blanco", 2.0, p); // area 4
        Cuadrado c2 = new Cuadrado("B", "Blanco", 3.0, p); // area 9
        assertTrue(c1.compareTo(c2) < 0, "c1 debe tener menor área que c2");
        assertTrue(c2.compareTo(c1) > 0, "c2 debe tener mayor área que c1");
        Cuadrado c3 = new Cuadrado("C", "Blanco", 2.0, p);
        assertEquals(0, c1.compareTo(c3), "c1 y c3 deben tener la misma área");
    }
}
