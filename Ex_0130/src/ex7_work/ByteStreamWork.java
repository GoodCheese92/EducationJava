package ex7_work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamWork {
	public static void main(String[] args) {
		// byte기반의 스트림을 사용할 것!!
		// 아무경로에 file.txt를 만들고 내용을 넣어 저장.
		// 저장된 file.txt를 읽어서 회문수인지 아닌지를 판단하시오.

		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex7_work/file.txt";
		File file = new File(path);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// outputStream으로 파일 만들기
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			String msg = "a1221a"; // 파일에 내용 쓰기
			bos.write(msg.getBytes());	// 문자열을 byte로 변환 후 내용 저장 

			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		String str1 = "";
		String str2 = "";
		
		// 경로상에 file 읽어오기
		try {
			if (file.exists()) {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				byte[] b_read = new byte[(int) file.length()];

				bis.read(b_read);
				str1 = new String(b_read);
				
				// 거꾸로 문자열 저장
				for (int i = b_read.length - 1; i >= 0; i--) {
//				System.out.print(b_read[i]+" ");
//				System.out.println();
					str2 += (char) b_read[i];	// byte로 저장되어 있기 때문에 char로 캐스팅
				} // for
			} else {
				System.out.println("파일이 존재하지 않습니다.");
			} // if-else

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		System.out.println(str1);
		System.out.println(str2);

		if (str1.equals(str2)) {
			System.out.println("회문수 입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
		}

	} // end of main
} // end of class
