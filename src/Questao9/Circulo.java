package Questao9;

public class Circulo implements FormasGeometricas{
	private float raio;
	

	public Circulo(float raio) {
		this.raio = raio;
	}

	@Override
	public float calcularAreaPerimetro() {
		float per = (float) (2*(Math.PI*raio));
		return per;
	}

	@Override
	public float calcularAreaForma() {
		float area = (float) (Math.PI*(raio*raio));
		return area;
	}

}
