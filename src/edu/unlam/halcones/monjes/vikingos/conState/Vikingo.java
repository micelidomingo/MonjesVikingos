package edu.unlam.halcones.monjes.vikingos.conState;

import java.math.BigDecimal;

public abstract class Vikingo {
	public abstract void atacar(Vikingo vikingo);
	public abstract void recibirAtaque(BigDecimal danio);
	public abstract void meditar();
	
}
