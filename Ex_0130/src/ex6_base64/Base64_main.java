package ex6_base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64_main {
	public static void main(String[] args) {
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
		String text = "암호화 작업 start";	// 원본
		
		// encoder를 통해 암호화
		byte[] encodeByte = encoder.encode(text.getBytes());
		System.out.println("암호화 : " + new String(encodeByte));
		
		// decoder를 통해 복호화(복호화 하고 싶은 바이트 배열인 encodeByte를 담아준다)
		byte[] decodeByte = decoder.decode(encodeByte);
		System.out.println("복호화 : " + new String(decodeByte));

		

	} // end of main
} // end of class
