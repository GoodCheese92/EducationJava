package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("ȫ�浿");
		person.setAge(20);

		String path = "C:/embedded_LSJ/person.sav";

		// ��ü�� ��°�� ����ϴµ� ����ϴ� output stream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(path);
			// Ŭ������ �����ϱ� ���� ObjectOutputStream�� ����Ѵ�.
			oos = new ObjectOutputStream(fos);

			oos.writeObject(person); // Person��ü�� ����
			// �ּҰ� ������ �ȴ�.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of main
} // end of class
