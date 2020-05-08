package edu.unlam.halcones.monjes.vikingos.conState;

import java.math.BigDecimal;

import edu.unlam.halcones.monjes.vikingos.conState.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;

public class MonjeVikingo extends Vikingo {
	private Estado estado;
	private BigDecimal vida;
	private BigDecimal ataque = BigDecimal.TEN;

	public MonjeVikingo() {
		this.estado = new Normal();
	}

	@Override
	public void atacar(Vikingo otherVikingo) {
		estado = estado.atacar();
		otherVikingo.recibirAtaque(ataque.add(estado.getMultiplicadorAtaque()));
	}

	@Override
	public void recibirAtaque(BigDecimal danio) {
		vida = vida.subtract(danio.multiply(estado.getMultiplicadorDefensa()));
		estado = estado.recibirAtaque();
	}

	@Override
	public void meditar() {
		estado = estado.meditar();
	}

	public Estado getEstado() {
		return estado;
	}

}
