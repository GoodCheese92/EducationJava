package ex3_io_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:/��������/embedded_LSJ/aaa";

		File f = new File(path);

		// ����Ŭ���� f�� ��ΰ� ���������� �����ϴ����� Ȯ���ϴ� �޼���
		if (f.exists()) { // f.exist() == true
			System.out.println("�������� �� ���̾��");
		} else {
			System.out.println("�������� �ʴ� ��ΰ� �ֽ��ϴ�.");
			f.mkdirs(); // ��������
			// mkdir�� ��� �� ���� 2���� ��ΰ� ���ٸ� �������� �ʴ´�.
			// mkdirs ��� �� ���� ���� �� ���������.
		}

	} // end of main
} // end of class
