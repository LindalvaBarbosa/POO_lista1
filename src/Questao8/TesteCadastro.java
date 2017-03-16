package Questao8;
import java.util.ArrayList;
import java.util.List;

public class TesteCadastro {

	public static void main(String[] args) {
		ArrayList<Pessoa> p = new ArrayList<>();
		Data d = new Data(11, 4, 1990);
		Funcionario f1 = new Gerente("Maria", d, 880, "vendas");
		p.add(f1);
		Data d2 = new Data(23, 6, 1987);
		Funcionario f2 = new Funcionario("Silvio", d2, 356);
		p.add(f2);
		Data d3 = new Data(1, 4, 1990);
		Funcionario f3 = new Gerente("vivian", d3, 880, "administração");
		p.add(f3);
		Data d4 = new Data(14, 12, 1994);
		Cliente cl = new Cliente("Silvia", d4, 001);
		p.add(cl);
		
		
		CadastroPessoas cp = new CadastroPessoas(p);
		try{
			List<Pessoa> a = new ArrayList<>();
			a = cp.getP();
			for(Pessoa pe: a ){
				pe.imprimirDados();
			}
		}catch(NullPointerException e){
		   System.out.println("Objeto nulo");
		}
		
		
		
		
		

	}

}
