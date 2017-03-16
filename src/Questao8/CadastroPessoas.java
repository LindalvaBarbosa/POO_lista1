package Questao8;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
	 private List<Pessoa> p;
	 
	 
	 public CadastroPessoas() {
		this.p = new ArrayList<>();
	}
	 


	public CadastroPessoas(List<Pessoa> p) {
		this.p = p;
	}



	public boolean cadastraPessoa(Pessoa p1){
		 return this.p.add(p1);
	 }



	public List<Pessoa> getP() {
		return p;
	}



	public void setP(List<Pessoa> p) {
		this.p = p;
	}



	
	

}
