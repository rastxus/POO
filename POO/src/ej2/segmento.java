package ej2;

public class segmento extends Punto{
	
	@Override
	public String toString() {
		return "segmento [a=" + a + ", b=" + b + "]";
	}
	Punto a = new Punto();
	Punto b = new Punto();
	
	
	public void setA(double x,double y) {
		a.setX(x);
		a.setY(y);
	}
	public Punto getA() {
		return a;
	}
	
	public void setB(double x,double y) {
		b.setX(x);
		b.setY(y);
	}
	public Punto getB() {
		return b;
	}

	
	

}
