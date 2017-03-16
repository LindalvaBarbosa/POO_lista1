package Questao3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestePoligono {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testCalculaAreaDoPoligono() {
		Ponto p1 = new Ponto(3,3);
		Poligono pol = new Poligono();
		pol.adicionaPontoPoligono(p1);
		Ponto p2 = new Ponto(3,3);
		pol.adicionaPontoPoligono(p2);;
		assertEquals(0.5,pol.calculaAreaDoPoligono(), 1);
	}

}
