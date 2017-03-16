package Questao8;

public class Gerente extends Funcionario {
	private String area;
	
	public Gerente(String nome, Data d, float salario, String area) {
		super(nome, d, salario);
		this.area = area;
		
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float calcularImposto(){
		float s = (float) (this.getSalario()*0.5);
		return s;
		
	}
	public void imprimirDados() {
		System.out.println("Nome: "+this.getNome()+"\n"+" Ano:"+this.getData().getDia()+"/"+this.getData().getMes()+"/"+this.getData().getAno()+"\n"+" Area: "+this.area);
		
	}
	
	

}
