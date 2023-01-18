package problem.standard_of_java.chapter6;

import java.io.ObjectInputStream.GetField;

public class Chapter6Main {
	public static void main(String[] args) {
		Problem3 s1 = new Problem3();
		
		System.out.println("=====6-3=====");
		s1.name = "È«±æµ¿";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;
		
		System.out.println("ÀÌ¸§ : "+s1.name);
		System.out.println("ÃÑÁ¡ : "+s1.getTotal());
		System.out.println("Æò±Õ : "+s1.getAverage());
		
		System.out.println("=====6-5=====");
		Problem3 s2 = new Problem3("È«±æµ¿", 1, 1, 100, 60, 76);
		
		System.out.println(s2.info());
		
		System.out.println("=====6-6=====");
		Problem6 p6 = new Problem6();
		System.out.println(p6.getDistance(1, 1, 2, 2));
		
		System.out.println("======6-7=====");
		Problem7 p7 = new Problem7(1, 1);
		p7.getDistance(2, 2);
		
		System.out.println("======6-9=====");
		
		
		
		
	} // end of main
} // end of class
