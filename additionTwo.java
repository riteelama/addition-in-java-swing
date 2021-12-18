package demoClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class additionTwo {
	public static void main (String [] args) {
	
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		
		JLabel first = new JLabel("First Number");
		final JTextField tf1 = new JTextField(40);
//		tf1.setBounds(50,50,150,20);
		JLabel second = new JLabel("Second Number");
		final JTextField tf2 = new JTextField(40);
//		tf2.setBounds(50,100,150,20);
		JButton b = new JButton("Add");
//		b.setBounds(50,150,150,20);
		JLabel result = new JLabel("Result");
		final JTextField tf3 = new JTextField(40);
//		tf3.setBounds(50,200,150,20);
		
		p.add(first);
		p.add(tf1);
		p.add(second);
		p.add(tf2);
		p.add(b);
		p.add(result);
		p.add(tf3);
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				int sum = a + b;
				tf3.setText(sum + "");
			}
		});
		
		
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new GridLayout());
	}
			

}
