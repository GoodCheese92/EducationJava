package notice_board;

public class NoticeBoardMain {
	public static void main(String[] args) {
		NoticeWriter nw = new NoticeWriter();
		nw.writeSave("테스트용");
		
		NoticeReader nr = new NoticeReader();
		nr.fileReader();
		
	} // end of main
} // end of class
