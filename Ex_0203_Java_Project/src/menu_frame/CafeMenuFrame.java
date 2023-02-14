package menu_frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import menu_information.CafeButtonClickListener;
import menu_information.CafeMenu;
import menu_information.CafeRemoveButtonListener;
import menu_information.CoffeeProperties;
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
		for (int i = 0; i < menu_btn.length; i++) {
			menu_btn[i] = new JButton(cm.getMenuCategory().get(i));
			menu_btn[i].setFont(ct_font);
			menu_btn[i].setBackground(Color.WHITE);
			top_panel.add(menu_btn[i]);
		} // for

		// 중간 패널 -------------------------------------------------

		// Panel1(Hot) 세팅 ------------------------------
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 80, 1175, 450);

		JPanel panel1_2 = new JPanel();
		panel1_2.setBackground(Color.WHITE);
		panel1_2.setBounds(10, 80, 1175, 450);

		GridLayout gl = new GridLayout(2, 4, 10, 10);
		panel1.setLayout(gl);
		panel1_2.setLayout(gl);

		// panel1 Coffee(Hot)에 버튼 세팅
		LoadCoffeeObject lco = new LoadCoffeeObject("CoffeeObjectSave(Hot)");

		// 커피(hot) 정보 객체 읽어오기
		HashMap<Integer, JButton> hm1_btn_hot1 = new HashMap<Integer, JButton>();
		HashMap<Integer, JButton> hm1_btn_hot2 = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm1_coffee_hot1 = new HashMap<Integer, CoffeeProperties>();
		HashMap<Integer, CoffeeProperties> hm1_coffee_hot2 = new HashMap<Integer, CoffeeProperties>();
		JButton[] btn1 = new JButton[8];
		JButton[] btn1_2 = new JButton[8];
		for (int i = 0; i < btn1.length; i++) {
			btn1[i] = new JButton();
			btn1_2[i] = new JButton();
			hm1_btn_hot1.put(i, btn1[i]);
			hm1_btn_hot2.put(i, btn1_2[i]);
		} // for

		for (int i = 0; i < lco.getCoffee().length; i++) {
			// 8개를 기준으로 panel에 담는 버튼과 커피정보 나누기
			switch (i / 8) {
			case 0:
				ImageIcon img1 = new ImageIcon(lco.getCoffee()[i].getImgicon().getImage());
				btn1[i % 8].setIcon(img1);
				btn1[i % 8].setText("<html><center>" + lco.getCoffee()[i].getName() + "<br>"
						+ lco.getCoffee()[i].getPrice() + "원</center></html>");
				btn1[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn1[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm1_coffee_hot1.put(i % 8, lco.getCoffee()[i]);
				break;
			case 1:
				ImageIcon img2 = new ImageIcon(lco.getCoffee()[i].getImgicon().getImage());
				btn1_2[i % 8].setIcon(img2);
				btn1_2[i % 8].setText("<html><center>" + lco.getCoffee()[i].getName() + "<br>"
						+ lco.getCoffee()[i].getPrice() + "원</center></html>");
				btn1_2[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn1_2[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm1_coffee_hot2.put(i % 8, lco.getCoffee()[i]);
				break;
			} // switch
		} // for
			// -------------------------------------------------

		// Panel2 Coffee (Ice) 세팅 --------------------------
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(10, 80, 1175, 450);

		panel2.setLayout(gl);

		JPanel panel2_2 = new JPanel();
		panel2_2.setBackground(Color.WHITE);
		panel2_2.setBounds(10, 80, 1175, 450);

		panel2_2.setLayout(gl);

		// panel2 Coffee(Ice)에 버튼 세팅
		LoadCoffeeObject lco2 = new LoadCoffeeObject("CoffeeObjectSave(Ice)");
		HashMap<Integer, JButton> hm2_btn_ice1 = new HashMap<Integer, JButton>();
		HashMap<Integer, JButton> hm2_btn_ice2 = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm2_coffee_ice1 = new HashMap<Integer, CoffeeProperties>();
		HashMap<Integer, CoffeeProperties> hm2_coffee_ice2 = new HashMap<Integer, CoffeeProperties>();

		// 커피(ice) 정보 객체 읽어오기
		JButton[] btn2 = new JButton[8];
		JButton[] btn2_2 = new JButton[8];
		for (int i = 0; i < btn2.length; i++) {
			btn2[i] = new JButton();
			btn2_2[i] = new JButton();
			hm2_btn_ice1.put(i, btn2[i]);
			hm2_btn_ice2.put(i, btn2_2[i]);
		} // for

		for (int i = 0; i < lco2.getCoffee().length; i++) {
			switch (i / 8) {
			case 0:
				ImageIcon img = new ImageIcon(lco2.getCoffee()[i].getImgicon().getImage());
				btn2[i % 8].setIcon(img);
				btn2[i % 8].setText("<html><center>" + lco2.getCoffee()[i].getName() + "<br>"
						+ lco2.getCoffee()[i].getPrice() + "원</center></html>");
				btn2[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn2[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm2_coffee_ice1.put(i, lco2.getCoffee()[i]);
				break;
			case 1:
				ImageIcon img2 = new ImageIcon(lco2.getCoffee()[i].getImgicon().getImage());
				btn2_2[i % 8].setIcon(img2);
				btn2_2[i % 8].setText("<html><center>" + lco2.getCoffee()[i].getName() + "<br>"
						+ lco2.getCoffee()[i].getPrice() + "원</center></html>");
				btn2_2[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn2_2[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm2_coffee_ice2.put(i % 8, lco2.getCoffee()[i]);
				break;
			} // switch
		} // for
			// -------------------------------------------------

		// Panel3 Drink (Hot) 세팅 --------------------------
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(10, 80, 1175, 450);

		panel3.setLayout(gl);

		JPanel panel3_2 = new JPanel();
		panel3_2.setBackground(Color.WHITE);
		panel3_2.setBounds(10, 80, 1175, 450);

		panel3_2.setLayout(gl);

		// panel3 Drink(Hot)에 버튼 세팅
		LoadCoffeeObject lco3 = new LoadCoffeeObject("DrinkObjectSave(Hot)");
		HashMap<Integer, JButton> hm3_btn_hot1 = new HashMap<Integer, JButton>();
		HashMap<Integer, JButton> hm3_btn_hot2 = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm3_drink_hot1 = new HashMap<Integer, CoffeeProperties>();
		HashMap<Integer, CoffeeProperties> hm3_drink_hot2 = new HashMap<Integer, CoffeeProperties>();

		// 음료(hot) 정보 객체 읽어오기
		JButton[] btn3 = new JButton[8];
		JButton[] btn3_2 = new JButton[8];
		for (int i = 0; i < btn3.length; i++) {
			btn3[i] = new JButton();
			btn3_2[i] = new JButton();
			hm3_btn_hot1.put(i, btn3[i]);
			hm3_btn_hot2.put(i, btn3_2[i]);
		} // for

		for (int i = 0; i < lco3.getDrink().length; i++) {
			switch (i / 8) {
			case 0:
				ImageIcon img = new ImageIcon(lco3.getDrink()[i].getImgicon().getImage());
				btn3[i % 8].setIcon(img);
				btn3[i % 8].setText("<html><center>" + lco3.getDrink()[i].getName() + "<br>"
						+ lco3.getDrink()[i].getPrice() + "원</center></html>");
				btn3[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn3[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm3_drink_hot1.put(i % 8, lco3.getDrink()[i]);
				break;
			case 1:
				ImageIcon img2 = new ImageIcon(lco3.getDrink()[i].getImgicon().getImage());
				btn3_2[i % 8].setIcon(img2);
				btn3_2[i % 8].setText("<html><center>" + lco3.getDrink()[i].getName() + "<br>"
						+ lco3.getDrink()[i].getPrice() + "원</center></html>");
				btn3_2[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn3_2[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm3_drink_hot2.put(i % 8, lco3.getDrink()[i]);
				break;
			} // switch
		} // for
			// -------------------------------------------------

		// Panel4 Drink (Ice) 세팅 --------------------------
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(10, 80, 1175, 450);

		panel4.setLayout(gl);

		JPanel panel4_2 = new JPanel();
		panel4_2.setBackground(Color.WHITE);
		panel4_2.setBounds(10, 80, 1175, 450);

		panel4_2.setLayout(gl);

		// panel4 Drink(Ice)에 버튼 세팅
		LoadCoffeeObject lco4 = new LoadCoffeeObject("DrinkObjectSave(Ice)");
		HashMap<Integer, JButton> hm4_btn_ice1 = new HashMap<Integer, JButton>();
		HashMap<Integer, JButton> hm4_btn_ice2 = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm4_drink_ice1 = new HashMap<Integer, CoffeeProperties>();
		HashMap<Integer, CoffeeProperties> hm4_drink_ice2 = new HashMap<Integer, CoffeeProperties>();

		// 음료(hot) 정보 객체 읽어오기
		JButton[] btn4 = new JButton[8];
		JButton[] btn4_2 = new JButton[8];
		for (int i = 0; i < btn4.length; i++) {
			btn4[i] = new JButton();
			btn4_2[i] = new JButton();
			hm4_btn_ice1.put(i, btn4[i]);
			hm4_btn_ice2.put(i, btn4_2[i]);
		} // for

		for (int i = 0; i < lco4.getDrink().length; i++) {
			switch (i / 8) {
			case 0:
				ImageIcon img = new ImageIcon(lco4.getDrink()[i].getImgicon().getImage());
				btn4[i % 8].setIcon(img);
				btn4[i % 8].setText("<html><center>" + lco4.getDrink()[i].getName() + "<br>"
						+ lco4.getDrink()[i].getPrice() + "원</center></html>");
				btn4[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn4[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm4_drink_ice1.put(i % 8, lco4.getDrink()[i]);
				break;
			case 1:
				ImageIcon img1 = new ImageIcon(lco4.getDrink()[i].getImgicon().getImage());
				btn4_2[i % 8].setIcon(img1);
				btn4_2[i % 8].setText("<html><center>" + lco4.getDrink()[i].getName() + "<br>"
						+ lco4.getDrink()[i].getPrice() + "원</center></html>");
				btn4_2[i % 8].setHorizontalTextPosition(JButton.CENTER);
				btn4_2[i % 8].setVerticalTextPosition(JButton.BOTTOM);
				hm4_drink_ice2.put(i % 8, lco4.getDrink()[i]);
				break;
			} // switch
		} // for
			// -------------------------------------------------

		// ------------------------------------------ 중간패널 끝

		// 다음 버튼, 이전 버튼 panel 세팅 ------------------------------
		JPanel pn_panel = new JPanel();
		pn_panel.setBounds(10, 535, 1175, 50);
		pn_panel.setBackground(new Color(102, 153, 102, 200));
		pn_panel.setLayout(null);

		// page 정보 label 세팅
		JLabel page_lb = new JLabel();
		page_lb.setBounds(568, 0, 50, 50);
		page_lb.setText("- 1 -");
		page_lb.setFont(new Font("휴먼명조", Font.BOLD, 20));

		// next, previous button 세팅
		JButton n_btn_coffeeHot = new JButton("다음");
		JButton n_btn_coffeeIce = new JButton("다음");
		JButton n_btn_drinkHot = new JButton("다음");
		JButton n_btn_drinkIce = new JButton("다음");
		n_btn_coffeeHot.setBounds(630, 5, 100, 40);
		n_btn_coffeeHot.setVisible(true);
		n_btn_coffeeIce.setBounds(630, 5, 100, 40);
		n_btn_coffeeIce.setVisible(false);
		n_btn_drinkHot.setBounds(630, 5, 100, 40);
		n_btn_drinkHot.setVisible(false);
		n_btn_drinkIce.setBounds(630, 5, 100, 40);
		n_btn_drinkIce.setVisible(false);

		JButton p_btn_coffeeHot = new JButton("이전");
		p_btn_coffeeHot.setBounds(445, 5, 100, 40);
		p_btn_coffeeHot.setVisible(false);
		JButton p_btn_coffeeIce = new JButton("이전");
		p_btn_coffeeIce.setBounds(445, 5, 100, 40);
		p_btn_coffeeIce.setVisible(false);
		JButton p_btn_drinkHot = new JButton("이전");
		p_btn_drinkHot.setBounds(445, 5, 100, 40);
		p_btn_drinkHot.setVisible(false);
		JButton p_btn_drinkIce = new JButton("이전");
		p_btn_drinkIce.setBounds(445, 5, 100, 40);
		p_btn_drinkIce.setVisible(false);

		pn_panel.add(n_btn_coffeeHot);
		pn_panel.add(n_btn_coffeeIce);
		pn_panel.add(p_btn_coffeeHot);
		pn_panel.add(p_btn_coffeeIce);
		pn_panel.add(n_btn_drinkHot);
		pn_panel.add(n_btn_drinkIce);
		pn_panel.add(p_btn_drinkHot);
		pn_panel.add(p_btn_drinkIce);
		pn_panel.add(page_lb);
		// -------------------------------------------------------

		// bottom panel 세팅 ----------------------------------
		JPanel bottom_panel = new JPanel();
		bottom_panel.setBackground(new Color(150, 150, 200, 200));
		bottom_panel.setBounds(10, 590, 1175, 270);
//		bottom_panel.setPreferredSize(new Dimension(1175, 320));
		bottom_panel.setLayout(null);

		// 메뉴 고른 것 보여줄 text area 세팅
		JPanel Text_panel = new JPanel();
		Text_panel.setBounds(10, 5, 900, 200);
		Text_panel.setBackground(Color.white);
		JScrollPane Text_panel_scroll = new JScrollPane(Text_panel);
		Text_panel_scroll.setBounds(10, 5, 900, 200);
		GridBagLayout text_gbl = new GridBagLayout();
		GridBagConstraints text_gbc = new GridBagConstraints();
		text_gbc.fill = GridBagConstraints.BOTH;
//		text_gbc.weighty = 0.1;
		text_gbc.gridheight = 1;

		int size = hm1_coffee_hot1.size() + hm1_coffee_hot2.size() + hm2_coffee_ice1.size() + hm2_coffee_ice2.size()
				+ hm3_drink_hot1.size() + hm3_drink_hot2.size() + hm4_drink_ice1.size() + hm4_drink_ice2.size();
		JLabel[] content_lb = new JLabel[size * 3];

		for (int i = 0; i < content_lb.length; i++) {
			content_lb[i] = new JLabel();
			if (i >= 3) {
				content_lb[i].setText(" ");
			}
			content_lb[i].setFont(new Font("휴먼명조", Font.BOLD, 13));
			content_lb[i].setHorizontalAlignment(JLabel.CENTER);

			text_gbc.gridx = i % 3;
			text_gbc.gridy = i / 3;
			if (i % 3 == 0) {
				text_gbc.weightx = 0.3;
			} else if (i % 3 == 1) {
				text_gbc.weightx = 0.1;
			} else {
				text_gbc.weightx = 0.2;
			}

			content_lb[i].setBorder(new LineBorder(Color.BLACK, 1, false));

			text_gbl.setConstraints(content_lb[i], text_gbc);
			Text_panel.add(content_lb[i], text_gbc);
		} // for
		Text_panel.setLayout(text_gbl);
		content_lb[0].setText("주문 내역");
		content_lb[1].setText("수량");
		content_lb[2].setText("가격");

		// 총 가격 label area 세팅
		JPanel totalPrice_panel = new JPanel();
		totalPrice_panel.setLayout(null);
		totalPrice_panel.setBounds(10, 220, 900, 40);
		bottom_panel.add(totalPrice_panel);

		// 총 가격 label
		Font totalPrice_font = new Font("hy헤드라인m", Font.BOLD, 18);
		JLabel totalprice_lb = new JLabel();
		totalprice_lb.setText("총 : 0원");
		totalprice_lb.setBounds(750, 5, 250, 40);
		totalprice_lb.setFont(totalPrice_font);
		totalPrice_panel.add(totalprice_lb);

		// 전체삭제 및 결제하기 버튼 세팅
		Font rm_font = new Font("hy헤드라인M", Font.BOLD, 20);
		JButton removeAll_btn = new JButton("<html><center>전체<br>삭제<center></html>");
		removeAll_btn.setFont(rm_font);
		removeAll_btn.setBounds(920, 5, 250, 80);

		JButton pay_btn = new JButton("결 제");
		pay_btn.setFont(rm_font);
		pay_btn.setBounds(920, 95, 250, 165);

		// 버튼 추가하기
		bottom_panel.add(Text_panel_scroll);
		bottom_panel.add(removeAll_btn);
		bottom_panel.add(pay_btn);

		// -------------------------------------------------

		// frame에 panel 추가
		add(top_panel);
		add(panel1);
		add(panel1_2);
		panel1_2.setVisible(false);
		add(panel2);
		panel2.setVisible(false);
		add(panel2_2);
		panel2_2.setVisible(false);
		add(panel3);
		panel3.setVisible(false);
		add(panel3_2);
		panel3_2.setVisible(false);
		add(panel4);
		panel4.setVisible(false);
		add(panel4_2);
		panel4_2.setVisible(false);
		add(bottom_panel);
		add(pn_panel);

		for (int i = 0; i < btn1.length; i++) {
			panel1.add(btn1[i]);
			panel1_2.add(btn1_2[i]);
			panel2.add(btn2[i]);
			panel2_2.add(btn2_2[i]);
			panel3.add(btn3[i]);
			panel3_2.add(btn3_2[i]);
			panel4.add(btn4[i]);
			panel4_2.add(btn4_2[i]);
		} // for

		// top_panel에 menu_button 버튼 감지
		// 커피(HOT) 버튼 감지
		menu_btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel1_2.setVisible(false);
				panel2_2.setVisible(false);
				panel3_2.setVisible(false);
				panel4_2.setVisible(false);
				n_btn_coffeeHot.setVisible(true);
				n_btn_coffeeIce.setVisible(false);
				p_btn_coffeeHot.setVisible(false);
				p_btn_coffeeIce.setVisible(false);
				n_btn_drinkHot.setVisible(false);
				n_btn_drinkIce.setVisible(false);
				p_btn_drinkHot.setVisible(false);
				p_btn_drinkIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
				repaint();
			}
		});

		// 커피(ICE) 버튼 감지
		menu_btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel1_2.setVisible(false);
				panel2_2.setVisible(false);
				panel3_2.setVisible(false);
				panel4_2.setVisible(false);
				n_btn_coffeeHot.setVisible(false);
				n_btn_coffeeIce.setVisible(true);
				p_btn_coffeeHot.setVisible(false);
				p_btn_coffeeIce.setVisible(false);
				n_btn_drinkHot.setVisible(false);
				n_btn_drinkIce.setVisible(false);
				p_btn_drinkHot.setVisible(false);
				p_btn_drinkIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
				repaint();
			}
		});

		// 음료(HOT) 버튼 감지
		menu_btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel1_2.setVisible(false);
				panel2_2.setVisible(false);
				panel3_2.setVisible(false);
				panel4_2.setVisible(false);
				n_btn_coffeeHot.setVisible(false);
				n_btn_coffeeIce.setVisible(false);
				p_btn_coffeeHot.setVisible(false);
				p_btn_coffeeIce.setVisible(false);
				n_btn_drinkHot.setVisible(true);
				n_btn_drinkIce.setVisible(false);
				p_btn_drinkHot.setVisible(false);
				p_btn_drinkIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
				repaint();
			}
		});

		// 음료(ICE) 버튼 감지
		menu_btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel1_2.setVisible(false);
				panel2_2.setVisible(false);
				panel3_2.setVisible(false);
				panel4_2.setVisible(false);
				n_btn_coffeeHot.setVisible(false);
				n_btn_coffeeIce.setVisible(false);
				p_btn_coffeeHot.setVisible(false);
				p_btn_coffeeIce.setVisible(false);
				n_btn_drinkHot.setVisible(false);
				n_btn_drinkIce.setVisible(true);
				p_btn_drinkHot.setVisible(false);
				p_btn_drinkIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
				repaint();
			}
		});

		// --------------------------------------------------------

		// 중간 패널 coffee&drink 버튼 감지 ------------------------------
		// coffee(Hot) 버튼 감지
		int total_price = 0;
		CafeButtonClickListener[] cbcl = new CafeButtonClickListener[hm1_coffee_hot1.size()];
		for (int i = 0; i < hm1_coffee_hot1.size(); i++) {
			cbcl[i] = new CafeButtonClickListener(i, hm1_coffee_hot1, content_lb, totalprice_lb);
			btn1[i].addActionListener(cbcl[i]);

		} // for

		CafeButtonClickListener[] cbcl1_2 = new CafeButtonClickListener[hm1_coffee_hot2.size()];
		for (int i = 0; i < hm1_coffee_hot2.size(); i++) {
			cbcl1_2[i] = new CafeButtonClickListener(i, hm1_coffee_hot2, content_lb, totalprice_lb);
			btn1_2[i].addActionListener(cbcl1_2[i]);

		} // for

		// coffee(Ice) 버튼 감지
		for (int i = 0; i < hm2_coffee_ice1.size(); i++) {
			btn2[i].addActionListener(new CafeButtonClickListener(i, hm2_coffee_ice1, content_lb, totalprice_lb));
			total_price += hm2_coffee_ice1.get(i).getPrice();
		} // for

		for (int i = 0; i < hm2_coffee_ice2.size(); i++) {
			btn2_2[i].addActionListener(new CafeButtonClickListener(i, hm2_coffee_ice2, content_lb, totalprice_lb));
			total_price += hm2_coffee_ice2.get(i).getPrice();
		} // for

		// drink(Hot) 버튼 감지
		for (int i = 0; i < hm3_drink_hot1.size(); i++) {
			btn3[i].addActionListener(new CafeButtonClickListener(i, hm3_drink_hot1, content_lb, totalprice_lb));
			total_price += hm3_drink_hot1.get(i).getPrice();
		} // for

		for (int i = 0; i < hm3_drink_hot2.size(); i++) {
			btn3_2[i].addActionListener(new CafeButtonClickListener(i, hm3_drink_hot2, content_lb, totalprice_lb));
			total_price += hm3_drink_hot2.get(i).getPrice();
		} // for

		// drink(Ice) 버튼 감지
		for (int i = 0; i < hm4_drink_ice1.size(); i++) {
			btn4[i].addActionListener(new CafeButtonClickListener(i, hm4_drink_ice1, content_lb, totalprice_lb));
			total_price += hm4_drink_ice1.get(i).getPrice();
		} // for

		for (int i = 0; i < hm4_drink_ice2.size(); i++) {
			btn4[i].addActionListener(new CafeButtonClickListener(i, hm4_drink_ice2, content_lb, totalprice_lb));
			total_price += hm4_drink_ice2.get(i).getPrice();
		} // for

		// -------------------------중간 패널 coffee&drink 버튼 감지 끝

		// coffee(Hot) 다음 버튼 n_btn 감지
		n_btn_coffeeHot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel1.setVisible(false);
				panel1_2.setVisible(true);
				n_btn_coffeeHot.setVisible(false);
				p_btn_coffeeHot.setVisible(true);
				page_lb.setText("- 2 -");
				pn_panel.repaint();
			}
		});

		// coffee(Hot) 이전 버튼 p_btn 감지
		p_btn_coffeeHot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel1_2.setVisible(false);
				n_btn_coffeeHot.setVisible(true);
				p_btn_coffeeHot.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
			}
		});

		// coffee(Ice) 다음 버튼 n_btn_coffeeIce 감지
		n_btn_coffeeIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel2_2.setVisible(true);
				n_btn_coffeeIce.setVisible(false);
				p_btn_coffeeIce.setVisible(true);
				page_lb.setText("- 2 -");
				pn_panel.repaint();
			}
		});

		// coffee(Ice) 이전 버튼 p_btn_coffeeIce 감지
		p_btn_coffeeIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(true);
				panel2_2.setVisible(false);
				n_btn_coffeeIce.setVisible(true);
				p_btn_coffeeIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
			}
		});

		// drink(Hot) 다음 버튼 n_btn 감지
		n_btn_drinkHot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(false);
				panel3_2.setVisible(true);
				n_btn_drinkHot.setVisible(false);
				p_btn_drinkHot.setVisible(true);
				page_lb.setText("- 2 -");
				pn_panel.repaint();
			}
		});

		// drink(Hot) 이전 버튼 p_btn 감지
		p_btn_drinkHot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel3.setVisible(true);
				panel3_2.setVisible(false);
				n_btn_drinkHot.setVisible(true);
				p_btn_drinkHot.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
			}
		});
		
		// drink(Ice) 다음 버튼 n_btn_coffeeIce 감지
		n_btn_drinkIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(false);
				panel4_2.setVisible(true);
				n_btn_drinkIce.setVisible(false);
				p_btn_drinkIce.setVisible(true);
				page_lb.setText("- 2 -");
				pn_panel.repaint();
			}
		});

		// coffee(Ice) 이전 버튼 p_btn_coffeeIce 감지
		p_btn_drinkIce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(true);
				panel4_2.setVisible(false);
				n_btn_drinkIce.setVisible(true);
				p_btn_drinkIce.setVisible(false);
				page_lb.setText("- 1 -");
				pn_panel.repaint();
			}
		});

		// 전체삭제 버튼 클릭 감지
		removeAll_btn.addActionListener(new CafeRemoveButtonListener(content_lb, totalprice_lb));

		// 결제하기 버튼 클릭 감지
		pay_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CafePayFrame(totalprice_lb);
			}
		});

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
