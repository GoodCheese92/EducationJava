package ex7_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStreamWork {
	public static void main(String[] args) {
		// char����� ��Ʈ���� ����� ��!
		// Ư�� ��ο� char.txt������ ����� �ƹ� �����̳� �ִ´�.
		// char.txt�� �о ���뿡 ���ĺ� �빮�ڿ� �ҹ��� ������ ���� ���

		// �빮�� : 5
		// �ҹ��� : 2

		FileWriter fw = null;
		BufferedWriter bw = null;

		// char.txt ���� �����
		try {
			fw = new FileWriter("C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt");
			bw = new BufferedWriter(fw);

			bw.write("AsBSSDFdsgsdSDFFHsn1560126vsdonoi"); // ���Ͽ� ���� ����

			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		FileReader fr = null;
		BufferedReader br = null;
		String str = "";

		// ���� ���� �о�ͼ� ��ҹ��� ���ϱ�
		try {
			fr = new FileReader("C:/embedded_LSJ/work/Ex_0130/src/ex7_work/char.txt");
			br = new BufferedReader(fr);

			// �� ���ڿ��� ���� ������ �о����
			str = br.readLine();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		// �о�� ���ڿ� ��ҹ��� Ȯ��
		int upper_count = 0;
		int lower_count = 0;
		int num_count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower_count++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper_count++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num_count++;
			}
		} // for
		
		System.out.println(str);
		System.out.printf("�빮��  : %d��\n", upper_count);
		System.out.printf("�ҹ���  : %d��\n", lower_count);
		System.out.printf("����  : %d��\n", num_count);

	} // end of main
} // end of class
