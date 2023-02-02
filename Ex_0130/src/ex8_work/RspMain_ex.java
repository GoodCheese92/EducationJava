package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class RspMain_ex {
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

		Rsp_ex rsp = new Rsp_ex();
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.print("id : ");
		String id = sc.next();
		rsp.setId(id);

		// 게임 로드
		GameLoad_ex gl = new GameLoad_ex();
		rsp = gl.scoreLoader(id);
		if (rsp == null) {
			rsp = new Rsp_ex();
			rsp.setId(id);
		} else {
			win = rsp.getWin();
			draw = rsp.getDraw();
			lose = rsp.getLose();
		}

		System.out.printf("%d승 %d무 %d패\n", win, draw, lose);

		while (true) {
			// 컴퓨터가 랜덤으로 한 가지 값을 생성
			// 0 : 가위, 1 : 바위, 2 : 보
			int random = new Random().nextInt(3);

			System.out.print("가위(s) | 바위(r) | 보(p) : ");
			String user = sc.next();

			int userCnt = 0;

			if (user.equalsIgnoreCase("s")) {
				userCnt = 0;
			} else if (user.equalsIgnoreCase("r")) {
				userCnt = 1;
			} else if (user.equalsIgnoreCase("p")) {
				userCnt = 2;
			} // while

			// 경우의 수 판별
			if (userCnt - random == -2 || userCnt - random == 1) {
				System.out.println("당신이 이겼습니다.");
				rsp.setWin(++win);
			} else if (userCnt - random == 0) {
				System.out.println("비겼습니다.");
				rsp.setDraw(++draw);
			} else {
				System.out.println("당신이 졌습니다.");
				rsp.setLose(++lose);
			}

			System.out.printf("%d승 %d무 %d패\n", win, draw, lose);

			System.out.print("한판 더? y | n : ");
			String select = sc.next();

			if (!select.equalsIgnoreCase("y")) {
				System.out.println("게임 종료");
				break;
			}

		} // while

		// 게임 종료 후 rsp객체를 저장
		GameSave_ex gs = new GameSave_ex();
		gs.scoreWriter(rsp);

	} // end of main
} // end of class
