package menu_frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import menu_information.CafeMenu;

public class CafeMenuFrame extends JFrame {
	public CafeMenuFrame() {
		// frame ����
		setBounds(400, 50, 1200, 900);
		setTitle("ī��");
		setLayout(null);
		setResizable(false);
		
		// topPanel ����--------------------------------------
		JPanel top_panel = new JPanel();
		top_panel.setBackground(new Color(153, 255, 153));
		top_panel.setBounds(10, 10, 1175, 65);
		top_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		// menu button ����
		JButton[] menu_btn = new JButton[4];
		CafeMenu cm = new CafeMenu();
		Font ct_font = new Font("hy�Ÿ���", Font.BOLD, 20);
		for(int i=0; i<menu_btn.length;i++) {
			menu_btn[i] = new JButton(cm.getMenuCategory().get(i));
			top_panel.setFont(ct_font);
			top_panel.add(menu_btn[i]);
		} // for
		
		
		// -------------------------------------------------
		
		// Panel1(Hot) ����
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 80, 1175, 450);
		
		GridLayout gl = new GridLayout(2, 4, 10, 10);
		panel1.setLayout(gl);
		
		// panel1�� ��ư ���� -----------------------------------
		ImageIcon img1 = new ImageIcon("�Ƹ޸�ī��(Hot).jpg");
		
		JButton[] btn1 = new JButton[8];
		for(int i=0; i<btn1.length; i++) {
			btn1[i] = new JButton();
			
		} // for
		btn1[0].setIcon(img1);
		// -------------------------------------------------
		
		// Panel2(Ice) ����
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(10, 10, 1175, 500);
		
		panel2.setLayout(gl);
		
		// panel1�� ��ư ���� -----------------------------------
		JButton[] btn2 = new JButton[8];
		for(int i=0; i<btn2.length; i++) {
			btn2[i] = new JButton();
			
		} // for
		// -------------------------------------------------
		
		// next, previous button ����
		JButton n_btn = new JButton("->");
		n_btn.setBounds(1150, 250, 50, 100);
		n_btn.setVisible(true);
		
		// bottom panel ���� ----------------------------------
		JPanel bottom_panel = new JPanel();
		bottom_panel.setBackground(new Color(100, 100, 200));
		bottom_panel.setBounds(10, 540, 1175, 320);
		bottom_panel.setLayout(null);
		
		// �޴� �� �� ������ textarea ����
		JTextArea content_ta = new JTextArea();
		content_ta.setFont(new Font("�޸ո���", Font.PLAIN, 15));
		content_ta.setEnabled(false);
		content_ta.setBounds(10, 10, 900, 300);
		
		// ��ü���� �� �����ϱ� ��ư ����
		Font rm_font = new Font("hy������M", Font.BOLD, 20);
		JButton removeAll_btn = new JButton("<html><center>��ü<br>����<center></html>"); 
		removeAll_btn.setFont(rm_font);
		removeAll_btn.setBounds(920, 10, 250, 110);
		
		JButton pay_btn = new JButton("�� ��");
		pay_btn.setFont(rm_font);
		pay_btn.setBounds(920, 130, 250, 180);
		
		// ��ư �߰��ϱ�
		bottom_panel.add(content_ta);
		bottom_panel.add(removeAll_btn);
		bottom_panel.add(pay_btn);
		
		// -------------------------------------------------
		
		
		
		
		// frame�� panel �߰�
		add(top_panel);
		add(panel1);
		add(bottom_panel);
		add(n_btn);
		for(int i=0; i<btn1.length; i++) {
			panel1.add(btn1[i]);
		} // for
		
		// frame �ݱ� ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		// frame ���̱�
		setVisible(true);
		
	} // end of constructor
} // end of class
