package ex6_base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64_main {
	public static void main(String[] args) {
		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		
		String text = "��ȣȭ �۾� start";	// ����
		
		// encoder�� ���� ��ȣȭ
		byte[] encodeByte = encoder.encode(text.getBytes());
		System.out.println("��ȣȭ : " + new String(encodeByte));
		
		// decoder�� ���� ��ȣȭ(��ȣȭ �ϰ� ���� ����Ʈ �迭�� encodeByte�� ����ش�)
		byte[] decodeByte = decoder.decode(encodeByte);
		System.out.println("��ȣȭ : " + new String(decodeByte));

		

	} // end of main
} // end of class
