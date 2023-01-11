package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		// String Ŭ������ �޼���(���)��
		// �޼����
		// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ����

		String name = "Hong Gil Dong";
		// 1. length
		int len = name.length(); // ()������ Ŀ�� �Űܳ��� ctrl + space ������ api�� ��ϵ� ������ ���´�.
		// �޼���� ������ ()�� ������ �ִ�.
		System.out.println("������ ���� : " + len);	// ������ ���̸� �����Ѵ�.
		
		// 2. index
		int index = name.indexOf('o');	// ó�� 'o'�� �ε����� �����Ѵ�.
		System.out.println("�� ù��° o�� ��ġ : " + index);
		
		// length�� 1���� ���� �������� �� 0���� ����.
		
		index = name.lastIndexOf('o');	// �� ���� 'o'�� �ε����� �����Ѵ�.
		System.out.println("�� ���� o�� ��ġ : "+index);
		
		// 3. charAt
		char ch = name.charAt(5);	// 5������ char�� �����Ѵ�.
		System.out.println("5�� ���� ������ ���� : "+ch);
		
		// 4. substring
		String s1 = name.substring(5);	// 5������� ������ ��� ������ �����´�.(5<=s1)
		System.out.println(s1);

		s1 = name.substring(5, 10);	// 5������� 10�� ������ ��� ������ �����´�.(5<=s1<10)
		System.out.println(s1);
		
		// 5. replace, replaceAll
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');	// .�� /�� �����Ѵ�.
		System.out.println(".�� /�� ġȯ : "+s1);
		s1 = name.replace("on", "ii");	// on�� il�� �����Ѵ�.
		System.out.println("on�� ii�� ġȯ : "+s1);
		
		name = name.replaceAll("ii","on");
		System.out.println("ii�� on���� ġȯ : "+name);
		
		name = "Kim. Lee. Park";
		String name2 = "Kim. Lee. Park";
		
		name = name.replace('.', '/');
		System.out.println("replace : "+name);
		
		name2 = name2.replaceAll(".", "/");	//.���� ��� �� �������� �����ϱ� ������ ���� �����
		System.out.println("replaceAll : "+name2);
		
		// 6. trim
		String id = "  hi hello  ";
		id = id.trim();		// ���� �յ��� �ǹ̾��� ������ ����
		System.out.println("trim ��� �� : "+id);
		System.out.println("trim ����� �� ���� : "+id.length());
		
		// 7. split
		String[] id2 = id.split(" ");	// Ư�� ������ �������� �迭 ���·� ������ �������ִ� �޼���
		System.out.println(id2[0]+" / "+id2[1]);
		
		// 8. equalsignoreCase
		String answer = "Apple";
		if(answer.equalsIgnoreCase("apple")) {	// ��ҹ��� �����ϰ� ������ ��
			System.out.println("���� ����.");
		}
		
		// String class�� method�� �ƴ�����, ������ ���� ����ϰ� �� �޼���
		// ���������� ���ڿ�(String)�� ������ ������ ���� ������ �ٲ㺸��!!
		String num = "10";		
		int a = Integer.parseInt(num);	// ��� �⺻ �ڷ������� �׻� �θ� Ŭ����(reference class)�� ������ �ִ�.
		a += 1;
		num += 1;
		System.out.println(a+" / "+num);
		
		
		
	} // end of main
} // end of class
