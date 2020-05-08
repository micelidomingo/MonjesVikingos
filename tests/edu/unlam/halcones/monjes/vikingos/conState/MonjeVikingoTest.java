package edu.unlam.halcones.monjes.vikingos.conState;

import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonjeVikingoTest {

	MonjeVikingo monje;

	@Before
	public void setUp() {
		monje = new MonjeVikingo();
	}

	@Test
	public void creacionConEstadoNormal() {
		Assert.assertEquals(Normal.class, monje.getEstado().getClass());
	}

}
