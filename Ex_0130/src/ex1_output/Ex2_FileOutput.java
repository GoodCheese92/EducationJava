package ex1_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		// finally에서 close()하기 위해서 멤버 변수로 선언
		FileOutputStream fos = null;
		String path = "C:/embedded_LSJ/fileOutput예제.txt";
		File f = new File(path);

		try {
			fos = new FileOutputStream(f, true); // 매개변수에 true를 추가해주면 누적해서 내용이 추가됨, false이면 원래 내용 삭제 후 갱신
			// msg 변경 시 원래 있던 내용 삭제 후 -> 새로운 내용으로 바뀜
			String msg = "new라인을 입력해";
			String msg2 = "\n반가워요";

			// msg.getBytes() : String타입의 문장을 byte[]로 변경해주는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());

		} catch (Exception e) {

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
