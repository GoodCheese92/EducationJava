package ex7_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamWork_ex {
	public static void main(String[] args) {
		// byte����� ��Ʈ���� ����� ��!!
		// �ƹ���ο� file.txt�� ����� ������ �־� ����.
		// ����� file.txt�� �о ȸ�������� �ƴ����� �Ǵ��Ͻÿ�.

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;

		String ori = ""; // ����
		String rev = ""; // ������ ����� ������ ����

		try {
			fis = new FileInputStream(f);
			fis.read(b_read);

			// �о�� ������ ori�� ����
			ori = new String(b_read).trim();

			// ������ ����� rev�� ����
			for (int i = ori.length() - 1; i >= 0; i--) {
				rev += ori.charAt(i);
			} // for

			// ȸ���� �Ǵ�
			if (ori.equals(rev)) {
				System.out.println(ori + " : ȸ����");
			} else {
				System.out.println(ori + " : ȸ���� �ƴ�");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
