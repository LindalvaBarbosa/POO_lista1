package Questao9;

public class Quadrado implements FormasGeometricas{
	private float lado_tam;
	
	

	public Quadrado(float lado_tam) {
		this.lado_tam = lado_tam;
	}

	public float getLado_tam() {
		return lado_tam;
	}

	public void setLado_tam(float lado_tam) {
		this.lado_tam = lado_tam;
	}


	@Override
	public float calcularAreaPerimetro() {
		float per = 4*this.lado_tam;
		return per;
	}

	@Override
	public float calcularAreaForma() {
		float a = this.lado_tam*this.lado_tam;
		return a;
	}

}
