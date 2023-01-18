package ex3_abstract;

public class Zerg extends Unit {
	
	public Zerg(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 10;
	}
} // end of class
