package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Normal extends Estado {

	public Normal() {
		this.multiplicadorAtaque = BigDecimal.ONE;
		this.multiplicadorDefensa = BigDecimal.ONE;
	}

	@Override
	public Estado recibirAtaque() {
		return new Colerico();
	}

	@Override
	public Estado meditar() {
		return new Calmado();
	}
}
