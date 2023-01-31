package ex8_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GameSave_ex {

	public void scoreWriter(Rsp_ex rsp) {
		// C:/embedded_LSJ/work/Ex_0130/src/ex8_work/RspGame/�����̸�.sav
		String path = "C:/embedded_LSJ/work/Ex_0130/src/ex8_work/RspGame/" + rsp.getId() + ".sav";
		File f = new File("C:/embedded_LSJ/work/Ex_0130/src/ex8_work/RspGame/");

		if (!f.exists()) {
			f.mkdirs();
		}

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(rsp); // ����Ϸ�!!
			System.out.println("����Ϸ�!!");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	} // end of scoreWriter()

} // end of class
