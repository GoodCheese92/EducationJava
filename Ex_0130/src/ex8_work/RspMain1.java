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

			// file이 있으면 읽어오고 없으면 새로운 객체 생성
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
			
			// 가위바위보 입력받기
			in : while (true) {
				System.out.print("가위(s) | 바위(r) | 보(p) : ");
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
					System.out.println("다시 입력해주세요");
					break;
				} // switch

			} // in : while

			R1.gameStart(rsp_num);

			// 객체 파일로 저장하기
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
				System.out.print("한판 더? y | n : ");
				String yn = sc.next();
				
				if (yn.equalsIgnoreCase("n")) {
					System.out.println("게임종료!");
					break out;
				} else if(yn.equalsIgnoreCase("y")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} // while
			
		} // out : while


	} // end of main
} // end of class
