package ej2;

public class Poligono extends segmento{

	@Override
	public String toString() {
		return "Poligono : Triangulo\n\t [l1=" + l1 + ",\n\t l2=" + l2 + ",\n\t l3=" + l3 + "]";
	}
	segmento l1 = new segmento();
	segmento l2 = new segmento();
	segmento l3 = new segmento();

	public void setl1(double xa,double ya,double xb,double yb){

		l1.a.setX(xa);
		l1.a.setY(ya);
		l1.b.setX(xb);
		l1.b.setY(yb);
	}
	
	public void setl2(double xa,double ya,double xb,double yb){

		l2.a.setX(xa);
		l2.a.setY(ya);
		l2.b.setX(xb);
		l2.b.setY(yb);
	}
	public void setl3(double xa,double ya,double xb,double yb){

		l3.a.setX(xa);
		l3.a.setY(ya);
		l3.b.setX(xb);
		l3.b.setY(yb);
	}

	
	public segmento getl1(){
		return l1;
	}
	public segmento getl2(){
		return l2;
	}	
	public segmento getl3(){
		return l3;
	}
}
