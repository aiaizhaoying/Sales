import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventWindow3 extends JFrame  {
	private JTextField tf;
	public EventWindow3(String title,
			int w, int h, Color bg) {
		super(title);
//		addWindowListener(l);
		Container c = getContentPane();
		c.setBackground(bg);
		setSize(w, h);
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "a");

			}
		});
		c.add(b, BorderLayout.EAST);
		Font f = new Font("Helvetica", Font.PLAIN, 28);
		b.setFont(f);
		b.setBackground(Color.RED);
		b.setForeground(Color.BLACK);	
		tf = new JTextField("hello");
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
		EventWindow3 w1 = new EventWindow3("test", 800,300, Color.BLACK);
		EventWindow3 w2 = new EventWindow3("Hello", 400,200, Color.RED);
	}
}
