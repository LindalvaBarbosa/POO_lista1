package Questao8;

public class Funcionario extends Pessoa {
	private float salario;

	public Funcionario(String nome, Data data,float salario) {
		super(nome,data);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float calcularImposto(){
		float s = (float) (this.getSalario()*0.3);
		return s;
		
	}

	@Override
	public void imprimirDados() {
		System.out.println("Nome: "+this.getNome()+"\n"+" Ano:"+this.getData().getDia()+"/"+this.getData().getMes()+"/"+this.getData().getAno()+"\n"+" Salario:"+this.salario);
		
	}
	
	
   
}
