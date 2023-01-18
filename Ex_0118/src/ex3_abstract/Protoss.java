package ex3_abstract;

public class Protoss extends Unit{
	
	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy--; // super.energy를 가르킨다.
	}
	
} // end of class
