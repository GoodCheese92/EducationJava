package test_ttt;

import java.io.File;

import menu_information.CoffeePath;
import path.ProjectMyPath;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(
				CoffeePath.PATH + "/Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo" + "/Coffee" + "/");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.list());
		
		
		File[] f = file.listFiles();
//		System.out.println(f.length);
	}
}
