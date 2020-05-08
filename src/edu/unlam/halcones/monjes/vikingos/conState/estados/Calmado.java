package edu.unlam.halcones.monjes.vikingos.conState.estados;

public class Calmado extends Estado{

	@Override
	public Estado atacar() {
		return new Normal();
	}
	
	@Override
	public Estado meditar() {
		return this;
	}
}
