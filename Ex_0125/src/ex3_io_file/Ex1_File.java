package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		// IO(Input, Output)
		// IO는 입출력 스트림을 의미한다.
		// 스트림이란, 데이터를 입출력하기 위한 일종의 통로
		// 콘솔(c:, d:, 키보드...)에서 데이터를 가져온다던지
		// JVM의 데이터를 콘솔로 내보내는 등의 작업을 할 수 있도록 하는 클래스들
		// JVM에서 콘솔로 값을 내보내면 Output, 콘솔의 값을 JVM에서 읽어들이면 Input
		
		String path = "D:/국비지원/embedded_LSJ/test.txt";
		
		File f1 = new File(path);
		
		// f1이 접근한 경로가 파일 형식일 경우 true
		// 디렉토리(폴더)형식일 경우 false
		if(f1.isFile()) {
			System.out.println("용량 : " + f1.length() + "byte");
		}
		
		
	} // end of main
} // end of class
