package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO(Input, Output)
		// IO�� ����� ��Ʈ���� �ǹ��Ѵ�.
		// ��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		// �ܼ�(c:, d:, Ű����...)���� �����͸� �����´ٴ���
		// JVM�� �����͸� �ַܼ� �������� ���� �۾��� �� �� �ֵ��� �ϴ� Ŭ������
		// JVM���� �ַܼ� ���� �������� Output, �ܼ��� ���� JVM���� �о���̸� Input
		
		String path = "D:/��������/embedded_LSJ/test.txt";
		
		File f1 = new File(path);
		
		// f1�� ������ ��ΰ� ���� ������ ��� true
		// ���丮(����)������ ��� false
		if(f1.isFile()) {
			System.out.println("�뷮 : " + f1.length() + "byte");
		}
		
		
	} // end of main
} // end of class
