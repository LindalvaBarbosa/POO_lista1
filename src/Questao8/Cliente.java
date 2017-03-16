package Questao8;

public class Cliente extends Pessoa{
	private int codigo;
	
	public Cliente(String nome, Data data,int codigo) {
		super(nome, data);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void imprimirDados(){
		System.out.println("Nome: "+this.getNome()+"\n"+"Data:"+this.getData().getDia()+"/"+this.getData().getMes()+"/"+this.getData().getAno()+"\n"+"codigo: "+this.codigo);
		
	}

}
