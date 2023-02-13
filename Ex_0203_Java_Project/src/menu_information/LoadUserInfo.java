package menu_information;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import path.ProjectMyPath;

public class LoadUserInfo {
	private UserInfomation[] userInfo;
	
	public UserInfomation[] getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfomation[] userInfo) {
		this.userInfo = userInfo;
	}

	File file;
	
	
	public LoadUserInfo() {
		// ÇÐ¿ø
		// file = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\user_information\\userInfo");
		// Áý
		file = new File(ProjectMyPath.path + "\\Ex_0203_Java_Project\\src\\user_information\\userInfo");
		
		userInfo = new UserInfomation[file.list().length];
		load();
		
	} // end of constructor
	
	public void load() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		for(int i=0; i<userInfo.length; i++) {
			userInfo[i] = new UserInfomation();
			try {
				fis = new FileInputStream(file + "/" + file.list()[i]);
				ois = new ObjectInputStream(fis);
				
				userInfo[i] = (UserInfomation) ois.readObject();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		} // for
	} // end of loadUserInfo()
	
	
} // end of class
