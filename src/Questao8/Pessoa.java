package Questao8;

public abstract class Pessoa {
	private String nome;
	private Data data;

	public Pessoa() {
		this.nome = " ";
		this.data = null;
	}

	public Pessoa(String nome, Data data) {
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public abstract void imprimirDados();

}
