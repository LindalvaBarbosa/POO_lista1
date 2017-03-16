package Questao2;

public class Pessoa {
	private String nome;
	private  int idade;
	private String sexo;
	private double altura;
	private double peso;
	public Pessoa(String nome, int idade, String sexo, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String CalcularIMC(double peso, double altura){
		String s = null;
		double imc = peso/(altura*altura);
		if(imc <= 18.5){
			s = "Abaixo do peso normal";
		}else if(18.5 < imc || imc <= 25){
			s = "Peso Normal";
		}else if(25 < imc || imc <= 30){
			s = "Acima do peso normal";
		}else if (imc > 30){
			s = "Obesidade";
		}
		return s;		
	}
	public String toString(){
		return this.nome+" : "+this.CalcularIMC(peso, altura);
	}
	
	
  
}
