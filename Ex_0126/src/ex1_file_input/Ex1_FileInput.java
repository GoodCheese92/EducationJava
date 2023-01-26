package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		String path = MyPath.PATH + "/test.txt"; // D:/��������/embedded_LSJ/test.txt
		File f = new File(path);

		// ���� ��λ� ������ ���ٸ�...!!
		if (f.exists()) {
			// ���� Ŭ������ ����� InputStream�� ����
			try {
				FileInputStream fis = new FileInputStream(f); // ���Ͽ� �����ִ� ������ �о���� ���� FileInputStream ���

				int code = -1;

				// fis�� 1byte������ ���� �����´�.
				// fis��Ʈ���� �� �̻� �о� �� ������ ���ٸ� -1�� ��ȯ�Ѵ�.
				// byte������ �����͸� �дٰ� EOF(End of File)�� �����ٴ� ���� �ǹ�
				while ((code = fis.read()) != -1) { // ���Ͽ� �����ִ� ������ �� ���ھ� ���������� �������ٰ� -1�� ������ �׸��д�.
					System.out.print((char) code);

				} // while
				
				// ����� �Ϸ�� ��Ʈ���� �ݵ�� �ݾ���� �Ѵ�.
				fis.close();
				
			} catch (Exception e) { // fis.read�� ������ ��� ���ؼ� Exception���� ����
				e.printStackTrace();
			}

		}

	} // end of main
} // end of class





