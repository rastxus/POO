package test;
import ej2.segmento;
import ej2.Punto;

public class SegmentoTest {
	
	public SegmentoTest(){
		
		segmento cuerda = new segmento();
		
		cuerda.setA(0, 0);
		cuerda.setB(1, 1);
		
		System.out.println(cuerda);
	}

}
