public class Triangulo extends FiguraGeometrica {

    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
        super(nombre, color);
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
    }

    @Override //metodo para el area
    public double area() {
        return Math.abs(vertice1.getX() * (vertice2.getY() - vertice3.getY()) + vertice2.getX() * (vertice3.getY() - vertice1.getY()) + vertice3.getX() * (vertice1.getY() - vertice2.getY())) / 2.0;
    }

    @Override //metodo para el perimetro
    public double perimetro() {
        double lado1 = vertice1.distancia(vertice2);
        double lado2 = vertice2.distancia(vertice3);
        double lado3 = vertice3.distancia(vertice1);
        return lado1 + lado2 + lado3;
    }

    @Override //metodo para trasladar 
    public void trasladar(double dx, double dy) {
        vertice1.setX(vertice1.getX() + dx);
        vertice1.setY(vertice1.getY() + dy);

        vertice2.setX(vertice2.getX() + dx);
        vertice2.setY(vertice2.getY() + dy);

        vertice3.setX(vertice3.getX() + dx);
        vertice3.setY(vertice3.getY() + dy);
    }

    @Override
    public void rotar(double angulo) { //metodo para rotar
        double r = Math.toRadians(angulo);
        rotarPunto(vertice1, r);
        rotarPunto(vertice2, r);
        rotarPunto(vertice3, r);
    }

    private void rotarPunto(Punto p, double rad) {
        double x = p.getX();
        double y = p.getY();
        double nuevoX = x * Math.cos(rad) - y * Math.sin(rad);
        double nuevoY = x * Math.sin(rad) + y * Math.cos(rad);
        p.setX(nuevoX);
        p.setY(nuevoY);
    }
}
