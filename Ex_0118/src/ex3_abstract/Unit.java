package ex3_abstract;

abstract public class Unit {
	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	abstract public void decEnergy();
	
	
	
} // end of class
