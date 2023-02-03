package notice_board;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NoticeWriter {
	private String path = "C:/embedded_LSJ/work/Ex_0203_Java_Project/src/notice_board/notice_data/";
	private String file_name = "notice.txt";
	File file = new File(path);
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	// 게시판 내용 저장하기
	public void writeSave(String msg) {
		// file 폴더가 없으면 폴더 만들기
		if (!file.exists()) {
			file.mkdirs();
		}

		try {
			fw = new FileWriter(path + file_name);
			bw = new BufferedWriter(fw);

			bw.write(msg);

			bw.flush();
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of writeSave()

} // end of class
