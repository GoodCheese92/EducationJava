package test_ttt;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MakeScrollBar {

	JFrame frame;
	JPanel jp_label, jp_btn;
	JScrollPane scroll;
	JLabel label;
	JButton btn;
	int count = 1;
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gbc1;

	MakeScrollBar() {

		frame = new JFrame();
		frame.setLayout(null); // ���̾ƿ��� NULL�� �����Ѵ�
		frame.setSize(250, 200);

		jp_label = new JPanel();

		// ���� �� panel �� ���̾ƿ��� GridBag�� ����Ѵ�.
		jp_label.setLayout(Gbag);

		jp_label.setBackground(Color.green);

		label = new JLabel("0");
		create_form(label, 0, 0, 30, 10); // GridBagLayout �� ���� �Լ�ȣ��

		scroll = new JScrollPane(jp_label); // ��ũ���г��� ����
		scroll.setBounds(0, 0, 160, 160); // �����ӿ� ��ũ���г��� ��ġ�� ���Ѵ�

		jp_btn = new JPanel(); // ��ư �г�
		jp_btn.setBounds(160, 0, 80, 80);
		btn = new JButton("add"); // ��ư ����
		btn.addActionListener(new Add());
		jp_btn.add(btn);

		frame.add(scroll); // ��ũ���г� �߰�
		frame.add(jp_btn); // ��ư �г� �߰�

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

// ��ư ������

	class Add implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			JLabel label1 = new JLabel("" + count);
			JLabel label2 = new JLabel("" + count);
			create_form(label1, count * 30, 0, 30, 10);
			create_form(label2, 0, count++ * 30, 30, 10);

		}

	}

// �� �߰� 

	public void create_form(Component cmpt, int x, int y, int w, int h) {

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		this.Gbag.setConstraints(cmpt, gbc);
		jp_label.add(cmpt);
		jp_label.updateUI();

	}

	public static void main(String[] args) {
		MakeScrollBar bar = new MakeScrollBar();
	}

}