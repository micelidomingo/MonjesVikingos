package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Berserker extends Estado {

	public Berserker() {
		this.multiplicadorAtaque = new BigDecimal(3);
		this.multiplicadorDefensa = new BigDecimal(0.5);
	}

	@Override
	public Estado meditar() {
		return new Normal();
	}

}
