import java.awt.*;

import javax.swing.*;

public class ButtonGrid extends JFrame {
	public ButtonGrid(int n) {
		Container c = getContentPane();
		c.setLayout(new GridLayout(n,n, 5, 5));
		for (int i = 0; i < n*n; i++) {
			JButton b = new JButton(i+"");
			c.add(b);
		}
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[]a ) {
		new ButtonGrid(10);
	}
}
