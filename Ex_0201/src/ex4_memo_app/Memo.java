package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo {
	public static void main(String[] args) {
		Frame frame = new Frame("�޸���");
		frame.setBounds(500, 200, 400, 500);
		frame.setLayout(null);	// �ڵ� ��ġ ����
		frame.setBackground(new Color(0, 200, 51));
		
		// Font title_font = new Font("�ü�ü", Font.BOLD, 20);
		// frame.setFont(title_font);
		
		Font font = new Font("�ü�ü", Font.PLAIN, 20);
		Font save_font = new Font("�ü�ü", Font.PLAIN, 15); 
		
		// ��ܿ� �ڸ����� ������Ʈ��---------------------------
		
		TextField tf = new TextField();
		tf.setBounds(10, 30, 300, 30);
		tf.setFont(font);
		
		Button btn = new Button("OK");
		btn.setBounds(320, 30, 70, 30);
		
		//---------------------------------------------
		
		
		// �߾ӿ� �ڸ����� ������Ʈ��---------------------------
		
		// �����ڿ� �������� �� ũ��� �ڸ��� ��ұ� ������ ���൵ ��� ����.
		// �������� ��ũ�ѹ��� ������ �־� �� �� �ִ�.
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 380, 370);
		ta.setFont(save_font);
		ta.setEditable(false);	// ta�� ���������� ���� �Է��ϴ� ���� ����
		
		// ���� ���� �� �ִ�.
		// ta.setText("�ȳ�\nhi hello\n�ݰ���"); 
		// ta.getText(); --> ta�� �����ִ� ������ �����´�.
		
		//---------------------------------------------
		
		
		// �ϴܿ� �ڸ����� ������Ʈ��---------------------------
		
		Button btnSave = new Button("����");
		btnSave.setBounds(15, 450, 180, 40);
		
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(205, 450, 180, 40);
		// �ݱ� ��ư�� �������� �����ϴ� ������ ���
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//---------------------------------------------
		
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		frame.setResizable(false);	// ������� �������� ũ�⸦ ����
		frame.setVisible(true);
		
		
	} // end of main
} // end of class
