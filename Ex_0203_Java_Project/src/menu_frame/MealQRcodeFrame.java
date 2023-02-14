package menu_frame;

import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import path.ProjectMyPath;

public class MealQRcodeFrame implements ItemListener {
	private String restaurantName;

	public MealQRcodeFrame(String restaurantName) {
		this.restaurantName = restaurantName;
	} // end of constructor

	@Override
	public void itemStateChanged(ItemEvent e) {
		switch ((String) e.getItem()) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
			new QRcodeframe(restaurantName, (String) e.getItem());
			break;
		default:
			System.out.println("실행할 수 없습니다.");
			break;
		} // switch
	}

} // end of class

class QRcodeframe extends JFrame {
	public QRcodeframe(String restaurantName, String count) {
		setBounds(750, 150, 190, 200);
		setTitle("로그인 정보");
		setLayout(null);

		File file = new File(ProjectMyPath.path + "/Ex_0203_Java_Project\\src\\menu_information\\qrcode" + "/"
				+ restaurantName + " 식권 " + count + "장.png");
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		ImageIcon img1 = new ImageIcon();

		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				byte[] img_read = new byte[(int) file.length()];

				bis.read(img_read);

				img1 = new ImageIcon(img_read);

				img1 = setIconSize(img1, 160, 160);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

		JLabel qr_lb = new JLabel(img1);
		qr_lb.setBounds(0, 0, 170, 170);

		add(qr_lb);

		// frame 닫기 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setResizable(false);
		setVisible(true);
	} // end of constructor

	public ImageIcon setIconSize(ImageIcon icon, int width, int height) {
		Image img1 = icon.getImage();
		Image img2 = img1.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		ImageIcon icon_res = new ImageIcon(img2);
		return icon_res;
	} // end of changeIconSize()

} // end of class