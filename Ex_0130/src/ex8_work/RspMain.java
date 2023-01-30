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
		// ObjectStream사용하여 문제 해결하기!!
		// 결과 ---------------------

		// id : aaa
		// 0승 0무 0패
		// 가위(s) | 바위(r) | 보(p) : r
		// 당신이 이겼습니다.
		// 1승 0무 0패
		// 한판 더? y | n : n
		// 게임 종료

		// id : aaa
		// 1승 0무 0패
		// 가위(s) | 바위(r) | 보(p) : s
		// 비겼습니다.
		// 1승 1무 0패
		// 한판 더? y | n : n
		// 게임 종료
		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/";

		Scanner sc = new Scanner(System.in);

		// id 입력받기
		System.out.print("id : ");
		String id = sc.next();
		Rsp R1 = null;

		File file = new File(path + id + "_rsp.sav");

		// 객체 불러오기
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);

				R1 = (Rsp) ois.readObject();

				int rsp_num; // 가위바위보 할당 넘버

				while (true) {
					// 가위바위보 입력 받기
					out: while (true) {
						System.out.print("가위(s) | 바위(r) | 보(p) : ");
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
							System.out.println("다시 입력해주세요.");
							break;
						}
					} // out while

					// 가위바위보 하기
					R1.gameStart(rsp_num);

					// 진행 여부
					System.out.print("한판 더? y | n : ");
					String yn = sc.next();

					if (yn.equalsIgnoreCase("n")) {
						System.out.println("게임종료!");
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

		// 객체 저장하기
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
