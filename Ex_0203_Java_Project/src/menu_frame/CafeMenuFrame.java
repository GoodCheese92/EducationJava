package menu_frame;

import java.awt.BorderLayout;
import java.awt.Color;
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
		// frame ����
		setBounds(400, 50, 1200, 900);
		setTitle("ī��");
		setLayout(null);
		setResizable(false);

		// topPanel ����--------------------------------------
		JPanel top_panel = new JPanel();
		GridLayout top_gl = new GridLayout(1, 0, 10, 10);
		top_panel.setBackground(new Color(153, 255, 153));
		top_panel.setBounds(10, 10, 1175, 65);
		// top_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		top_panel.setLayout(top_gl);

		// menu button ����
		JButton[] menu_btn = new JButton[4];
		CafeMenu cm = new CafeMenu();
		Font ct_font = new Font("hy�Ÿ���", Font.BOLD, 20);
		for (int i = 0; i < menu_btn.length; i++) {
			menu_btn[i] = new JButton(cm.getMenuCategory().get(i));
			menu_btn[i].setFont(ct_font);
			menu_btn[i].setBackground(Color.WHITE);
			top_panel.add(menu_btn[i]);
		} // for

		// �߰� �г� -------------------------------------------------

		// Panel1(Hot) ���� ------------------------------
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 80, 1175, 450);

		GridLayout gl = new GridLayout(2, 4, 10, 10);
		panel1.setLayout(gl);

		// panel1 Coffee(Hot)�� ��ư ����
		LoadCoffeeObject lco = new LoadCoffeeObject("CoffeeObjectSave(Hot)");

		// Ŀ��(hot) ���� ��ü �о����
		HashMap<Integer, JButton> hm1_btn = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm1_coffee = new HashMap<Integer, CoffeeProperties>();
		JButton[] btn1 = new JButton[8];
		for (int i = 0; i < btn1.length; i++) {
			btn1[i] = new JButton();
			hm1_btn.put(i, btn1[i]);
		} // for

		for (int i = 0; i < lco.getCoffee().length; i++) {
			ImageIcon img1 = new ImageIcon(lco.getCoffee()[i].getImgicon().getImage());
			btn1[i].setIcon(img1);
			btn1[i].setText("<html><center>" + lco.getCoffee()[i].getName() + "<br>" + lco.getCoffee()[i].getPrice()
					+ "��</center></html>");
			btn1[i].setHorizontalTextPosition(JButton.CENTER);
			btn1[i].setVerticalTextPosition(JButton.BOTTOM);
			hm1_coffee.put(i, lco.getCoffee()[i]);
		} // for
			// -------------------------------------------------

		// Panel2 Coffee (Ice) ���� --------------------------
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(10, 80, 1175, 450);

		panel2.setLayout(gl);

		// panel2 Coffee(Ice)�� ��ư ����
		LoadCoffeeObject lco2 = new LoadCoffeeObject("CoffeeObjectSave(Ice)");
		HashMap<Integer, JButton> hm2_btn = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm2_coffee = new HashMap<Integer, CoffeeProperties>();

		// Ŀ��(ice) ���� ��ü �о����
		JButton[] btn2 = new JButton[8];
		for (int i = 0; i < btn2.length; i++) {
			btn2[i] = new JButton();
			hm2_btn.put(i, btn2[i]);
		} // for

		for (int i = 0; i < lco2.getCoffee().length; i++) {
			ImageIcon img = new ImageIcon(lco2.getCoffee()[i].getImgicon().getImage());
			btn2[i].setIcon(img);
			btn2[i].setText("<html><center>" + lco2.getCoffee()[i].getName() + "<br>" + lco2.getCoffee()[i].getPrice()
					+ "��</center></html>");
			btn2[i].setHorizontalTextPosition(JButton.CENTER);
			btn2[i].setVerticalTextPosition(JButton.BOTTOM);
			hm2_coffee.put(i, lco2.getCoffee()[i]);
		} // for
			// -------------------------------------------------

		// Panel3 Drink (Hot) ���� --------------------------
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(10, 80, 1175, 450);

		panel3.setLayout(gl);

		// panel3 Drink(Hot)�� ��ư ����
		LoadCoffeeObject lco3 = new LoadCoffeeObject("DrinkObjectSave(Hot)");
		HashMap<Integer, JButton> hm3_btn = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm3_drink = new HashMap<Integer, CoffeeProperties>();

		// ����(hot) ���� ��ü �о����
		JButton[] btn3 = new JButton[8];
		for (int i = 0; i < btn3.length; i++) {
			btn3[i] = new JButton();
			hm3_btn.put(i, btn3[i]);
		} // for

		for (int i = 0; i < lco3.getDrink().length; i++) {
			ImageIcon img = new ImageIcon(lco3.getDrink()[i].getImgicon().getImage());
			btn3[i].setIcon(img);
			btn3[i].setText("<html><center>" + lco3.getDrink()[i].getName() + "<br>" + lco3.getDrink()[i].getPrice()
					+ "��</center></html>");
			btn3[i].setHorizontalTextPosition(JButton.CENTER);
			btn3[i].setVerticalTextPosition(JButton.BOTTOM);
			hm3_drink.put(i, lco3.getDrink()[i]);
		} // for
			// -------------------------------------------------

		// Panel4 Drink (Ice) ���� --------------------------
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(10, 80, 1175, 450);

		panel4.setLayout(gl);

		// panel4 Drink(Ice)�� ��ư ����
		LoadCoffeeObject lco4 = new LoadCoffeeObject("DrinkObjectSave(Ice)");
		HashMap<Integer, JButton> hm4_btn = new HashMap<Integer, JButton>();
		HashMap<Integer, CoffeeProperties> hm4_drink = new HashMap<Integer, CoffeeProperties>();

		// ����(hot) ���� ��ü �о����
		JButton[] btn4 = new JButton[8];
		for (int i = 0; i < btn4.length; i++) {
			btn4[i] = new JButton();
			hm4_btn.put(i, btn4[i]);
		} // for

		for (int i = 0; i < lco4.getDrink().length - 1; i++) {
			ImageIcon img = new ImageIcon(lco4.getDrink()[i].getImgicon().getImage());
			btn4[i].setIcon(img);
			btn4[i].setText("<html><center>" + lco4.getDrink()[i].getName() + "<br>" + lco4.getDrink()[i].getPrice()
					+ "��</center></html>");
			btn4[i].setHorizontalTextPosition(JButton.CENTER);
			btn4[i].setVerticalTextPosition(JButton.BOTTOM);
			hm4_drink.put(i, lco4.getDrink()[i]);
		} // for
			// -------------------------------------------------

		// ------------------------------------------ �߰��г� ��

		// next, previous button ����
		JButton n_btn = new JButton("->");
		n_btn.setBounds(1150, 250, 50, 100);
		n_btn.setVisible(true);

		// bottom panel ���� ----------------------------------
		JPanel bottom_panel = new JPanel();
		bottom_panel.setBackground(new Color(150, 150, 200, 200));
		bottom_panel.setBounds(10, 540, 1175, 320);
		bottom_panel.setLayout(null);

		// �޴� �� �� ������ text area ����
		JPanel Text_panel = new JPanel();
		Text_panel.setBounds(10, 10, 900, 240);
		Text_panel.setBackground(Color.white);
		GridBagLayout text_gbl = new GridBagLayout();
		GridBagConstraints text_gbc = new GridBagConstraints();
		text_gbc.fill = GridBagConstraints.BOTH;
		text_gbc.weighty = 0.1;

		
		JLabel[] content_lb = new JLabel[8 * 3];
		for (int i = 0; i < content_lb.length; i++) {
			content_lb[i] = new JLabel();
			if (i >= 3) {
				content_lb[i].setText("");
			}
			content_lb[i].setFont(new Font("�޸ո���", Font.BOLD, 13));
			content_lb[i].setEnabled(false);
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
			Text_panel.setLayout(text_gbl);
			Text_panel.add(content_lb[i], text_gbc);
		} // for
		content_lb[0].setText("�ֹ� ����");
		content_lb[1].setText("����");
		content_lb[2].setText("����");

		// �� ���� label area ����
		JPanel totalPrice_panel = new JPanel();
		totalPrice_panel.setLayout(null);
		totalPrice_panel.setBounds(10, 260, 900, 50);
		bottom_panel.add(totalPrice_panel);

		// �� ���� label
		Font totalPrice_font = new Font("hy������m", Font.BOLD, 20);
		JLabel totalprice_lb = new JLabel();
		totalprice_lb.setText("�� : 0��");
		totalprice_lb.setBounds(750, 5, 250, 40);
		totalprice_lb.setFont(totalPrice_font);
		totalPrice_panel.add(totalprice_lb);

		// ��ü���� �� �����ϱ� ��ư ����
		Font rm_font = new Font("hy������M", Font.BOLD, 20);
		JButton removeAll_btn = new JButton("<html><center>��ü<br>����<center></html>");
		removeAll_btn.setFont(rm_font);
		removeAll_btn.setBounds(920, 10, 250, 110);

		JButton pay_btn = new JButton("�� ��");
		pay_btn.setFont(rm_font);
		pay_btn.setBounds(920, 130, 250, 180);

		// ��ư �߰��ϱ�
		bottom_panel.add(Text_panel);
		bottom_panel.add(removeAll_btn);
		bottom_panel.add(pay_btn);

		// -------------------------------------------------

		// frame�� panel �߰�
		add(top_panel);
		add(panel1);
		add(panel2);
		panel2.setVisible(false);
		add(panel3);
		panel3.setVisible(false);
		add(panel4);
		panel4.setVisible(false);
		add(bottom_panel);
		add(n_btn);
		for (int i = 0; i < btn1.length; i++) {
			panel1.add(btn1[i]);
			panel2.add(btn2[i]);
			panel3.add(btn3[i]);
			panel4.add(btn4[i]);
		} // for

		// top_panel�� menu_button ��ư ����
		// Ŀ��(HOT) ��ư ����
		menu_btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				repaint();
			}
		});

		// Ŀ��(ICE) ��ư ����
		menu_btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				repaint();
			}
		});

		// ����(HOT) ��ư ����
		menu_btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				repaint();
			}
		});

		// ����(ICE) ��ư ����
		menu_btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				repaint();
			}
		});

		// --------------------------------------------------------

		// �߰� �г� coffee&drink ��ư ���� ------------------------------
		// coffee(Hot) ��ư ����
		int total_price = 0;
		CafeButtonClickListener[] cbcl = new CafeButtonClickListener[hm1_coffee.size()];
		for (int i = 0; i < hm1_coffee.size(); i++) {
			cbcl[i] = new CafeButtonClickListener(i, hm1_coffee, content_lb, totalprice_lb);
			btn1[i].addActionListener(cbcl[i]);
			
		} // for

		// coffee(Ice) ��ư ����
		for (int i = 0; i < hm2_coffee.size(); i++) {
			btn2[i].addActionListener(new CafeButtonClickListener(i, hm2_coffee, content_lb, totalprice_lb));
			total_price += hm2_coffee.get(i).getPrice();
		} // for

		// drink(Hot) ��ư ����
		for (int i = 0; i < hm3_drink.size(); i++) {
			btn3[i].addActionListener(new CafeButtonClickListener(i, hm3_drink, content_lb, totalprice_lb));
			total_price += hm3_drink.get(i).getPrice();
		} // for

		// drink(Ice) ��ư ����
		for (int i = 0; i < hm4_drink.size(); i++) {
			btn4[i].addActionListener(new CafeButtonClickListener(i, hm4_drink, content_lb, totalprice_lb));
			total_price += hm4_drink.get(i).getPrice();
		} // for

		// -------------------------�߰� �г� coffee&drink ��ư ���� ��
		
		// ��ü���� ��ư Ŭ�� ����
		removeAll_btn.addActionListener(new CafeRemoveButtonListener(content_lb, totalprice_lb));
		
		// �����ϱ� ��ư Ŭ�� ����
		pay_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CafePayFrame(totalprice_lb);
			}
		});
		
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
