package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		Bear bear = new Bear();
		
		System.out.println("传 : "+bear.getEye());
		System.out.println("促府 : "+bear.getLegs());
		System.out.println("漂隆 : "+bear.woong);
		
		System.out.println("----------------------------");
		
		Lion lion = new Lion();
		System.out.println("传 : "+lion.getEye());
		System.out.println("促府 : "+lion.getLegs());
		System.out.println("漂隆 : "+lion.hair);
		
		System.out.println("----------------------------");
		
		Elephant ele = new Elephant();
		System.out.println("传 : "+ele.getEye());
		System.out.println("促府 : "+ele.getLegs());
		System.out.println("漂隆 : "+ele.nose);
		
		System.out.println("----------------------------");
		
		Snake snake = new Snake();
		System.out.println("传 : "+snake.getEye());
		System.out.println("促府 : "+snake.getLegs());
		System.out.println("漂隆 : "+snake.sensor);
		
		
	} // end of main
} // end of class






















