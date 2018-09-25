package toyTeste;

import org.junit.Test;
import org.junit.Assert;

public class MatematicaTest {

	@Test
	public void testaFatoriaZero() throws MatematicaException {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(0);
		Assert.assertEquals(resposta, 1);
	}

	@Test(expected = MatematicaException.class)
	public void testaFatorialMenorZero() throws MatematicaException {
		Matematica matematica = new Matematica();
		matematica.fatorial(-5);
	}
	
	@Test
	public void testaFatorialUm() throws MatematicaException {
		Matematica matematica = new Matematica();
		int resposta = matematica.fatorial(1);
		Assert.assertEquals(resposta, 1);
	}

}
