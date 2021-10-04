package com.zeroxthree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	Window win = new Window();
	Panel pan = new Panel();
	win.add(pan);

	JTextField a1 = new JTextField();
	a1.setBounds(25,50,70, 20);

	JTextField a2 = new JTextField();
	a2.setBounds(100,50,70, 20);

	JTextField a3 = new JTextField();
	a3.setBounds(175,50,70, 20);

	JTextField b1 = new JTextField();
	b1.setBounds(25,100,70, 20);


	JTextField b2 = new JTextField();
	b2.setBounds(100,100,70, 20);
	JTextField b3 = new JTextField();
	b3.setBounds(175,100,70, 20);

	JTextField c1 = new JTextField();
        c1.setBounds(25,150,70, 20);
	JTextField c2 = new JTextField();
        c2.setBounds(100,150,70, 20);
	JTextField c3 = new JTextField();
	c3.setBounds(175,150,70, 20);

	JButton button = new JButton("Calculate");
	button.setBounds(60, 185, 150, 20);
	button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            /*
            a1.setText("");
            a2.setText("");
            a3.setText("");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            c1.setText("");
            c2.setText("");
            c3.setText("");
              */

            int a1_parse = Integer.parseInt(a1.getText());
            int a2_parse = Integer.parseInt(a2.getText());
            int a3_parse = Integer.parseInt(a3.getText());

            int b1_parse = Integer.parseInt(b1.getText());
            int b2_parse = Integer.parseInt(b2.getText());
            int b3_parse = Integer.parseInt(b3.getText());

            int c1_parse = Integer.parseInt(c1.getText());
            int c2_parse = Integer.parseInt(c2.getText());
            int c3_parse = Integer.parseInt(c3.getText());

            int determinant = (a1_parse * b2_parse * c3_parse) + (b1_parse * c2_parse * a3_parse)
                    + (a2_parse * b3_parse * c1_parse) - (a1_parse * b2_parse * c1_parse) - (a2_parse * b1_parse * c3_parse)
                    - (a1_parse * b3_parse * c2_parse);

            JOptionPane.showMessageDialog(win, "Your determinant is: " + determinant);

        }
    });


	pan.add(button);
	pan.add(a1);
	pan.add(a2);
	pan.add(a3);
	pan.add(b1);
	pan.add(b2);
	pan.add(b3);
	pan.add(c1);
	pan.add(c2);
	pan.add(c3);

	//win.pack();

    }
}
