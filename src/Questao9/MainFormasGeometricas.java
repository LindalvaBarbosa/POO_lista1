package Questao9;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

public class MainFormasGeometricas {

	public static void main(String[] args) {
		ArrayList<FormasGeometricas> fg = new ArrayList<>();
		FormasGeometricas r = new Rentagulos(3, 2);
		FormasGeometricas r2 = new Rentagulos(4, 1);
		FormasGeometricas q = new Quadrado(2);
		FormasGeometricas q2 = new Quadrado(2);
		FormasGeometricas ra = new Circulo(3);
		FormasGeometricas ra2 = new Circulo(1);
		fg.add(r);
		fg.add(r2);
		fg.add(q);
		fg.add(q2);
		fg.add(ra);
		fg.add(ra2);
		float t = 0;
		for(FormasGeometricas f: fg){
			float a = f.calcularAreaForma();
			System.out.println("Area: "+a);
			float p = f.calcularAreaPerimetro();
			System.out.println("Perimetro: "+p);
			t += a;
			
		}
		System.out.println("Total: "+t);
		
	}

}
