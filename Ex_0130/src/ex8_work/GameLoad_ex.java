package ex8_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GameLoad_ex {
	
	Rsp_ex rsp;
	
	
	public Rsp_ex scoreLoader(String id) {
		
		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex8_work/RspGame/" + id + ".sav";
		
		File f = new File("C:/embedded_LSJ/work/Ex_0130/src/ex8_work/RspGame/");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if(f.exists()) {
			try {
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				rsp = (Rsp_ex) ois.readObject();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		return rsp;
	} // end of scoreLoader()
	
	
} // end of class
