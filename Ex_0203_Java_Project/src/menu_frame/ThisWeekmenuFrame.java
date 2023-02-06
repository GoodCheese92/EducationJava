package menu_frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import menu_information.ThisWeekMenu;

public class ThisWeekmenuFrame extends JFrame {
	public ThisWeekmenuFrame() {
		setBounds(800, 200, 900, 400);
		setTitle("�� ���� �Ĵ�");
		
		
		// panel ����
		JTextArea panel = new JTextArea();
		panel.setBackground(Color.WHITE);
		Font panel_font = new Font("�ü�ü", Font.BOLD, 30);
		panel.setFont(panel_font);
		JScrollPane scrollpane = new JScrollPane();
		

		// ���� ������ Label -----------------------------------
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setLayout(gbl);
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		gbc.gridwidth = 1;
		gbc.gridheight = 1;

		gbc.fill = GridBagConstraints.BOTH;

		JLabel[] la_date = new JLabel[24];
		for (int i = 0; i < la_date.length; i++) {
			// label ���� �� ����
			la_date[i] = new JLabel();
			la_date[i].setHorizontalAlignment(JLabel.CENTER);
			la_date[i].setBorder(new LineBorder(Color.BLACK));
			
			la_date[i].setBackground(Color.WHITE);

			gbc.gridx = i % 4;
			gbc.gridy = i / 4;

			la_date[i].setEnabled(false);
			
			
			// ��� ǥ ���� ����ϱ�
			ThisWeekMenu twk = new ThisWeekMenu();
			Font upperMenu_font = new Font("hy�Ÿ���", Font.BOLD, 20);
			if(i<4) {
				la_date[i].setForeground(Color.BLACK);
				la_date[i].setFont(upperMenu_font);
				la_date[i].setText(twk.getUpper_name()[i]);
			}
			
			// ���� ����ϱ�
			if(i%4 == 0 && i != 0) {
				la_date[i].setText(twk.getDay_of_week()[i/4 - 1]);
			}

			// �޴��ֱ�
			// ����
			if(i/4 != 0 && i%4 == 1) {
				la_date[i].setText("-");
			}
			// �߽�
			if(i/4 != 0 && i%4 == 2) {
				twk.menuGet("2�� 1���� �޴�.txt");
				la_date[i].setText(twk.getLunch().get(i/4 -1));
			}
			// ����
			if(i/4 != 0 && i%4 == 3) {
				la_date[i].setText(twk.getDinner_name()[i/4 - 1]);
			}
			
			
			gbl.setConstraints(la_date[i], gbc);
		} // end of for

		// --------------------------------------------------
		
		

		// frame�� ������Ʈ �߰�
		for (int i = 0; i < la_date.length; i++) {
			panel.add(la_date[i]);
		}
		scrollpane.setViewportView(panel);
		add(panel);

		// frame �ݱ��ư ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		setVisible(true);

	} // end of constructor

} // end of class
