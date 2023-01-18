package ex3_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println("t1 : "+t1.energy);
		
		Protoss p1 = new Protoss("셔틀", 200, true);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1 : "+p1.energy);
		
		Zerg z1 = new Zerg("히드라", 150, false);
		z1.decEnergy();
		System.out.println("z1 : "+z1.energy);
		
		
	} // end of main
} // end of class
