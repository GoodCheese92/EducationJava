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
		
		// ���� �ߺ��� ������� �����鼭
		// �������� ���ı���� ������ �ִ�.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(ts.size() != 6) {
			int n = rnd.nextInt(45)+1;
			ts.add(n);
		}
		
		// TreeSet�� ������������ �˾Ƽ� ���� �ȴ�.
		System.out.println(ts);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("ȫ�浿");
		ts2.add("apple");
		ts2.add("pineapple");
		ts2.add("banana");
		ts2.add("�踻��");
		
		System.out.println(ts2);
		
		
		
	} // end of main
} // end of class
