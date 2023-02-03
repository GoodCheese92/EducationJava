package notice_board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class NoticeReader {
	// 파일에 저장되어 있는 공지사항 내용 읽어오기
	private String path = "C:/embedded_LSJ/work/Ex_0203_Java_Project/src/notice_board/notice_data/";
	private String file_name = "notice.txt";
	File file = new File(path);
	FileReader fr = null;
	BufferedReader br = null;

	public void fileReader() {
		try {
			fr = new FileReader(path + file_name);
			br = new BufferedReader(fr);

			// 게시판 출력
			String msg = "";
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}

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

	} // end of fileReader()

} // end of class
