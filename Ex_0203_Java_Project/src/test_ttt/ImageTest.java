package test_ttt;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageTest {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setBounds(500, 100, 500, 400);
		
		
		ImageIcon img1 = new ImageIcon("아메리카노(Hot).jpg");
		ser t = new ser();
		
		ImageIcon img1_res = t.ImageSize(img1, 200, 200);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		File file = new File("C:\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\menu_information\\CafeMenuInfo\\아메리카노(ICE)/아메리카노(Ice).jpg");
		
		ImageIcon img2 = null;
		ImageIcon img2_res = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] br_read = new byte[(int)file.length()];
			System.out.println(file.length());
			
			bis.read(br_read);
			
			img2 = new ImageIcon(br_read);
			System.out.println(br_read);
			img2_res = t.ImageSize(img2, 200, 200);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		JButton btn = new JButton(img2_res);
		btn.setBounds(20, 20, 200, 200);
		
		
		
		frame.add(btn);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
		
		
	} // end of main
	
} // end of class

class ser {
	public ImageIcon ImageSize (ImageIcon img, int x, int y) {
		Image x_img = img.getImage();
		Image y_img = x_img.getScaledInstance(x, y, Image.SCALE_SMOOTH);
		ImageIcon next_img = new ImageIcon(y_img); 
		
		return next_img;
	} // end of setImageSize() 
}


