package ex5_object_output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("홍길동");
		person.setAge(20);

		String path = "C:/embedded_LSJ/person.sav";

		// 객체를 통째로 출력하는데 사용하는 output stream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(path);
			// 클래스를 저장하기 위해 ObjectOutputStream을 사용한다.
			oos = new ObjectOutputStream(fos);

			oos.writeObject(person); // Person객체를 저장
			// 주소가 저장이 된다.

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
