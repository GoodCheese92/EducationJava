package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("C:/embedded_LSJ/bos�� ����.txt");
			bos = new BufferedOutputStream(fos);
			String str = "buffered��Ʈ���� ����.";
			bos.write(str.getBytes());

			// ������ ���������� ����ϱ� ���� �޼���
			bos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// close()�ϴ� �������� ����� �ȴ�. ����, �ݴ� ������ �� �����־�� �Ѵ�.
				// -> �Ǽ��� ���� ���� flush()�� ����Ѵ�.
				fos.close();
				bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of main
} // end of class
