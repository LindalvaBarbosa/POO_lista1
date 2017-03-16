package Questao9;

public abstract class Quadrilateros implements FormasGeometricas {
	private float lados[];

	public Quadrilateros(float[] lados) {
		this.lados = new float[4];
		this.lados = lados;
	}
	public float calcularAreaPerimetro(){
		float p = 0;
		for (float l: this.lados){
			p+=l*2;
		}
		return p;
	}
	
	

}
