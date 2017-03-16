package Questao3;

public class MainPoligono {

	public static void main(String[] args) {
		Poligono pg = new Poligono();
		Ponto p1 = new Ponto(3.8, 7);
		pg.adicionaPontoPoligono(p1);
		Ponto p2 = new Ponto(3.8, 7);
		pg.adicionaPontoPoligono(p2);
        System.out.println(pg.calculaAreaDoPoligono());
		pg.removePontoPoligono(p2);

	}

}
