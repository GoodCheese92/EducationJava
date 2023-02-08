package test_ttt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import menu_information.CoffeePath;
import menu_information.CoffeeProperties;

public class ReaderTest {
	public static void main(String[] args) {
		File file = new File(CoffeePath.PATH + "/Americano(ICE).txt");
		FileReader fr = null;
		BufferedReader br = null;
		CoffeeProperties cp = new CoffeeProperties();
		
		if(file.exists()) {
			System.out.println("파일 잘 찾음");
		} else {
			System.out.println("파일 XXX");
		}
		
		File file2 = new File(CoffeePath.PATH + "/Test.txt");
		
		try {
			fr = new FileReader(file2);
			br = new BufferedReader(fr);
			
			String msg = "";
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg2 = "";
			while((msg2 = br.readLine()) != null) {
				switch(msg2.charAt(0)){
				case '1':
					cp.setName(msg2);
					break;
				case '2':
					cp.setExplain(msg2);
					break;
				} // switch
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println(cp.getName());
		System.out.println(cp.getExplain());
		
	} // end of main
} // end of class
