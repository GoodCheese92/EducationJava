package ex7_work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamWork {
	public static void main(String[] args) {
		// byte����� ��Ʈ���� ����� ��!!
		// �ƹ���ο� file.txt�� ����� ������ �־� ����.
		// ����� file.txt�� �о ȸ�������� �ƴ����� �Ǵ��Ͻÿ�.

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/file.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// outputStream���� ���� �����
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			String msg = "a1221a"; // ���Ͽ� ���� ����
			bos.write(msg.getBytes());	// ���ڿ��� byte�� ��ȯ �� ���� ���� 

			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		String str1 = "";
		String str2 = "";
		
		// ��λ� file �о����
		try {
			if (file.exists()) {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				byte[] b_read = new byte[(int) file.length()];

				bis.read(b_read);
				str1 = new String(b_read);
				
				// �Ųٷ� ���ڿ� ����
				for (int i = b_read.length - 1; i >= 0; i--) {
//				System.out.print(b_read[i]+" ");
//				System.out.println();
					str2 += (char) b_read[i];	// byte�� ����Ǿ� �ֱ� ������ char�� ĳ����
				} // for
			} else {
				System.out.println("������ �������� �ʽ��ϴ�.");
			} // if-else

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		System.out.println(str1);
		System.out.println(str2);

		if (str1.equals(str2)) {
			System.out.println("ȸ���� �Դϴ�.");
		} else {
			System.out.println("ȸ������ �ƴմϴ�.");
		}

	} // end of main
} // end of class
