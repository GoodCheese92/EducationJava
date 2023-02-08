package menu_frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import menu_information.CafeMenu;
import menu_information.LoadCoffeeObject;

public class CafeMenuFrame extends JFrame {
	public CafeMenuFrame() {
		// frame 세팅
		setBounds(400, 50, 1200, 900);
		setTitle("카페");
		setLayout(null);
		setResizable(false);
		
		// topPanel 세팅--------------------------------------
		JPanel top_panel = new JPanel();
		GridLayout top_gl = new GridLayout(1, 0, 10, 10);
		top_panel.setBackground(new Color(153, 255, 153));
		top_panel.setBounds(10, 10, 1175, 65);
		// top_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		top_panel.setLayout(top_gl);
		
		// menu button 세팅
		JButton[] menu_btn = new JButton[4];
		CafeMenu cm = new CafeMenu();
		Font ct_font = new Font("hy신명조", Font.BOLD, 20);
		for(int i=0; i<menu_btn.length;i++) {
			menu_btn[i] = new JButton(cm.getMenuCategory().get(i));
			menu_btn[i].setFont(ct_font);
			menu_btn[i].setBackground(Color.WHITE);
			top_panel.add(menu_btn[i]);
		} // for
		
		
		// -------------------------------------------------
		
		// Panel1(Hot) 세팅
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 80, 1175, 450);
		
		GridLayout gl = new GridLayout(2, 4, 10, 10);
		panel1.setLayout(gl);
		
		// panel1에 버튼 세팅 -----------------------------------
		LoadCoffeeObject lco = new LoadCoffeeObject();
		ImageIcon img1 = new ImageIcon(lco.getCoffee()[0].getImgicon().getImage());
		
		// 커피 정보 객체 읽어오기
		
		JButton[] btn1 = new JButton[8];
		for(int i=0; i<btn1.length; i++) {
			btn1[i] = new JButton();
			
		} // for
		
		
		
		
		btn1[0].setIcon(img1);
		// -------------------------------------------------
		
		// Panel2(Ice) 세팅
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(10, 10, 1175, 500);
		
		panel2.setLayout(gl);
		
		// panel1에 버튼 세팅 -----------------------------------
		JButton[] btn2 = new JButton[8];
		for(int i=0; i<btn2.length; i++) {
			btn2[i] = new JButton();
			
		} // for
		// -------------------------------------------------
		
		// next, previous button 세팅
		JButton n_btn = new JButton("->");
		n_btn.setBounds(1150, 250, 50, 100);
		n_btn.setVisible(true);
		
		// bottom panel 세팅 ----------------------------------
		JPanel bottom_panel = new JPanel();
		bottom_panel.setBackground(new Color(100, 100, 200));
		bottom_panel.setBounds(10, 540, 1175, 320);
		bottom_panel.setLayout(null);
		
		// 메뉴 고른 것 보여줄 textarea 세팅
		JTextArea content_ta = new JTextArea();
		content_ta.setFont(new Font("휴먼명조", Font.PLAIN, 15));
		content_ta.setEnabled(false);
		content_ta.setBounds(10, 10, 900, 300);
		
		// 전체삭제 및 결제하기 버튼 세팅
		Font rm_font = new Font("hy헤드라인M", Font.BOLD, 20);
		JButton removeAll_btn = new JButton("<html><center>전체<br>삭제<center></html>"); 
		removeAll_btn.setFont(rm_font);
		removeAll_btn.setBounds(920, 10, 250, 110);
		
		JButton pay_btn = new JButton("결 제");
		pay_btn.setFont(rm_font);
		pay_btn.setBounds(920, 130, 250, 180);
		
		// 버튼 추가하기
		bottom_panel.add(content_ta);
		bottom_panel.add(removeAll_btn);
		bottom_panel.add(pay_btn);
		
		// -------------------------------------------------
		
		
		
		
		// frame에 panel 추가
		add(top_panel);
		add(panel1);
		add(bottom_panel);
		add(n_btn);
		for(int i=0; i<btn1.length; i++) {
			panel1.add(btn1[i]);
		} // for
		
		// frame 닫기 감지
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		// frame 보이기
		setVisible(true);
		
	} // end of constructor
} // end of class
