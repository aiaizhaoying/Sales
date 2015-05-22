import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Window2 {
	public static void createWindow(String title, int w, int h, Color bg) {
		JFrame f = new JFrame(title);
//		f.setTitle(title);
		Container c = f.getContentPane();
		c.setBackground(bg);
		f.setSize(w, h);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[]a ) {
		createWindow("test", 800,300, Color.BLACK);
		createWindow("Hello", 400,200, Color.RED);
	}
}








