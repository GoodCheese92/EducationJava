package menu_frame;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoticeFrame {
	public NoticeFrame(String restaurantName) {
		// frame ����
		JFrame frame = new JFrame("��������");
		frame.setLayout(null);
		frame.setBounds(800, 200, 400, 300);
		
		// �Խ��� ���� ���� �� ���
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		Font ta_font = new Font("�ü�ü", Font.PLAIN, 15);
		ta.setEditable(false);
		ta.setBounds(10, 10, 370, 200);
		ta.setBackground(new Color(255, 255, 255));
		
		// �Խ��� ���� ���� �о����
		FileReader fr = null;
		BufferedReader br = null;
		// �п�
		File file = new File("C:\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\notice_board\\notice_data" + "/" + restaurantName + " ��������/notice.txt");
		// ��
//		File file = new File("D:\\��������\\embedded_LSJ\\work\\Ex_0203_Java_Project\\src\\notice_board\\notice_data" + "/" + restaurantName + " ��������/notice.txt");
		
		ArrayList<String> notice_msg = new ArrayList<String>();
		try {
			if(file.exists()) {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String str = "";
				while((str = br.readLine()) != null){
//					System.out.println(str);
					notice_msg.add(str);
				} // while
			} else {
				System.out.println("������ �������� �ʽ��ϴ�.");
			}
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
		
		String msg = ""; 
		for(int i=0;i<notice_msg.size();i++) {
			msg += notice_msg.get(i) + "\n";
		} // for
		ta.setText(msg);
		
		// �ϴ� ��ư ����
		Font bt_font = new Font("�ü�ü", Font.BOLD, 20);
		JButton btn1 = new JButton("����");
		btn1.setBounds(10, 220, 175, 30);
		btn1.setFont(bt_font);
		
		JButton btn2 = new JButton("�ݱ�");
		btn2.setBounds(200, 220, 175, 30);
		btn2.setFont(bt_font);
		
		// frame�� ������Ʈ �߰�
		frame.add(ta);
		frame.add(btn1);
		frame.add(btn2);
		
		// btn1(����) ��ư ������
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE);
					fd.setVisible(true);
				} catch (Exception e2) {
					
				}
				
//				new NoticeSetFrame();
				
			}
		});
		
		// btn2(�ݱ�) ��ư ������
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		// frame �ݱ�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		// frame ���÷���
		frame.setVisible(true);
		
		
	} // end of constructor
} // end of class
