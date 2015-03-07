package test;
import ej2.Poligono;
import ej2.Punto;

public class PoligonoTest {
	
	public PoligonoTest(){
		
		Poligono triangulo = new Poligono();
		
		triangulo.setl1(0,0,1,1);
		triangulo.setl2(1,1,0,1);
		triangulo.setl3(0,1,0,0);
		
		System.out.println(triangulo);
	}

}
