package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Poligono {
	private List<Ponto> pontos;

	public Poligono() {
		pontos = new ArrayList<>();
	}

	public void adicionaPontoPoligono(Ponto p) {
			pontos.add(p);
	}

	public void removePontoPoligono(Ponto p){
		try{
		for(Ponto p1 : pontos) {
			if (p1.getX() == p.getX() && p1.getY() == p.getY()) {
				pontos.remove(p1);
				
			}
		}
	}catch(java.util.ConcurrentModificationException a){
		a.toString();
	}
	}
	
	public double calculaAreaDoPoligono() {
		double area = 0;
		for (int i = 0; i < pontos.size()-1; i++) {
			area += pontos.get(i + 1).getY() * pontos.get(i).getX()- pontos.get(i + 1).getX() * pontos.get(i).getY();
		}
		return area;
	}
}



