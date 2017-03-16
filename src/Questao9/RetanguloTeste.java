package Questao9;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RetanguloTeste {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCalcularAreaPerimetro() {
		FormasGeometricas r = new Rentagulos(3, 2);
		assertEquals(6, r.calcularAreaForma(), 2);
		
		
	}

	@Test
	public void testCalcularAreaForma() {
		FormasGeometricas r = new Rentagulos(3, 2);
		assertEquals(10, r.calcularAreaPerimetro(), 2);
	}

}
