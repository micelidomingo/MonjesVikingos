package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Colerico extends Estado {

	public Colerico() {
		this.multiplicadorAtaque = new BigDecimal(2);
		this.multiplicadorDefensa = new BigDecimal(2);
	}

	@Override
	public Estado recibirAtaque() {
		return new Berserker();
	}

}
