import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window4 extends JFrame  {
	public Window4(String title,
			int w, int h, Color bg) {
		super(title);
		Container c = getContentPane();
		c.setBackground(bg);
		setSize(w, h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.EAST);
		Font f = new Font("Helvetica", Font.PLAIN, 28);
		b.setFont(f);
		b.setBackground(Color.RED);
		b.setForeground(Color.BLACK);	
		JTextField tf = new JTextField("hello");
		tf.setBackground(Color.BLACK);
		tf.setForeground(Color.GREEN);
		tf.setFont(f);
		c.add(tf, BorderLayout.NORTH);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2, 5, 10));
		p.add(new JButton("1"));
		p.add(new JButton("2"));
		p.add(new JButton("3"));
		p.add(new JButton("4"));
		p.setBackground(new Color(90, 0, 128));
		c.add(p, BorderLayout.CENTER);

		setVisible(true);
	}
	public static void main(String[]a ) {
		Window4 w1 = new Window4("test", 800,300, Color.BLACK);
		Window4 w2 = new Window4("Hello", 400,200, Color.RED);
	}
}
