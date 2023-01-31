package ex8_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class RspMain1 {
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

		Scanner sc = new Scanner(System.in);

		String path = "C:\\embedded_LSJ\\work\\Ex_0130\\src\\ex8_work\\Rsp/";

		System.out.print("id : ");
		String id = sc.next();
		
		out : while (true) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			File file = null;
			Rsp R1 = null;

			file = new File(path + id + "_rsp.sav");

			// file�� ������ �о���� ������ ���ο� ��ü ����
			if (file.exists()) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					R1 = (Rsp) ois.readObject();
					R1.showScore();
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					try {
						ois.close();
						fis.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				} // try-catch
			} else {
				R1 = new Rsp(id);
			} // if(file.exists())

			int rsp_num;
			
			// ���������� �Է¹ޱ�
			in : while (true) {
				System.out.print("����(s) | ����(r) | ��(p) : ");
				String rsp = ""; 
				rsp = sc.next();

				switch (rsp) {
				case "r":
					rsp_num = 0;
					break in;
				case "s":
					rsp_num = 1;
					break in;
				case "p":
					rsp_num = 2;
					break in;
				default:
					System.out.println("�ٽ� �Է����ּ���");
					break;
				} // switch

			} // in : while

			R1.gameStart(rsp_num);

			// ��ü ���Ϸ� �����ϱ�
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(R1);
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			} // try-catch
			
			while(true) {
				System.out.print("���� ��? y | n : ");
				String yn = sc.next();
				
				if (yn.equalsIgnoreCase("n")) {
					System.out.println("��������!");
					break out;
				} else if(yn.equalsIgnoreCase("y")) {
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} // while
			
		} // out : while


	} // end of main
} // end of class
