package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		Bear bear = new Bear();
		
		System.out.println("�� : "+bear.getEye());
		System.out.println("�ٸ� : "+bear.getLegs());
		System.out.println("Ư¡ : "+bear.woong);
		
		System.out.println("----------------------------");
		
		Lion lion = new Lion();
		System.out.println("�� : "+lion.getEye());
		System.out.println("�ٸ� : "+lion.getLegs());
		System.out.println("Ư¡ : "+lion.hair);
		
		System.out.println("----------------------------");
		
		Elephant ele = new Elephant();
		System.out.println("�� : "+ele.getEye());
		System.out.println("�ٸ� : "+ele.getLegs());
		System.out.println("Ư¡ : "+ele.nose);
		
		System.out.println("----------------------------");
		
		Snake snake = new Snake();
		System.out.println("�� : "+snake.getEye());
		System.out.println("�ٸ� : "+snake.getLegs());
		System.out.println("Ư¡ : "+snake.sensor);
		
		
	} // end of main
} // end of class






















