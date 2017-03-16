package Questao8;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GerenteTeste {
    Data d;
	@Before
	public void setUp() throws Exception {
		d = new Data(22, 2, 2000);
		
	}

	@Test
	public void testCalcularImposto() {
		Funcionario fg = new Gerente("Maria", d, 1000,"Vendas");
		assertEquals(500, fg.calcularImposto(), 0.001);
		
	}

}
