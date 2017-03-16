package Questao1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteRentagulo {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAreaRetangulo() {
		Retangulo r = new Retangulo();
		double l = 7;
		double a = 2;
		assertEquals(7.0, r.areaRetangulo(l, a));
	}

	

}
