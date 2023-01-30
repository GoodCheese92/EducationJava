package ex8_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		// ObjectStream����Ͽ� ���� �ذ��ϱ�!!
		// ��� ---------------------

		// id : aaa
		// 0�� 0�� 0��
		// ����(s) | ����(r) | ��(p) : r
		// ����� �̰���ϴ�.
		// 1�� 0�� 0��
		// ���� ��? y | n : n
		// ���� ����

		// id : aaa
		// 1�� 0�� 0��
		// ����(s) | ����(r) | ��(p) : s
		// �����ϴ�.
		// 1�� 1�� 0��
		// ���� ��? y | n : n
		// ���� ����
		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/";

		Scanner sc = new Scanner(System.in);

		// id �Է¹ޱ�
		System.out.print("id : ");
		String id = sc.next();
		Rsp R1 = null;

		File file = new File(path + id + "_rsp.sav");

		// ��ü �ҷ�����
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);

				R1 = (Rsp) ois.readObject();

				int rsp_num; // ���������� �Ҵ� �ѹ�

				while (true) {
					// ���������� �Է� �ޱ�
					out: while (true) {
						System.out.print("����(s) | ����(r) | ��(p) : ");
						String rsp = sc.next();
						switch (rsp) {
						case "r":
							rsp_num = 0;
							break out;
						case "s":
							rsp_num = 1;
							break out;
						case "p":
							rsp_num = 2;
							break out;
						default:
							System.out.println("�ٽ� �Է����ּ���.");
							break;
						}
					} // out while

					// ���������� �ϱ�
					R1.gameStart(rsp_num);

					// ���� ����
					System.out.print("���� ��? y | n : ");
					String yn = sc.next();

					if (yn.equalsIgnoreCase("n")) {
						System.out.println("��������!");
						break;
					}

				} // while

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			} // try-catch
		} else { // if(file.exists())
			R1 = new Rsp(id);
		}

		// ��ü �����ϱ�
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(R1);

			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
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
