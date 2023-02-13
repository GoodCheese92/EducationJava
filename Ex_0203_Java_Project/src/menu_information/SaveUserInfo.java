package menu_information;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SaveUserInfo implements ActionListener {

	private TextField id;
	private TextField pw;
	private TextField name;
	private TextField birthday;
	private TextField phoneNum;
	
	private JFrame frame;

	File file = new File("C:\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\user_information\\userInfo");

	FileOutputStream fos = null;
	ObjectOutputStream oos = null;

	public SaveUserInfo(TextField id, TextField pw, TextField name, TextField birthday, TextField phoneNum, JFrame frame) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
		this.frame = frame;
	} // end of constructor

	UserInfomation userInfo = new UserInfomation();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!file.exists()) {
			file.mkdirs();
		} else {
			System.out.println("경로가 존재합니다.");
		}
		try {
			userInfo.setId(id.getText().trim());
			userInfo.setPw(Integer.parseInt(pw.getText().trim()));
			userInfo.setName(name.getText().trim());
			userInfo.setBirthday(Integer.parseInt(birthday.getText().trim()));
			userInfo.setPhoneNum(Integer.parseInt(phoneNum.getText().trim()));

			fos = new FileOutputStream(file + "/" + userInfo.getId().trim() + ".info");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(userInfo);
			
			frame.dispose();
		} catch (

		Exception e2) {
			e2.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}

	} // end of actionPerformed()

} // end of class
