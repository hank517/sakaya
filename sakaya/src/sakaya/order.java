package sakaya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class order extends JFrame implements ActionListener{
	JTextField text_name;
	JTextField text_number;
	JLabel label_name;
	JLabel label_number;

	public static void main(String args[]){
		order order_window = new order("注文画面");
	    order_window.setVisible(true);
	}
	
	order(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		//JPanel p3 = new Jpanel();
		
		text_name = new JTextField("",5);
		text_number = new JTextField("", 5);
		label_name = new JLabel("酒の名前");
		label_number = new JLabel("本数");
		JButton button = new JButton("入荷");
		button.addActionListener(this);
		
		
		p1.add(label_name);
		p1.add(text_name);
		p2.add(label_number);
		p2.add(text_number);
		//p3.add(button);
		
		Container contentPane = getContentPane();
		contentPane.add(button, BorderLayout.SOUTH);
		contentPane.add(p1, BorderLayout.CENTER);
		//contentPane.add(p2, BorderLayout.CENTER);

	}
    
	
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		//入荷の処理
		
	}

}
