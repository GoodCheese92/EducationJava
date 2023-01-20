package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		Random rnd = new Random();

		while(true) {
			int v = rnd.nextInt(45) + 1;
			hs.add(v);
			
			if(hs.size() == 6) {
				break;
			}
			
		} // while
		
		System.out.println(hs);
		
		// 값의 중복을 허용하지 않으면서
		// 오름차순 정렬기능을 가지고 있다.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(ts.size() != 6) {
			int n = rnd.nextInt(45)+1;
			ts.add(n);
		}
		
		// TreeSet은 오름차순으로 알아서 저장 된다.
		System.out.println(ts);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("홍길동");
		ts2.add("apple");
		ts2.add("pineapple");
		ts2.add("banana");
		ts2.add("김말똥");
		
		System.out.println(ts2);
		
		
		
	} // end of main
} // end of class
