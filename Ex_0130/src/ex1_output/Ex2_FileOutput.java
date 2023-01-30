package ex1_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		// finally���� close()�ϱ� ���ؼ� ��� ������ ����
		FileOutputStream fos = null;
		String path = "C:/embedded_LSJ/fileOutput����.txt";
		File f = new File(path);

		try {
			fos = new FileOutputStream(f, true); // �Ű������� true�� �߰����ָ� �����ؼ� ������ �߰���, false�̸� ���� ���� ���� �� ����
			// msg ���� �� ���� �ִ� ���� ���� �� -> ���ο� �������� �ٲ�
			String msg = "new������ �Է���";
			String msg2 = "\n�ݰ�����";

			// msg.getBytes() : StringŸ���� ������ byte[]�� �������ִ� �޼���
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());

		} catch (Exception e) {

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
