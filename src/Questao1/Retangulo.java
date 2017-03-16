package Questao1;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo() {
		this.altura = 0.0;
		this.largura = 0.0;
	}
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	public boolean equals(Object o){
		if(o ==null){
			return false;
		}else if(o instanceof Retangulo){
		   Retangulo r = (Retangulo) o;
		   if(this.altura == r.altura && this.largura == r.largura){
			   return true;
		   }
		}
		return false;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double areaRetangulo(double l, double a){
		double area = l*a;
		return area;
		
	}
	public String toString(){
		return "Area do retangulo: "+this.areaRetangulo(largura, altura)+ " Perimetro: "+this.perimetroRetangulo(largura, altura);
		
	}
	public double perimetroRetangulo(double l, double a){
		double p = 2*(l*a);
		return p;
		
	}

}
