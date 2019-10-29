package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {
	public ClaseExamen clase = new ClaseExamen();
	@Test
	public void test1() {
		assertEquals(0, clase.metodoAProbar(3,2),0);
	}

}
