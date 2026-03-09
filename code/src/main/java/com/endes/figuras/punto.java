public class punto {

	    private double x;
	    private double y;

	    public punto(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    public double distancia(punto otro) {
	        double dx = this.x - otro.getX();
	        double dy = this.y - otro.getY();
	        return Math.sqrt(dx * dx + dy * dy);
	    }
	}
}
