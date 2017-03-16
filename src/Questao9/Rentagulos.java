package Questao9;

public class Rentagulos implements FormasGeometricas{
	private float base;
	private float alt;
	

	public Rentagulos(float base, float alt) {
		this.base = base;
		this.alt = alt;
	}

	@Override
	public float calcularAreaPerimetro() {
		float per = 2*this.alt + 2*this.base;
		return per;
	}

	@Override
	public float calcularAreaForma() {
		float area = base * alt; 
		return area;
	}

}
