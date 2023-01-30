package ex5_object_output;

import java.io.Serializable;

// Serializable�� �������ִ� �͸����ε� ��ü ����ȭ�� �����Ѵ�.
public class Person implements Serializable {
	// ��ü�� ��Ʈ������ ��°�� �����ϱ� ���ؼ��� ���ο� �޸� ������
	// �Ӽ��� �޼������ �Ϸķ� �����ؼ� �����ص־� �Ѵ�.
	// Serializable�� ���� ����ȭ�� ���������� �ڵ�ȭ ���ش�.
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

} // end of class
